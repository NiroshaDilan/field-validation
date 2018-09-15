package lk.icoder.fieldvalidation.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @Project field-validation
 * @Author DILAN on 9/15/2018
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDetailsRequest {

    @NotBlank(message = "id is required")
    @Size(min=2, max=10, message = "id should be between 2 to 10 characters")
    private String id;

    @NotBlank(message = "name is required")
    private String name;

    @NotNull(message = "mobile is required")
    @Size(min=10, max=13, message = "mobile should be 10-13 digits (+919999999999)")
    @Pattern(regexp = "[\\s]*[0-9]*[1-9]+",message="mobile should be positive 10-13 digits")
    private String mobile;

    private String location;
}
