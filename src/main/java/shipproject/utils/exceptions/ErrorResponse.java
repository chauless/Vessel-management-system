package shipproject.utils.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import shipproject.utils.dto.DTO;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private String message;
    private long timestamp;

    public static List<?> whatIfEmpty(List<?> objects, String desc) {
        if (objects == null || objects.isEmpty()) throw new ListIsEmptyException(desc);
        else return objects;
    }

    public static void notUpdatedException(BindingResult bindingResult, Validator validator, DTO dto) {
        validator.validate(dto, bindingResult);
        if (bindingResult.hasErrors()) {
            throw new NotUpdatedException("Not updated");
        }
    }
}
