package shipproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shipproject.models.Vessel;

import java.util.List;

@Repository
public interface VesselsRepository extends JpaRepository<Vessel, Integer> {
    List<Vessel> findByIMO(Integer imo);

    List<Vessel> findVesselsByVesselType(String type);

}
