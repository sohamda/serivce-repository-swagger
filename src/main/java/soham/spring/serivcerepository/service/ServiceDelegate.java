package soham.spring.serivcerepository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import soham.spring.serivcerepository.api.ServicesApiDelegate;
import soham.spring.serivcerepository.entity.ServiceEntity;
import soham.spring.serivcerepository.mapper.ServiceMapper;
import soham.spring.serivcerepository.repository.ServiceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceDelegate implements ServicesApiDelegate {

    @Autowired
    private ServiceRepository serviceRepository;
    @Autowired
    private ServiceMapper serviceMapper;
    @Autowired
    private NativeWebRequest request;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Void> addService(soham.spring.serivcerepository.model.Service service) {
        serviceRepository.save(serviceMapper.toEntity(service));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<List<soham.spring.serivcerepository.model.Service>> getAllServices() {
        List<ServiceEntity> serviceEntities = serviceRepository.findAll();
        List<soham.spring.serivcerepository.model.Service> services = serviceMapper.toServices(serviceEntities);
        return ResponseEntity.status(HttpStatus.OK).body(services);
    }

    @Override
    public ResponseEntity<soham.spring.serivcerepository.model.Service> getServiceByID(Integer id) {
        soham.spring.serivcerepository.model.Service service = serviceMapper.toService(serviceRepository.findById(id).get());
        return ResponseEntity.status(HttpStatus.OK).body(service);
    }
}
