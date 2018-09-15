package lk.icoder.fieldvalidation.exception;

import lk.icoder.fieldvalidation.constant.StatusConstants;
import lk.icoder.fieldvalidation.model.Response;
import lk.icoder.fieldvalidation.model.Status;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @Project field-validation
 * @Author DILAN on 9/15/2018
 */
@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status, WebRequest request) {
        Status errorDetail = new Status(StatusConstants.HttpConstants.CUSTOM_FILED_VALIDATION.getCode(),
                ex.getBindingResult().getFieldError().getDefaultMessage());
        return new ResponseEntity<>(new Response<>(errorDetail, null), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<Object> handleUserNotFoundException(NotFoundException ex, WebRequest request) {
        Status errorDetails = new Status(StatusConstants.HttpConstants.NOT_FOUND.getCode(), ex.getMessage());
        return new ResponseEntity<>(new Response<>(errorDetails, null), HttpStatus.NOT_FOUND);
    }
}
