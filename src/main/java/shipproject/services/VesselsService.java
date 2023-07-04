package shipproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shipproject.repositories.VesselsRepository;

@Service
public class VesselsService {

    private final VesselsRepository vesselsRepository;

    @Autowired
    public VesselsService(VesselsRepository vesselsRepository) {
        this.vesselsRepository = vesselsRepository;
    }
}

