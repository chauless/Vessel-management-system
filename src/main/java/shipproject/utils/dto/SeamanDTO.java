package shipproject.utils.dto;

import org.modelmapper.ModelMapper;
import shipproject.models.Seaman;

public class SeamanDTO {

    public static SeamanDTO convertToSeamanDTO(Seaman seaman, ModelMapper modelMapper) {
        return modelMapper.map(seaman, SeamanDTO.class);
    }

    public Seaman convertToSeaman(SeamanDTO seamanDTO, ModelMapper modelMapper) {
        return modelMapper.map(seamanDTO, Seaman.class);
    }
}
