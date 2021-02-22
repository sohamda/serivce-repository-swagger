package soham.spring.serivcerepository.api;

import soham.spring.serivcerepository.model.ProviderServices;
import io.swagger.annotations.*;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ProviderserviceApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-21T11:48:10.029318+01:00[Europe/Amsterdam]")
public interface ProviderserviceApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /providerservice/{id} : gets a specific provider by id with Services
     * get by provider id along with all services
     *
     * @param id  (required)
     * @return Successfull response with Provider and Services info (status code 200)
     *         or Request is not correct. (status code 400)
     *         or There is no endpoint found. (status code 404)
     *         or Internal Server Error. (status code 500)
     * @see ProviderserviceApi#getProviderServicesByID
     */
    default ResponseEntity<ProviderServices> getProviderServicesByID(Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Loco Poco\", \"description\" : \"Everything for your house\", \"id\" : 20, \"services\" : [ { \"provider\" : { \"name\" : \"Loco Poco\", \"description\" : \"Everything for your house\", \"id\" : 20 }, \"name\" : \"3D Projector\", \"description\" : \"Projector for your house\", \"id\" : 20 }, { \"provider\" : { \"name\" : \"Loco Poco\", \"description\" : \"Everything for your house\", \"id\" : 20 }, \"name\" : \"3D Projector\", \"description\" : \"Projector for your house\", \"id\" : 20 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
