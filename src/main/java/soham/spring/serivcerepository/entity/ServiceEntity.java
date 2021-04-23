package soham.spring.serivcerepository.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="service")
public class ServiceEntity {

    @Id
    private Integer id;
    private String name;
    private String description;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "provider_id")
    private ProviderEntity providerEntity;

}
