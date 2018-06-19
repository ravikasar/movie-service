package com.sky.movieservice;

import com.sky.movieservice.entity.Movie;
import com.sky.movieservice.repo.MovieRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

@SpringBootApplication
public class MovieServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieServiceApplication.class, args);
    }

    @Bean
    ApplicationRunner init(MovieRepository repository) {
        AtomicInteger id = new AtomicInteger(1);
        return args -> {
            Stream.of("Star Wars", "Fantastic Four").forEach(name -> {
                Movie movie = new Movie();
                movie.setName(name);
                movie.setId("" + id.getAndIncrement());
                movie.setParentalControlLevel("PG");
                repository.save(movie);
            });
            repository.save(new Movie("3", "Gangs Of Newyork", "15"));
            repository.save(new Movie("4", "ToyStory", "U"));
            repository.findAll().forEach(System.out::println);

        };
    }
}
