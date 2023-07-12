package shipproject.utils.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import shipproject.models.Vessel;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VesselDTO extends DTO {

    private CountryDTO country;
    private ShipOwnerDTO shipOwner;
    private String name;
    private Integer IMO;
    private String type;
    private PortDTO port;
    private String buildingDate;

    public VesselDTO(Integer IMO) {
        this.IMO = IMO;
    }

    public static VesselDTO convertToVesselDTO(Vessel vessel, ModelMapper modelMapper) {
        return modelMapper.map(vessel, VesselDTO.class);
    }

    public Vessel convertToVessel(VesselDTO vesselDTO, ModelMapper modelMapper) {
        return modelMapper.map(vesselDTO, Vessel.class);
    }
}
