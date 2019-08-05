package com.mphasis.playerrating;

public class CricketPlayer extends Player{
	private double averageRuns;

	public CricketPlayer(String firstName, String lastName, double averageRuns) {
		super(firstName, lastName);
		this.averageRuns = averageRuns;
	}

	@Override
	public int getRating() {
		int rating = (averageRuns > 55) ? 7 : (averageRuns > 50) ? 6 : (averageRuns > 40) ? 5 :
					 (averageRuns > 30) ? 3 : (averageRuns > 20) ? 2 : 1;
		return rating;
	}
	

}
