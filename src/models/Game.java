package models;

public class Game {
	
	private String gameName;
	private String year;
	private int difficulty;
	
	
	public Game(String gameName, String year, int difficulty) {
		super();
		this.gameName = gameName;
		this.year = year;
		this.difficulty = difficulty;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public int getDifficulty() {
		return difficulty;
	}


	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}


	@Override
	public String toString() {
		return "Game [gameName=" + gameName + ", year=" + year + ", difficulty=" + difficulty + "]";
	}
	
	
	
}
