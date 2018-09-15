package lk.icoder.fieldvalidation.controller;

import lk.icoder.fieldvalidation.constant.StatusConstants;
import lk.icoder.fieldvalidation.model.Company;
import lk.icoder.fieldvalidation.model.CompanyDetailsRequest;
import lk.icoder.fieldvalidation.model.Response;
import lk.icoder.fieldvalidation.model.Status;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Project field-validation
 * @Author DILAN on 9/15/2018
 */
@RestController
@RequestMapping(path = "/api/company")
public class RestApiController {

    @PostMapping(path = "/all")
    public ResponseEntity<Object> getCompanyDetails(@Valid @RequestBody CompanyDetailsRequest request) {
        Company company = new Company();
        company.setId(request.getId());
        company.setName(request.getName());
        company.setMobile(request.getMobile());
        company.setLocation(request.getLocation());
        Status errorDetails = new Status(StatusConstants.HttpConstants.OK.getCode(), "Success!");
        return new ResponseEntity<>(new Response<>(errorDetails, company), HttpStatus.OK);
    }
}
