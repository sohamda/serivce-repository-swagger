package soham.spring.serivcerepository.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-21T11:48:10.029318+01:00[Europe/Amsterdam]")
@Controller
@RequestMapping("${openapi.springbootTutrialAPIsProviderServiceCitizen.base-path:/iamsoham/springboottutorials/1.0.0}")
public class ProvidersApiController implements ProvidersApi {

    private final ProvidersApiDelegate delegate;

    public ProvidersApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ProvidersApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ProvidersApiDelegate() {});
    }

    @Override
    public ProvidersApiDelegate getDelegate() {
        return delegate;
    }

}
