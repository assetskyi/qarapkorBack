package net.proselyte.jwtappdemo.repository;

import net.proselyte.jwtappdemo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
