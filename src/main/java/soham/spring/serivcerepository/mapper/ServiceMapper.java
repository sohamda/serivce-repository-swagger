package soham.spring.serivcerepository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import soham.spring.serivcerepository.entity.ServiceEntity;
import soham.spring.serivcerepository.model.Service;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServiceMapper {

    @Mapping(source = "providerEntity", target = "provider")
    Service toService(ServiceEntity serviceEntity);

    List<Service> toServices(List<ServiceEntity> serviceEntities);

    @Mapping(source = "provider", target = "providerEntity")
    ServiceEntity toEntity(Service service);

}
