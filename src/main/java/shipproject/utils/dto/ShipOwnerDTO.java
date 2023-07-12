package shipproject.utils.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import shipproject.models.ShipOwner;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShipOwnerDTO extends DTO {
    private CountryDTO country;
    private String name;
    private String description;

    public static ShipOwnerDTO convertToShipOwnerDTO(ShipOwner shipOwner, ModelMapper modelMapper) {
        return new ShipOwnerDTO(CountryDTO.convertToCountryDTO(shipOwner.getCountry(), modelMapper),
                shipOwner.getName(), shipOwner.getDescription());
    }
}
