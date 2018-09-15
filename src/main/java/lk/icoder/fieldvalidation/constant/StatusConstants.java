package lk.icoder.fieldvalidation.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Project field-validation
 * @Author DILAN on 9/15/2018
 */
public class StatusConstants {

    @Getter
    @AllArgsConstructor
    public enum HttpConstants {

        CREATED(201, "Created"),
        OK(200, "Success"),
        CUSTOM_FILED_VALIDATION(400, "Bad Request"),
        NOT_FOUND(404, "Not Found"),
        INTERNAL_SERVER_ERROR(500, "System error! Please try after some time");

        private Integer code;
        private String desc;
    }
}
