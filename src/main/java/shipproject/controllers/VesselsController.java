package shipproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shipproject.services.VesselsService;
import shipproject.utils.dto.VesselDTO;

import java.util.List;

@RestController
@RequestMapping("/vessels")
public class VesselsController {

    private final VesselsService vesselsService;

    @Autowired
    public VesselsController(VesselsService vesselsService) {
        this.vesselsService = vesselsService;
    }

    @GetMapping("/{IMO}")
    public ResponseEntity<VesselDTO> getVessel(@PathVariable Integer IMO) {
        return ResponseEntity.ok(VesselDTO.convertToVesselDTO(vesselsService.findVesselByIMO(IMO)));
    }

//    @GetMapping("/crew/{IMO}")

//    @GetMapping("/shipowner/{IMO}")

    @GetMapping("/type/{type}")
    public ResponseEntity<List<VesselDTO>> getVesselsByType(@PathVariable String type) {
        return ResponseEntity.ok(VesselDTO.convertToVesselDTOList(vesselsService.findVesselsByType(type)));
    }
}
