package com.billdesk.assignment1;

import java.awt.Choice;
import java.util.*;

interface MovieService{
	void displayMoviesByRating(ArrayList<Movie> movies);
	void displayMoviesSortedByRating(ArrayList<Movie> movies);
	void displayMovieNames(ArrayList<Movie> movies);
	void countMoviesByGenre(ArrayList<Movie> movies, String genre);
	void displayHighestRatedMovie(ArrayList<Movie> movies);
	void displayLowestRatedMovie(ArrayList<Movie> movies);
}

class MovieServiceImpl implements MovieService{
	@Override
	public void displayMoviesByRating(ArrayList<Movie> movies) {

	    movies.stream()
	          .filter(movie -> movie.getRating() > 4.0)
	          .forEach(Movie::display);
	}
	@Override
	public void displayMoviesSortedByRating(ArrayList<Movie> movies) {

	    movies.stream()
	          .sorted((m1, m2) -> Double.compare(m1.getRating(), m2.getRating()))
	          .forEach(Movie::display);
	}
	@Override
	public void displayMovieNames(ArrayList<Movie> movies) {

	    movies.stream()
	          .map(movie -> movie.getMovieName())
	          .forEach(System.out::println);
	}
	@Override
	public void countMoviesByGenre(ArrayList<Movie> movies, String genre) {

	    long count = movies.stream()
	                       .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
	                       .count();

	    System.out.println("Total Movies : " + count);
	}
	@Override
	public void displayHighestRatedMovie(ArrayList<Movie> movies) {

	    movies.stream()
	          .max((m1, m2) -> Double.compare(m1.getRating(), m2.getRating()))
	          .ifPresent(Movie::display);
	}
	@Override
	public void displayLowestRatedMovie(ArrayList<Movie> movies) {

	    movies.stream()
	          .min((m1, m2) -> Double.compare(m1.getRating(), m2.getRating()))
	          .ifPresent(Movie::display);
	}
}

class Movie{
	int movieID; 
	String movieName; 
	String genre; 
	double rating;
	public Movie(int movieID, String movieName, String genre, double rating) {
		this.movieID = movieID;
		this.movieName = movieName;
		this.genre = genre;
		this.rating = rating;
	}
	public int getMovieID() {
	    return movieID;
	}

	public String getMovieName() {
	    return movieName;
	}

	public String getGenre() {
	    return genre;
	}

	public double getRating() {
	    return rating;
	}
	public void display() {
	    System.out.println(movieID + "\t" + movieName + "\t" + genre + "\t" + rating);
	}
}
public class Assignment11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter number of movies: ");
		int n = scanner.nextInt(); 
		ArrayList<Movie> m = new ArrayList<>(); 
		for(int i = 0; i < n; i++) {
			System.out.println("Movie " + (i+1));
			System.out.println("Movie ID:");
			int movieId = scanner.nextInt();
			System.out.println("Movie Name:");
			String movieName = scanner.next(); 
			System.out.println("Genre:");
			String genre = scanner.next(); 
			System.out.println("Rating");
			double rating = scanner.nextDouble(); 
			Movie obj = new Movie(movieId, movieName, genre, rating);
			m.add(obj); 
		}
		int choice; 
		MovieService service = new MovieServiceImpl();
		do {
			System.out.println("============= Movie Collection Analyzer =============");
			System.out.println("1. Display Movies with Rating Greater than 4");
			System.out.println("2. Display Movies Sorted by Rating");
			System.out.println("3. Display Movie Names");
			System.out.println("4. Count Movies by Genre");
			System.out.println("5. Display Highest Rated Movie");
			System.out.println("6. Display Lowest Rated Movie");
			System.out.println("7. Exit");
			System.out.println("=====================================================");
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt(); 
			switch(choice) {
			case 1:
			    service.displayMoviesByRating(m);
			    break;

			case 2:
			    service.displayMoviesSortedByRating(m);
			    break;

			case 3:
			    service.displayMovieNames(m);
			    break;

			case 4:
			    System.out.println("Enter Genre:");
			    String genre = scanner.next();
			    service.countMoviesByGenre(m, genre);
			    break;

			case 5:
			    service.displayHighestRatedMovie(m);
			    break;

			case 6:
			    service.displayLowestRatedMovie(m);
			    break;

			case 7:
			    System.out.println("Thank You");
			    break;

			default:
			    System.out.println("Invalid Choice");
			}
			
		}while(choice != 7);
	}
}
