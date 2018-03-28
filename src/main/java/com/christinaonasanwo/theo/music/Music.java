package com.christinaonasanwo.theo.music;

public class Music {

	
	private int musicID;
	private String songName;
	private String artist;
	private String url;
	
	
	public Music (int musicID, String songName, String artist, String url) {
		this.musicID = musicID;
		this.songName=songName;
		this.artist= artist;
		this.url = url;
		
		
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getmusicID() {
		return musicID;
	}

	public void setMusic(int musicID) {
		this.musicID = musicID;
	}
	
	public String getsongName() {
		return songName;
	}

	public void setsongName(String songName) {
		this.songName = songName;
	}

	public String getartist() {
		return artist;
	}

	public void setartist(String artist) {
		this.artist = artist;
	}
	
	
	
	
	@Override
	public String toString() {
		return String.format(
				"Music [musicID=%s, songName=%s, artist=%s,url=%s]"
				,musicID, songName, artist, url);
	}
	
	public void display() {
		System.out.println(this.toString());
	}
}
