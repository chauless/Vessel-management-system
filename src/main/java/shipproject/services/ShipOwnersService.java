package shipproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shipproject.repositories.ShipOwnersRepository;

@Service
public class ShipOwnersService {

    private final ShipOwnersRepository shipOwnersRepository;

    @Autowired
    public ShipOwnersService(ShipOwnersRepository shipOwnersRepository) {
        this.shipOwnersRepository = shipOwnersRepository;
    }
}
