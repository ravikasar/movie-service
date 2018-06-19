package com.sky.movieservice.entity;

/**
 * Created by santoshkasar on 19/06/18.
 */

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Movie {
    @Id
    private String id;
    private
    @NonNull
    String name;
    private
    @NonNull
    String parentalControlLevel;

    public Movie(String id, String name, String parentalControlLevel) {
        this.id = id;
        this.name = name;
        this.parentalControlLevel = parentalControlLevel;
    }

}
