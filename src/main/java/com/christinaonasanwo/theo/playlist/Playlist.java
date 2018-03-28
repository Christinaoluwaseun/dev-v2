package com.christinaonasanwo.theo.playlist;


public class Playlist {
	
	private int playlistID;
	private int userID;
	private int musicID;
	
	
	public Playlist (int playlistID, int userID, int musicID) {
		this.musicID = musicID;
		this.userID=userID;
		this.musicID= musicID;
		
		
	}
	
	public int getuserID() {
		return userID;
	}

	public void setMusic(int musicID) {
		this.musicID = musicID;
	}
	
	public int getplaylistID() {
		return playlistID;
	}

	public void stplaylistID(int playlistID) {
		this.playlistID = playlistID;
	}

	public int getmusicID() {
		return musicID;
	}

	public void musicID(int musicID) {
		this.musicID = musicID;
	}
	
	
	
	
	@Override
	public String toString() {
		return String.format(
				"Playlist [playlistID=%s, userID=%s, musicID=%s,]"
				,musicID, userID, musicID);
	}
	
	public void display() {
		System.out.println(this.toString());
	}
}


