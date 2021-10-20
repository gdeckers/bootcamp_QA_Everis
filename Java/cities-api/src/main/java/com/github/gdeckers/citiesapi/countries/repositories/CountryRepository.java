package com.github.gdeckers.citiesapi.countries.repositories;

import com.github.gdeckers.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
