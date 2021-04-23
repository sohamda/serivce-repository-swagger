package soham.spring.serivcerepository.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
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

    @IterableMapping(qualifiedByName = "toServiceWithoutProvider")
    List<Service> toServicesWithoutProviders(List<ServiceEntity> serviceEntities);

    @Named("toServiceWithoutProvider")
    @Mapping(ignore = true, target = "provider")
    Service toServiceWithoutProvider(ServiceEntity serviceEntity);


}
