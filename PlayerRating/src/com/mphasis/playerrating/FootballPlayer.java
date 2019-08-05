package com.mphasis.playerrating;

public class FootballPlayer extends Player{
	private int goals;
	FootballPlayer(String firstName, String lastName, int goals){
		super(firstName,lastName);
		this.goals = goals;
	}
	@Override
	public int getRating() {
		int rating = (goals > 20) ? 5 : (goals > 15) ? 4 : (goals > 10) ?
				     3 : (goals > 5) ? 2 : 1;
		return rating;
	}
	
}

