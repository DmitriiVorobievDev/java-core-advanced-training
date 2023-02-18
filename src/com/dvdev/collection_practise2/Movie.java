package com.dvdev.collection_practise2;

import java.util.Objects;

public class Movie {

    private int id;
    private int year;
    private int month;
    private String genre;
    private String rating;

    public Movie(int id, int year, int month, String genre, String rating) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id && year == movie.year && month == movie.month && Objects.equals(genre, movie.genre) && Objects.equals(rating, movie.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year, month, genre, rating);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", genre='" + genre + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }
}
