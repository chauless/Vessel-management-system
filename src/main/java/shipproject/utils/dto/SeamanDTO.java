package shipproject.utils.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import shipproject.models.Seaman;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class SeamanDTO extends DTO {

    private CountryDTO citizenship;
    private VesselDTO vessel;
    private String fullName;
    private String position;
    private String birth;
    private String birthPlace;
    private Integer passportNumber;

    public static SeamanDTO convertToSeamanDTO(Seaman seaman, ModelMapper modelMapper) {
        return modelMapper.map(seaman, SeamanDTO.class);
    }

    public static Seaman convertToSeaman(SeamanDTO seamanDTO, ModelMapper modelMapper) {
        return modelMapper.map(seamanDTO, Seaman.class);
    }
}
