package com.github.gdeckers.citiesapi.countries.repository;

import com.github.gdeckers.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
