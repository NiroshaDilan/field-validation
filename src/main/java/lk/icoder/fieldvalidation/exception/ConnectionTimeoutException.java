package lk.icoder.fieldvalidation.exception;

import lk.icoder.fieldvalidation.constant.StatusConstants;
import lombok.Getter;

/**
 * @Project field-validation
 * @Author DILAN on 9/15/2018
 */
@Getter
public class ConnectionTimeoutException extends Exception {

    private StatusConstants.HttpConstants status;

    public ConnectionTimeoutException(StatusConstants.HttpConstants status) {
        super(status.getDesc(), null);
        this.status = status;
    }
}
