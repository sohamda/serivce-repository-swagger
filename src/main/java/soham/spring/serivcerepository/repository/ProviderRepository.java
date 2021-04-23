package soham.spring.serivcerepository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soham.spring.serivcerepository.entity.ProviderEntity;

public interface ProviderRepository extends JpaRepository<ProviderEntity, Integer> {

}
