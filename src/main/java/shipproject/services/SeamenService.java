package shipproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shipproject.repositories.SeamenRepository;

@Service
public class SeamenService {

    private final SeamenRepository seamenRepository;

    @Autowired
    public SeamenService(SeamenRepository seamenRepository) {
        this.seamenRepository = seamenRepository;
    }
}
