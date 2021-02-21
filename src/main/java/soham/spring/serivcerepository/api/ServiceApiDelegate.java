package soham.spring.serivcerepository.api;

import soham.spring.serivcerepository.model.Service;
import soham.spring.serivcerepository.model.ServiceRequestDTO;
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
 * A delegate to be called by the {@link ServiceApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-20T15:01:30.040636+01:00[Europe/Amsterdam]")

public interface ServiceApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /service : adds an service
     * Adds a service to the system
     *
     * @param serviceRequestDTO Service to add (optional)
     * @return Successfull response with Service info (status code 200)
     *         or Request is not correct. (status code 400)
     *         or There is no endpoint found. (status code 404)
     *         or #/components/responses/409ItemExists (status code 409)
     *         or Internal Server Error. (status code 500)
     * @see ServiceApi#addService
     */
    default ResponseEntity<Service> addService(ServiceRequestDTO serviceRequestDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"provider\" : { \"name\" : \"Loco Poco\", \"description\" : \"Everything for your house\", \"id\" : 20 }, \"name\" : \"3D Projector\", \"description\" : \"Projector for your house\", \"id\" : 20 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /service/{id} : gets a specific service by id
     * get by service id
     *
     * @param id  (required)
     * @return Successfull response with Service info (status code 200)
     *         or Request is not correct. (status code 400)
     *         or There is no endpoint found. (status code 404)
     *         or Internal Server Error. (status code 500)
     * @see ServiceApi#getServiceByID
     */
    default ResponseEntity<Service> getServiceByID(Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"provider\" : { \"name\" : \"Loco Poco\", \"description\" : \"Everything for your house\", \"id\" : 20 }, \"name\" : \"3D Projector\", \"description\" : \"Projector for your house\", \"id\" : 20 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
