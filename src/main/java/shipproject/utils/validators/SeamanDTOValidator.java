package shipproject.utils.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import shipproject.utils.dto.SeamanDTO;

@Component
public class SeamanDTOValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return SeamanDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        SeamanDTO seaman = (SeamanDTO) target;

        if (seaman.getCitizenship() == null || seaman.getCitizenship().getName().isEmpty()) {
            errors.rejectValue("country", "",
                    "Seaman cannot to be without citizenship");
        }

        if (seaman.getFullName() == null || seaman.getFullName().isEmpty()) {
            errors.rejectValue("fullName", "",
                    "Name for seaman should be entered");
        }

        if (seaman.getVessel() == null || seaman.getVessel().getIMO() == null ||
                String.valueOf(seaman.getVessel().getIMO()).length() != 7) {
            errors.rejectValue("vessel", "", "Vessel IMO should be entered");
        }

        if (seaman.getPosition() == null || seaman.getPosition().isEmpty()) {
            errors.rejectValue("position", "",
                    "Seaman cannot to be boarded hasn't position");
        }

        if (seaman.getBirth() == null) {
            errors.rejectValue("birth", "", "Enter birth date");
        }

        if (seaman.getBirthPlace() == null || seaman.getBirthPlace().isEmpty()) {
            errors.rejectValue("birthPlace", "", "Enter birth place");
        }

        if (seaman.getPassportNumber().toString().length() != 7 || seaman.getPassportNumber() == null) {
            errors.rejectValue("passportNumber", "",
                    "Seaman cannot to be without passport. Or number has more or less than 7 numbers");
        }
    }
}
