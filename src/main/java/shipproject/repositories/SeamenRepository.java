package shipproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shipproject.models.Seaman;

import java.util.List;

@Repository
public interface SeamenRepository extends JpaRepository<Seaman, Integer> {
    List<Seaman> findByPassportNumber(Integer passportNumber);
}
