package soham.spring.serivcerepository.api;

import soham.spring.serivcerepository.model.Provider;
import soham.spring.serivcerepository.model.ProviderRequestDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ProviderApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-20T15:01:30.040636+01:00[Europe/Amsterdam]")

public interface ProviderApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /provider : adds a Provider
     * Adds a Provider to the system
     *
     * @param providerRequestDTO Provider item to add (optional)
     * @return Successfull response with Provider info (status code 200)
     *         or Request is not correct. (status code 400)
     *         or There is no endpoint found. (status code 404)
     *         or #/components/responses/409ItemExists (status code 409)
     *         or Internal Server Error. (status code 500)
     * @see ProviderApi#addProvider
     */
    default ResponseEntity<Provider> addProvider(ProviderRequestDTO providerRequestDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Loco Poco\", \"description\" : \"Everything for your house\", \"id\" : 20 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /provider/{id} : gets a specific provider by id
     * get by provider id
     *
     * @param id  (required)
     * @return Successfull response with Provider info (status code 200)
     *         or Request is not correct. (status code 400)
     *         or There is no endpoint found. (status code 404)
     *         or Internal Server Error. (status code 500)
     * @see ProviderApi#getProviderByID
     */
    default ResponseEntity<Provider> getProviderByID(Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Loco Poco\", \"description\" : \"Everything for your house\", \"id\" : 20 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
