package com.github.gdeckers.citiesapi.countries;

import com.github.gdeckers.citiesapi.countries.Country;
import com.github.gdeckers.citiesapi.countries.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")

public class CountryResource {

    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    //Lista com todos os paises
//    @GetMapping
//    public List<Country> countries(){
//        return repository.findAll();
//    }

    @GetMapping
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }

    //buscando por um id e se erro retorna 500
//    @GetMapping("/{id}")
//    public Country getOne(@PathVariable Long id){
//        Optional<Country> optional = repository.findById(id);
//        return optional.get();
//    }

    //buscando por um id, e se erro retorna 404
    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<Country> optional = repository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
