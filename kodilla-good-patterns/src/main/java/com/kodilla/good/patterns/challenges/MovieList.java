package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

class MovieList {

    public static void main(String[] args) {
            MovieStore movies = new MovieStore();
            String result = movies.getMovies().values().stream()
                    .map(Objects::toString)
                    .collect(Collectors.joining(","));

            System.out.println(result);

    }

}
