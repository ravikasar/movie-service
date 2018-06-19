package com.sky.movieservice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by santoshkasar on 19/06/18.
 */
public class ParentalControlScale {

    private Map<String, Integer> scale = new HashMap<>();

    public ParentalControlScale() {
        scale.put("U", 1);
        scale.put("PG", 2);
        scale.put("12", 3);
        scale.put("15", 4);
        scale.put("18", 5);
    }

    public Integer getScale(String parentalConrolLevel) {
        return scale.containsKey(parentalConrolLevel.toUpperCase()) ? scale.get(parentalConrolLevel.toUpperCase()) : -1;
    }
}
