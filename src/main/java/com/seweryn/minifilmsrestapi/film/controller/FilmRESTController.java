package com.seweryn.minifilmsrestapi.film.controller;

import com.seweryn.minifilmsrestapi.film.model.Film;
import com.seweryn.minifilmsrestapi.film.service.FilmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/films")
public class FilmRESTController {

    private final FilmService filmService;

    public FilmRESTController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/{filmId}")
    public Optional<Film> getOneMiniFilm (@PathVariable("filmId") String filmId) {
        return filmService.getOne(filmId);
    }

    @GetMapping
    public List<Film> getAllMiniFilms () {
        return filmService.getAll();
    }

    @PostMapping
    public Film saveMiniFilm (@RequestBody Film film) {
        return filmService.saveFilm(film);
    }

    // Delete
    @DeleteMapping("/{filmId}")
    public void deleteMiniFilm (@PathVariable String filmId) {
        filmService.deleteFilm(filmId);
    }

    // Update
    @PutMapping("/{filmId}")
    public void updateMiniFilm (@PathVariable String filmId, @RequestBody Film updatedFilm) {
        filmService.updateFilm(filmId, updatedFilm);
    }

}
