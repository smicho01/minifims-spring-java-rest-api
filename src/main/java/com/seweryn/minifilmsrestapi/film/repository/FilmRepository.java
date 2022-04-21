package com.seweryn.minifilmsrestapi.film.repository;

import com.seweryn.minifilmsrestapi.film.model.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilmRepository extends MongoRepository<Film, String> {

}
