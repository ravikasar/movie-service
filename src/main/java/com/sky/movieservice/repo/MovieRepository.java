package com.sky.movieservice.repo;

/**
 * Created by santoshkasar on 19/06/18.
 */

import com.sky.movieservice.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MovieRepository extends JpaRepository<Movie, String> {
    Movie getById(String id);
}
