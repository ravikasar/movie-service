package com.sky.movieservice;

import com.sky.movieservice.exception.TechnicalFailureException;
import com.sky.movieservice.exception.TitleNotFoundException;

/**
 * Created by santoshkasar on 19/06/18.
 */
public interface MovieService {
    String getParentalControlLevel(String movieId)
            throws TitleNotFoundException,
            TechnicalFailureException;
}
