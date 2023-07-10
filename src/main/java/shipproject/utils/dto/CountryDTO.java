package shipproject.utils.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import shipproject.models.Country;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountryDTO {

    public static CountryDTO convertToCountryDTO(Country country, ModelMapper modelMapper) {
        return modelMapper.map(country, CountryDTO.class);
    }
}
