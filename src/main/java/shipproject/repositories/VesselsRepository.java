package shipproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shipproject.models.Vessel;

@Repository
public interface VesselsRepository extends JpaRepository<Vessel, Integer> {
}
