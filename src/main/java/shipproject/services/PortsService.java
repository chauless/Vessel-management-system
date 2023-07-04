package shipproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shipproject.repositories.PortsRepository;

@Service
public class PortsService {

    private final PortsRepository portsRepository;

    @Autowired
    public PortsService(PortsRepository portsRepository) {
        this.portsRepository = portsRepository;
    }
}
