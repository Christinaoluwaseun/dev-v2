package com.christinaonasanwo.theo.music;

import java.util.ArrayList;

//MusicDAO will implement this interface

public interface IMusicDAO {

	public ArrayList<Music> getAllMusic();
	public Music getMusic(int musicId);
	public int addMusic( Music aMusic);
	public void updateMusic( Music aMusic);
	public void deleteMusic( Music aMusic);
	public String printMusic( int musicID);
	
}
