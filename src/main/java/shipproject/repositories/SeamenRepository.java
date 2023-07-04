package shipproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shipproject.models.Seaman;

@Repository
public interface SeamenRepository extends JpaRepository<Seaman, Integer> {
}
