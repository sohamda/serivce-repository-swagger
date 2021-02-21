package soham.spring.serivcerepository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soham.spring.serivcerepository.entity.ServiceEntity;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Integer> {
}
