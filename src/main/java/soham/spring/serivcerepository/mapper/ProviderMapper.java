package soham.spring.serivcerepository.mapper;

import org.mapstruct.Mapper;
import soham.spring.serivcerepository.entity.ProviderEntity;
import soham.spring.serivcerepository.model.Provider;
import soham.spring.serivcerepository.model.ProviderServices;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProviderMapper {

    Provider toProvider(ProviderEntity providerEntity);

    List<Provider> toProviders(List<ProviderEntity> providerEntities);

    ProviderEntity toEntity(Provider provider);

    ProviderServices toProviderServices(ProviderEntity providerEntity);
}
