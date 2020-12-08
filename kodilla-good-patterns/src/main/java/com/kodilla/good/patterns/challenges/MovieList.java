package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class MovieList {

    public static void main(String[] args) {
            MovieStore movies = new MovieStore();
            movies.getMovies().values().stream()
                    .forEach(name -> System.out.print(" ! " + name));

        }

}
