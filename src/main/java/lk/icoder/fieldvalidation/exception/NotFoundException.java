package lk.icoder.fieldvalidation.exception;

import lk.icoder.fieldvalidation.constant.StatusConstants;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Project field-validation
 * @Author DILAN on 9/15/2018
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
@Getter
public class NotFoundException extends RuntimeException {

    private StatusConstants.HttpConstants status;

    public NotFoundException(StatusConstants.HttpConstants status) {
        super(status.getDesc(), null);
        this.status = status;
    }
}
