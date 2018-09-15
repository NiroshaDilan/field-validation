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

        SUCCESS(1, "Success"),
        CUSTOM_FILED_VALIDATION(2, null),
        NOT_FOUND(404, "Not Found"),
        INTERNAL_SERVER_ERROR(0, "System error! Please try after some time");

        private Integer code;
        private String desc;
    }
}
