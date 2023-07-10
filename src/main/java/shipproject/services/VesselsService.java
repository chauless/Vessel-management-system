package shipproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shipproject.models.Seaman;
import shipproject.models.ShipOwner;
import shipproject.models.Vessel;
import shipproject.repositories.VesselsRepository;

import java.util.Arrays;
import java.util.List;

import static shipproject.utils.exceptions.ErrorResponse.whatIfEmpty;

@Service
public class VesselsService {

    private final VesselsRepository vesselsRepository;

    @Autowired
    public VesselsService(VesselsRepository vesselsRepository) {
        this.vesselsRepository = vesselsRepository;
    }

    public Vessel findVesselByIMO(Integer imo) {
        return vesselsRepository.findByIMO(imo).stream().findAny()
                .orElseThrow(() -> new RuntimeException("Vessel not found"));
    }

    public List<Vessel> findVesselsByType(String type) {
        return vesselsRepository.findVesselsByVesselType(type);
    }

    public List<Seaman> getInfoAboutCrew(Integer imo) {
        return (List<Seaman>) whatIfEmpty(findVesselByIMO(imo).getSeamen(), "Vessel crew information");
    }

    public ShipOwner getVesselShipOwner(Integer imo) {
        return findVesselByIMO(imo).getShipOwner();
    }
}

