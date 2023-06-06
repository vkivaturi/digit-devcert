package digit.web.controllers;


import digit.web.models.DeathRegistrationRequest;
import digit.web.models.DeathRegistrationResponse;
import digit.web.models.ErrorRes;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;

import org.egov.common.contract.request.RequestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import java.util.*;

    import javax.validation.constraints.*;
    import javax.validation.Valid;
    import javax.servlet.http.HttpServletRequest;
        import java.util.Optional;
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2023-06-04T14:11:41.668+05:30")

@Controller
    @RequestMapping("/death-services")
    public class V1ApiController{

        private final ObjectMapper objectMapper;

        private final HttpServletRequest request;

        @Autowired
        public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
        }

                @RequestMapping(value="/v1/registration/_create", method = RequestMethod.POST)
                public ResponseEntity<DeathRegistrationResponse> v1RegistrationCreatePost(@ApiParam(value = "Details for the new Death Registration Application(s) + RequestInfo meta data." ,required=true )  @Valid @RequestBody DeathRegistrationRequest deathRegistrationRequest) {
                        String accept = request.getHeader("Accept");
                            if (accept != null && accept.contains("application/json")) {
                            try {
                            return new ResponseEntity<DeathRegistrationResponse>(objectMapper.readValue("{  \"ResponseInfo\" : {    \"ver\" : \"ver\",    \"resMsgId\" : \"resMsgId\",    \"msgId\" : \"msgId\",    \"apiId\" : \"apiId\",    \"ts\" : 0,    \"status\" : \"SUCCESSFUL\"  },  \"DeathRegistrationApplications\" : [ {    \"timeOfDeath\" : 1,    \"addressOfDeceased\" : {      \"pincode\" : \"pincode\",      \"city\" : \"city\",      \"latitude\" : 5.962133916683182,      \"tenantId\" : \"tenantId\",      \"addressNumber\" : \"addressNumber\",      \"addressLine1\" : \"addressLine1\",      \"addressLine2\" : \"addressLine2\",      \"detail\" : \"detail\",      \"landmark\" : \"landmark\",      \"longitude\" : 5.637376656633329,      \"addressId\" : \"addressId\"    },    \"applicationNumber\" : \"applicationNumber\",    \"auditDetails\" : {      \"lastModifiedTime\" : 7,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 2    },    \"tenantId\" : \"tenantId\",    \"deceasedLastName\" : \"deceasedLastName\",    \"id\" : \"id\",    \"deceasedFirstName\" : \"deceasedFirstName\",    \"placeOfDeath\" : \"placeOfDeath\",    \"applicant\" : \"\"  }, {    \"timeOfDeath\" : 1,    \"addressOfDeceased\" : {      \"pincode\" : \"pincode\",      \"city\" : \"city\",      \"latitude\" : 5.962133916683182,      \"tenantId\" : \"tenantId\",      \"addressNumber\" : \"addressNumber\",      \"addressLine1\" : \"addressLine1\",      \"addressLine2\" : \"addressLine2\",      \"detail\" : \"detail\",      \"landmark\" : \"landmark\",      \"longitude\" : 5.637376656633329,      \"addressId\" : \"addressId\"    },    \"applicationNumber\" : \"applicationNumber\",    \"auditDetails\" : {      \"lastModifiedTime\" : 7,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 2    },    \"tenantId\" : \"tenantId\",    \"deceasedLastName\" : \"deceasedLastName\",    \"id\" : \"id\",    \"deceasedFirstName\" : \"deceasedFirstName\",    \"placeOfDeath\" : \"placeOfDeath\",    \"applicant\" : \"\"  } ]}", DeathRegistrationResponse.class), HttpStatus.NOT_IMPLEMENTED);
                            } catch (IOException e) {
                            return new ResponseEntity<DeathRegistrationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
                            }
                            }

                        return new ResponseEntity<DeathRegistrationResponse>(HttpStatus.NOT_IMPLEMENTED);
                }

                @RequestMapping(value="/v1/registration/_search", method = RequestMethod.POST)
                public ResponseEntity<DeathRegistrationRequest> v1RegistrationSearchPost(@NotNull @ApiParam(value = "Unique id for a tenant.", required = true) @Valid @RequestParam(value = "tenantId", required = true) String tenantId,@ApiParam(value = "Parameter to carry Request metadata in the request body"  )  @Valid @RequestBody RequestInfo requestInfo,@ApiParam(value = "Search based on status.") @Valid @RequestParam(value = "status", required = false) String status,@Size(max=50) @ApiParam(value = "Unique identifier of death registration application") @Valid @RequestParam(value = "ids", required = false) List<Long> ids,@Size(min=2,max=64) @ApiParam(value = "Unique application number for the Death Registration Application") @Valid @RequestParam(value = "applicationNumber", required = false) String applicationNumber) {
                        String accept = request.getHeader("Accept");
                            if (accept != null && accept.contains("application/json")) {
                            try {
                            return new ResponseEntity<DeathRegistrationRequest>(objectMapper.readValue("{  \"RequestInfo\" : {    \"userInfo\" : {      \"gender\" : \"gender\",      \"signature\" : \"signature\",      \"mobileNumber\" : \"mobileNumber\",      \"roles\" : [ {        \"code\" : \"code\",        \"tenantId\" : \"tenantId\",        \"name\" : \"name\",        \"description\" : \"description\",        \"id\" : \"id\"      }, {        \"code\" : \"code\",        \"tenantId\" : \"tenantId\",        \"name\" : \"name\",        \"description\" : \"description\",        \"id\" : \"id\"      } ],      \"correspondencePincode\" : \"correspondencePincode\",      \"emailId\" : \"emailId\",      \"locale\" : \"locale\",      \"uuid\" : \"uuid\",      \"bloodGroup\" : \"bloodGroup\",      \"password\" : \"password\",      \"id\" : 6,      \"permanentAddress\" : \"permanentAddress\",      \"pan\" : \"pan\",      \"accountLocked\" : true,      \"identificationMark\" : \"identificationMark\",      \"active\" : true,      \"photo\" : \"photo\",      \"userName\" : \"userName\",      \"aadhaarNumber\" : \"aadhaarNumber\",      \"fatherOrSpouseName\" : \"fatherOrSpouseName\",      \"tenantId\" : \"tenantId\",      \"userType\" : \"userType\",      \"salutation\" : \"salutation\",      \"permanentCity\" : \"permanentCity\",      \"permanentPincode\" : \"permanentPincode\"    },    \"ver\" : \"ver\",    \"requesterId\" : \"requesterId\",    \"authToken\" : \"authToken\",    \"action\" : \"action\",    \"msgId\" : \"msgId\",    \"correlationId\" : \"correlationId\",    \"apiId\" : \"apiId\",    \"did\" : \"did\",    \"key\" : \"key\",    \"ts\" : 0  },  \"DeathRegistrationApplications\" : [ {    \"timeOfDeath\" : 1,    \"addressOfDeceased\" : {      \"pincode\" : \"pincode\",      \"city\" : \"city\",      \"latitude\" : 5.962133916683182,      \"tenantId\" : \"tenantId\",      \"addressNumber\" : \"addressNumber\",      \"addressLine1\" : \"addressLine1\",      \"addressLine2\" : \"addressLine2\",      \"detail\" : \"detail\",      \"landmark\" : \"landmark\",      \"longitude\" : 5.637376656633329,      \"addressId\" : \"addressId\"    },    \"applicationNumber\" : \"applicationNumber\",    \"auditDetails\" : {      \"lastModifiedTime\" : 7,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 2    },    \"tenantId\" : \"tenantId\",    \"deceasedLastName\" : \"deceasedLastName\",    \"id\" : \"id\",    \"deceasedFirstName\" : \"deceasedFirstName\",    \"placeOfDeath\" : \"placeOfDeath\",    \"applicant\" : \"\"  }, {    \"timeOfDeath\" : 1,    \"addressOfDeceased\" : {      \"pincode\" : \"pincode\",      \"city\" : \"city\",      \"latitude\" : 5.962133916683182,      \"tenantId\" : \"tenantId\",      \"addressNumber\" : \"addressNumber\",      \"addressLine1\" : \"addressLine1\",      \"addressLine2\" : \"addressLine2\",      \"detail\" : \"detail\",      \"landmark\" : \"landmark\",      \"longitude\" : 5.637376656633329,      \"addressId\" : \"addressId\"    },    \"applicationNumber\" : \"applicationNumber\",    \"auditDetails\" : {      \"lastModifiedTime\" : 7,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 2    },    \"tenantId\" : \"tenantId\",    \"deceasedLastName\" : \"deceasedLastName\",    \"id\" : \"id\",    \"deceasedFirstName\" : \"deceasedFirstName\",    \"placeOfDeath\" : \"placeOfDeath\",    \"applicant\" : \"\"  } ]}", DeathRegistrationRequest.class), HttpStatus.NOT_IMPLEMENTED);
                            } catch (IOException e) {
                            return new ResponseEntity<DeathRegistrationRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
                            }
                            }

                        return new ResponseEntity<DeathRegistrationRequest>(HttpStatus.NOT_IMPLEMENTED);
                }

                @RequestMapping(value="/v1/registration/_update", method = RequestMethod.POST)
                public ResponseEntity<DeathRegistrationResponse> v1RegistrationUpdatePost(@ApiParam(value = "Details for the new (s) + RequestInfo meta data." ,required=true )  @Valid @RequestBody DeathRegistrationRequest deathRegistrationRequest) {
                        String accept = request.getHeader("Accept");
                            if (accept != null && accept.contains("application/json")) {
                            try {
                            return new ResponseEntity<DeathRegistrationResponse>(objectMapper.readValue("{  \"ResponseInfo\" : {    \"ver\" : \"ver\",    \"resMsgId\" : \"resMsgId\",    \"msgId\" : \"msgId\",    \"apiId\" : \"apiId\",    \"ts\" : 0,    \"status\" : \"SUCCESSFUL\"  },  \"DeathRegistrationApplications\" : [ {    \"timeOfDeath\" : 1,    \"addressOfDeceased\" : {      \"pincode\" : \"pincode\",      \"city\" : \"city\",      \"latitude\" : 5.962133916683182,      \"tenantId\" : \"tenantId\",      \"addressNumber\" : \"addressNumber\",      \"addressLine1\" : \"addressLine1\",      \"addressLine2\" : \"addressLine2\",      \"detail\" : \"detail\",      \"landmark\" : \"landmark\",      \"longitude\" : 5.637376656633329,      \"addressId\" : \"addressId\"    },    \"applicationNumber\" : \"applicationNumber\",    \"auditDetails\" : {      \"lastModifiedTime\" : 7,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 2    },    \"tenantId\" : \"tenantId\",    \"deceasedLastName\" : \"deceasedLastName\",    \"id\" : \"id\",    \"deceasedFirstName\" : \"deceasedFirstName\",    \"placeOfDeath\" : \"placeOfDeath\",    \"applicant\" : \"\"  }, {    \"timeOfDeath\" : 1,    \"addressOfDeceased\" : {      \"pincode\" : \"pincode\",      \"city\" : \"city\",      \"latitude\" : 5.962133916683182,      \"tenantId\" : \"tenantId\",      \"addressNumber\" : \"addressNumber\",      \"addressLine1\" : \"addressLine1\",      \"addressLine2\" : \"addressLine2\",      \"detail\" : \"detail\",      \"landmark\" : \"landmark\",      \"longitude\" : 5.637376656633329,      \"addressId\" : \"addressId\"    },    \"applicationNumber\" : \"applicationNumber\",    \"auditDetails\" : {      \"lastModifiedTime\" : 7,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 2    },    \"tenantId\" : \"tenantId\",    \"deceasedLastName\" : \"deceasedLastName\",    \"id\" : \"id\",    \"deceasedFirstName\" : \"deceasedFirstName\",    \"placeOfDeath\" : \"placeOfDeath\",    \"applicant\" : \"\"  } ]}", DeathRegistrationResponse.class), HttpStatus.NOT_IMPLEMENTED);
                            } catch (IOException e) {
                            return new ResponseEntity<DeathRegistrationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
                            }
                            }

                        return new ResponseEntity<DeathRegistrationResponse>(HttpStatus.NOT_IMPLEMENTED);
                }

        }
