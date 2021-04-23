package soham.spring.serivcerepository.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name= "provider")
public class ProviderEntity {

    @Id
    private Integer id;
    private String name;
    private String description;
}
