package com.github.gdeckers.citiesapi.states.repositories;

import com.github.gdeckers.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
