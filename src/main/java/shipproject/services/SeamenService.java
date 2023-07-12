package shipproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shipproject.models.Seaman;
import shipproject.repositories.SeamenRepository;
import shipproject.utils.exceptions.AlreadyAddedToBaseException;

import java.util.Optional;

@Service
public class SeamenService {

    private final SeamenRepository seamenRepository;

    @Autowired
    public SeamenService(SeamenRepository seamenRepository) {
        this.seamenRepository = seamenRepository;
    }

    public void addNewSeaman(Seaman seaman) {
        checkSeamanInDataBase(seaman.getPassportNumber());
        seamenRepository.save(seaman);
    }

    public Seaman showInfoAboutSeaman(Integer passportNumber) {
        return findSeamanByPassportNumber(passportNumber);
    }




    private void checkSeamanInDataBase(Integer passportNumber) {
        if(seamenRepository.findByPassportNumber(passportNumber).stream().findAny().isPresent()) throw new AlreadyAddedToBaseException("THAT_SEAMAN");
    }

    private Optional<Seaman> findSeamanByPassportNumber(Integer passportNumber) {
        return seamenRepository.findByPassportNumber(passportNumber).stream().findAny();
    }
}
