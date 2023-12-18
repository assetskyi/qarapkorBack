package net.proselyte.jwtappdemo.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.proselyte.jwtappdemo.model.Movie;
import net.proselyte.jwtappdemo.repository.MovieRepository;
import net.proselyte.jwtappdemo.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;


    @Override
    public List<Movie> getAll() {
        List<Movie> result = movieRepository.findAll();
        log.info("IN getAll - {} movies found", result.size());
        return result;
    }
}
