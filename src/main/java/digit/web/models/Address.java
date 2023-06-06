package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

/**
 * Representation of a address. Indiavidual APIs may choose to extend from this using allOf if more details needed to be added in their case. 
 */
@ApiModel(description = "Representation of a address. Indiavidual APIs may choose to extend from this using allOf if more details needed to be added in their case. ")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2023-06-04T14:11:41.668+05:30")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address   {
        @JsonProperty("tenantId")
        private String tenantId = null;

        @JsonProperty("latitude")
        private Double latitude = null;

        @JsonProperty("longitude")
        private Double longitude = null;

        @JsonProperty("addressId")
        private String addressId = null;

        @JsonProperty("addressNumber")
        private String addressNumber = null;

        @JsonProperty("addressLine1")
        private String addressLine1 = null;

        @JsonProperty("addressLine2")
        private String addressLine2 = null;

        @JsonProperty("landmark")
        private String landmark = null;

        @JsonProperty("city")
        private String city = null;

        @JsonProperty("pincode")
        private String pincode = null;

        @JsonProperty("detail")
        private String detail = null;
        
        @JsonProperty("registrationId")
        private String registrationId = null;

}

