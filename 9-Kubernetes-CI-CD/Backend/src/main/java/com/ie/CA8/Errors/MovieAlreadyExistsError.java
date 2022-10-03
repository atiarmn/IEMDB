package com.ie.CA8.Errors;

public class MovieAlreadyExistsError extends Exception {
    public String getMessage() {
        return "The movie has already been added to the watchlist";
    }
}