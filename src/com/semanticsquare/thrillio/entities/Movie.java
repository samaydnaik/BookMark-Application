package com.semanticsquare.thrillio.entities;

import java.util.Arrays;

import com.semanticsquare.thrillio.constants.MovieGenre;

public class Movie extends Bookmark{
	private int releaseYear;
	private String[] cast;
	private String[] directors;

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String[] getCast() {
		return cast;
	}

	public void setCast(String[] cast) {
		this.cast = cast;
	}

	public String[] getDirectors() {
		return directors;
	}

	public void setDirectors(String[] directors) {
		this.directors = directors;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getImdbRatings() {
		return imdbRatings;
	}

	public void setImdbRatings(double imdbRatings) {
		this.imdbRatings = imdbRatings;
	}

	private String genre;
	private double imdbRatings;

	@Override
	public String toString() {
		return "Movie [releaseYear=" + releaseYear + ", cast=" + Arrays.toString(cast) + ", directors="
				+ Arrays.toString(directors) + ", genre=" + genre + ", imdbRatings=" + imdbRatings + "]";
	}

	@Override
	public boolean isKidFriendlyEligible() {
		// TODO Auto-generated method stub
		if(genre.equals(MovieGenre.HORROR) || genre.contentEquals(MovieGenre.THRILLERS))
	{
	return false;	
	}
		return true;
	}
}
