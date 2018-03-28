package com.christinaonasanwo.theo.music;

import java.util.ArrayList;
import java.util.Iterator;

import com.christinaonasanwo.theo.menu.ConsoleControls;
import com.christinaonasanwo.theo.user.User;

public class MusicConsoleListView {

	//what you have in here is from the music.java file variables
	ArrayList<Music> musicList;
	
	//this constructor is not set to do anything yet...you need 
	public MusicConsoleListView() {

	}
	
	
//the name of the arraylist is created here
	public void setMusicList( ArrayList<Music> MusicList) {
		this.musicList = musicList;
	}
	
	public void display() {
		
		System.out.println( ConsoleControls.ANSI_YELLOW_BRIGHT + "... PLAYLIST VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n");
		Iterator<Music> iterator = this.musicList.iterator(); //all the Music arraylist list has now inherited ITERATOR CLASS...putting it in a variavle called iterator
		//while the iterator (music list has next)
		while (iterator.hasNext()) {
			Music aMusic = (Music)iterator.next();
			aMusic.display();
			//aMUSIC will go and print whatever we have in the toString method
		}
	}


}
