package com.sky.movieservice;

import com.sky.movieservice.exception.TechnicalFailureException;
import com.sky.movieservice.exception.TitleNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by santoshkasar on 19/06/18.
 */
@RestController
@RequestMapping(value = "/movieservice")
@CrossOrigin(origins = "http://localhost:4200")
public class ParentalLevelController {

    MovieService movieService;
    ParentalControlScale scale;

    public ParentalLevelController(MovieService movieService, ParentalControlScale scale) {
        this.movieService = movieService;
        this.scale = scale;
    }

    @RequestMapping(value = "{userParentalControl}/{movieId}")
    public boolean canViewMovie(@PathVariable("userParentalControl") String userParentalControl, @PathVariable("movieId") String movieId) {
        try {
            return scale.getScale(movieService.getParentalControlLevel(movieId)) <=
                    scale.getScale(userParentalControl);
        } catch (TitleNotFoundException e) {
            return false;
        } catch (TechnicalFailureException e) {
            return false;
        }
    }
}
