package soham.spring.serivcerepository.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-21T11:48:10.029318+01:00[Europe/Amsterdam]")
@Controller
@RequestMapping("${openapi.springbootTutrialAPIsProviderServiceCitizen.base-path:/iamsoham/springboottutorials/1.0.0}")
public class ServicesApiController implements ServicesApi {

    private final ServicesApiDelegate delegate;

    public ServicesApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ServicesApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ServicesApiDelegate() {});
    }

    @Override
    public ServicesApiDelegate getDelegate() {
        return delegate;
    }

}
