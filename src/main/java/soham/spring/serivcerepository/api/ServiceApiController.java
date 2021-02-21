package soham.spring.serivcerepository.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-20T15:01:30.040636+01:00[Europe/Amsterdam]")

@Controller
@RequestMapping("${openapi.springbootTutrialAPIsProviderServiceCitizen.base-path:/iamsoham/springboottutorials/1.0.0}")
public class ServiceApiController implements ServiceApi {

    private final ServiceApiDelegate delegate;

    public ServiceApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ServiceApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ServiceApiDelegate() {});
    }

    @Override
    public ServiceApiDelegate getDelegate() {
        return delegate;
    }

}
