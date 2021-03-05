package soham.spring.serivcerepository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import soham.spring.serivcerepository.api.ProviderserviceApiDelegate;
import soham.spring.serivcerepository.entity.ProviderEntity;
import soham.spring.serivcerepository.entity.ServiceEntity;
import soham.spring.serivcerepository.mapper.ProviderMapper;
import soham.spring.serivcerepository.mapper.ServiceMapper;
import soham.spring.serivcerepository.model.ProviderServices;
import soham.spring.serivcerepository.repository.ProviderRepository;
import soham.spring.serivcerepository.repository.ServiceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderServicesDelegate implements ProviderserviceApiDelegate {

    @Autowired
    private ProviderRepository providerRepository;
    @Autowired
    private ServiceRepository serviceRepository;
    @Autowired
    private ProviderMapper providerMapper;
    @Autowired
    private ServiceMapper serviceMapper;

    @Autowired
    private NativeWebRequest request;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<ProviderServices> getProviderServicesByID(Integer id) {

        Optional<ProviderEntity> provider = providerRepository.findById(id);
        if(provider.isPresent()) {
            ProviderServices providerServices = providerMapper.toProviderServices(provider.get());
            List<ServiceEntity> serviceEntityList = serviceRepository.findAllByProviderEntity(provider.get());

            providerServices.setServices(serviceMapper.toServicesWithoutProviders(serviceEntityList));
            return ResponseEntity.status(HttpStatus.OK).body(providerServices);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
