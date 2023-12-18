package net.proselyte.jwtappdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "movies")
public class Movie {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "release_year")
    private int releaseYear;
    @Column(name = "description")
    private String description;
    @Column(name = "cover_url")
    private String coverUrl;
    @Column(name = "duration")
    private int duration;
    @Column(name = "genre")
    private String genre;
    @Column(name = "price")
    private int price;
    @Column(name = "api_link")
    private String apiLink;
}
