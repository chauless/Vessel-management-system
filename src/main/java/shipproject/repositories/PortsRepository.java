package shipproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shipproject.models.Port;

@Repository
public interface PortsRepository extends JpaRepository<Port, String> {
}
