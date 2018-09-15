package lk.icoder.fieldvalidation.exception;

import lk.icoder.fieldvalidation.constant.StatusConstants;
import lombok.Getter;

/**
 * @Project field-validation
 * @Author DILAN on 9/15/2018
 */
@Getter
public class ServiceException extends RuntimeException {

    private StatusConstants.HttpConstants status;

    public ServiceException(StatusConstants.HttpConstants status) {
        super(status.getDesc(), null);
        this.status = status;
    }
}
