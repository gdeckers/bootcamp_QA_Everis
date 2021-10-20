package com.github.gdeckers.citiesapi.states;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {

    private StateRepository repository;

    public StateResource(StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> states() {
        return repository.findAll();
    }
}
