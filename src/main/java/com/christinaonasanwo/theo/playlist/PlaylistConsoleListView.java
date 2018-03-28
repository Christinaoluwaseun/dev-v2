package com.christinaonasanwo.theo.playlist;

import java.util.ArrayList;
import java.util.Iterator;

import com.christinaonasanwo.theo.menu.ConsoleControls;
import com.christinaonasanwo.theo.music.Music;

public class PlaylistConsoleListView {
	
	// DATA
		//............................................................
		//declare objects
		
ArrayList<Playlist> playList;
	
	public PlaylistConsoleListView() {

	}

	public void setPlaylistList( ArrayList<Playlist> Playlist) {
		this.playList = playList;
	}
	
	public void display() {
		
		System.out.println( ConsoleControls.ANSI_YELLOW_BRIGHT + "... PLAYLIST VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n");
		Iterator<Playlist> iterator = this.playList.iterator();
		while (iterator.hasNext()) {
			Playlist aPlaylist = 
				(Playlist)iterator.next();
			 aPlaylist.display(); //aMusic was defined here
			System.out.println(aPlaylist);
		}
	}


		
		
		
		
		


}
