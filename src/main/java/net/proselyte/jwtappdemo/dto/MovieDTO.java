package net.proselyte.jwtappdemo.dto;

import lombok.Data;
import net.proselyte.jwtappdemo.model.Movie;

@Data
public class MovieDTO {
    private Long id;
    private String title;
    private int releaseYear;
    private String description;
    private String coverUrl;
    private int duration;
    private String genre;
    private int price;
    private String apiLink;

    public static MovieDTO toDto(Movie movie){
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setId(movie.getId());
        movieDTO.setTitle(movie.getTitle());
        movieDTO.setReleaseYear(movie.getReleaseYear());
        movieDTO.setDescription(movie.getDescription());
        movieDTO.setCoverUrl(movie.getCoverUrl());
        movieDTO.setDuration(movie.getDuration());
        movieDTO.setGenre(movie.getGenre());
        movieDTO.setPrice(movie.getPrice());
        movieDTO.setApiLink(movie.getApiLink());
        return movieDTO;
    }
}