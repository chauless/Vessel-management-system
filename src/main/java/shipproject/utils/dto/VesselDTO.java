package shipproject.utils.dto;

import org.modelmapper.ModelMapper;
import shipproject.models.Vessel;

public class VesselDTO {

    public static VesselDTO convertToVesselDTO(Vessel vessel, ModelMapper modelMapper) {
        return modelMapper.map(vessel, VesselDTO.class);
    }

    public Vessel convertToVessel(VesselDTO vesselDTO, ModelMapper modelMapper) {
        return modelMapper.map(vesselDTO, Vessel.class);
    }
}
