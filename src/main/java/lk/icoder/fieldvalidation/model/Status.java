package lk.icoder.fieldvalidation.model;

import lk.icoder.fieldvalidation.constant.StatusConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Project field-validation
 * @Author DILAN on 9/15/2018
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Status {

    public Integer code;
    public String message;

    public Status(StatusConstants.HttpConstants httpConstants) {
        this.code = httpConstants.getCode();
        this.message = httpConstants.getDesc();
    }
}
