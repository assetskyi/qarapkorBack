package net.proselyte.jwtappdemo.rest;


import lombok.RequiredArgsConstructor;
import net.proselyte.jwtappdemo.dto.MovieDTO;
import net.proselyte.jwtappdemo.model.Movie;
import net.proselyte.jwtappdemo.service.impl.MovieServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/movies/")
public class MovieRestController {
    private final MovieServiceImpl movieService;

    @GetMapping
    public List<MovieDTO> getMovies() {
        List<Movie> movies = movieService.getAll();
        List<MovieDTO> result = new ArrayList<>();
        for (Movie movie:movies){
            result.add(MovieDTO.toDto(movie));
        }

        return result;
    }

}
