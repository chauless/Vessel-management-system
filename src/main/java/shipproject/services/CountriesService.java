package shipproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shipproject.models.Country;
import shipproject.repositories.CountriesRepository;

import java.util.List;

@Service
public class CountriesService {

    private final CountriesRepository countriesRepository;

    @Autowired
    public CountriesService(CountriesRepository countriesRepository) {
        this.countriesRepository = countriesRepository;
    }

    private List<Country> findAll() {
        return countriesRepository.findAll();
    }


}
