package soham.spring.serivcerepository.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import soham.spring.serivcerepository.entity.ProviderEntity;
import soham.spring.serivcerepository.entity.ServiceEntity;

import java.util.List;
import java.util.Optional;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Integer> {

    public List<ServiceEntity> findAllByProviderEntity(ProviderEntity providerEntity);

    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "providerEntity"
            }
    )
    public List<ServiceEntity> findAll();

    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "providerEntity"
            }
    )
    public Optional<ServiceEntity> findById(Integer id);
}
