package soham.spring.serivcerepository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soham.spring.serivcerepository.entity.ProviderEntity;
import soham.spring.serivcerepository.entity.ServiceEntity;

import java.util.List;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Integer> {

    public List<ServiceEntity> findAllByProviderEntity(ProviderEntity providerEntity);
}
