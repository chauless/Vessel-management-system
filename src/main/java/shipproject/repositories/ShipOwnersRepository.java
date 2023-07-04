package shipproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shipproject.models.ShipOwner;

@Repository
public interface ShipOwnersRepository extends JpaRepository<ShipOwner, String> {
}
