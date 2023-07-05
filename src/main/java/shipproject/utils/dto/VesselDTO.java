package shipproject.utils.dto;

import org.modelmapper.ModelMapper;
import shipproject.models.Vessel;

public class VesselDTO {

    private ModelMapper modelMapper;

    public VesselDTO() {
        this.modelMapper = new ModelMapper();
    }

    public static VesselDTO convertToVesselDTO(Vessel vessel) {
        return this.modelMapper.map(vessel, VesselDTO.class);
    }

    public Vessel convertToVessel(VesselDTO vesselDTO) {
        return this.modelMapper.map(vesselDTO, Vessel.class);
    }
}
