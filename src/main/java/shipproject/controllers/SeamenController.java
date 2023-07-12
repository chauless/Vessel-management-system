package shipproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import shipproject.services.SeamenService;
import shipproject.utils.dto.SeamanDTO;
import shipproject.utils.exceptions.NotCreatedException;
import shipproject.utils.validators.SeamanDTOValidator;

import static shipproject.utils.exceptions.ErrorResponse.notCreatedException;

@RestController
@RequestMapping("/seamen")
public class SeamenController {

    private final SeamenService seamenService;
    private final ModelMapper modelMapper;
    private final SeamanDTOValidator seamanDTOValidator;

    @Autowired
    public SeamenController(SeamenService seamenService, ModelMapper modelMapper) {
        this.seamenService = seamenService;
        this.modelMapper = modelMapper;
        this.seamanDTOValidator = new SeamanDTOValidator();
    }

    @PostMapping
    public ResponseEntity<HttpStatus> addNewSeaman(@RequestBody SeamanDTO seamanDTO,
                                                   BindingResult bindingResult) {
        notCreatedException(bindingResult, seamanDTOValidator, seamanDTO);
        seamenService.addNewSeaman(SeamanDTO.convertToSeaman(seamanDTO, modelMapper));
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{passportNumber}")
    public ResponseEntity<Object> showInfoAboutSeaman(@PathVariable Integer passportNumber) {
        return ResponseEntity.ok(SeamanDTO.convertToSeamanDTO
                (seamenService.showInfoAboutSeaman(passportNumber), modelMapper));
    }
}
