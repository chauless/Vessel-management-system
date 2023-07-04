package shipproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shipproject.models.Country;

@Repository
public interface CountriesRepository extends JpaRepository<Country, String> {

}
