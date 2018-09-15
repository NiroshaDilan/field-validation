package lk.icoder.fieldvalidation.model;

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
public class Response<T> {

    private Status status;
    private T data;
}
