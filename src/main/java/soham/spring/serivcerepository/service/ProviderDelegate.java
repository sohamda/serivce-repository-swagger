package soham.spring.serivcerepository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import soham.spring.serivcerepository.api.ProvidersApiDelegate;
import soham.spring.serivcerepository.entity.ProviderEntity;
import soham.spring.serivcerepository.mapper.ProviderMapper;
import soham.spring.serivcerepository.model.Provider;
import soham.spring.serivcerepository.repository.ProviderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderDelegate implements ProvidersApiDelegate {

    @Autowired
    private ProviderRepository providerRepository;
    @Autowired
    private ProviderMapper providerMapper;
    @Autowired
    private NativeWebRequest request;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Void> addProvider(Provider provider) {
        providerRepository.save(providerMapper.toEntity(provider));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<List<Provider>> getAllProviders() {
        return ResponseEntity.status(HttpStatus.OK).body(providerMapper.toProviders(providerRepository.findAll()));
    }

    @Override
    public ResponseEntity<Provider> getProviderByID(Integer id) {
        Optional<ProviderEntity> provider = providerRepository.findById(id);
        if(provider.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(providerMapper.toProvider(provider.get()));
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
