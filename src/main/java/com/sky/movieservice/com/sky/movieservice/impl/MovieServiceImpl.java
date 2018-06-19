package com.sky.movieservice.com.sky.movieservice.impl;

import com.sky.movieservice.MovieService;
import com.sky.movieservice.entity.Movie;
import com.sky.movieservice.exception.TechnicalFailureException;
import com.sky.movieservice.exception.TitleNotFoundException;
import com.sky.movieservice.repo.MovieRepository;

/**
 * Created by santoshkasar on 19/06/18.
 */
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepo;

    public MovieServiceImpl(MovieRepository movieRepo) {
        this.movieRepo = movieRepo;
    }


    @Override
    public String getParentalControlLevel(String movieId) throws TitleNotFoundException, TechnicalFailureException {
        Movie movie = movieRepo.getById(movieId);
        if (movie != null && movie.getParentalControlLevel() != null) {
            return movie.getParentalControlLevel();
        } else if (movie != null && movie.getParentalControlLevel() == null) {
            throw new TechnicalFailureException();
        }
        throw new TitleNotFoundException();
    }

}
