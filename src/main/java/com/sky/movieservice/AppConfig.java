package com.sky.movieservice;

import com.sky.movieservice.com.sky.movieservice.impl.MovieServiceImpl;
import com.sky.movieservice.repo.MovieRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by santoshkasar on 19/06/18.
 */
@Configuration
public class AppConfig {

    @Bean
    public MovieService getMovieService(MovieRepository movieRepository) {
        return new MovieServiceImpl(movieRepository);
    }

    @Bean
    public ParentalControlScale getParentalControlScale() {
        return new ParentalControlScale();
    }

}
