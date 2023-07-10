package shipproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import shipproject.services.VesselsService;
import shipproject.utils.dto.SeamanDTO;
import shipproject.utils.dto.ShipOwnerDTO;
import shipproject.utils.dto.VesselDTO;

import java.util.List;
import java.util.stream.Collectors;

import static shipproject.utils.exceptions.ErrorResponse.notCreatedException;
import static shipproject.utils.exceptions.ErrorResponse.notUpdatedException;

@RestController
@RequestMapping("/vessels")
public class VesselsController {

    private final VesselsService vesselsService;
    private final ModelMapper modelMapper;

    @Autowired
    public VesselsController(VesselsService vesselsService, ModelMapper modelMapper) {
        this.vesselsService = vesselsService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/{IMO}")
    public ResponseEntity<VesselDTO> getVessel(@PathVariable Integer IMO) {
        return ResponseEntity.ok(VesselDTO.convertToVesselDTO(vesselsService.findVesselByIMO(IMO), modelMapper));
    }

    @GetMapping("/crew/{IMO}")
    public ResponseEntity<List<SeamanDTO>> getCrew(@PathVariable Integer IMO) {
        return ResponseEntity.ok(vesselsService.getInfoAboutCrew(IMO).stream()
                .map(seaman -> SeamanDTO.convertToSeamanDTO(seaman, modelMapper))
                .collect(Collectors.toList()));
    }

    @GetMapping("/shipowner/{IMO}")
    public ResponseEntity<ShipOwnerDTO> getVeselShipOwner(@PathVariable Integer IMO) {
        return ResponseEntity.ok(ShipOwnerDTO.convertToShipOwnerDTO
                (vesselsService.getVesselShipOwner(IMO), modelMapper));
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<List<VesselDTO>> getVesselsByType(@PathVariable String type) {
        return ResponseEntity.ok(vesselsService.findVesselsByType(type).stream()
                .map(vessel -> VesselDTO.convertToVesselDTO(vessel, modelMapper))
                .collect(Collectors.toList()));
    }

    @PutMapping("/{IMO}")
    public ResponseEntity<VesselDTO> updateVessel(@PathVariable Integer IMO,
                                                  @RequestBody VesselDTO vesselDTO,
                                                  BindingResult bindingResult) {
        notUpdatedException(bindingResult, vesselDTOValidator, vesselDTO);
        return ResponseEntity.ok(VesselDTO.convertToVesselDTO
                (vesselsService.updateVessel(IMO, VesselDTO.convertToVessel(vesselDTO, modelMapper)), modelMapper));
    }
}
