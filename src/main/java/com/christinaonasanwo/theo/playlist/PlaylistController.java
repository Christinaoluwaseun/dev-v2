package com.christinaonasanwo.theo.playlist;

import java.util.Scanner;

//import com.christinaonasanwo.theo.music.MusicConsoleListView;
//import com.christinaonasanwo.theo.music.MusicDAO;

public class PlaylistController {
	
	private PlaylistConsoleListView view;
	private PlaylistDAO model;
    Scanner input = new Scanner(System.in);
	
	public PlaylistController(PlaylistConsoleListView view,PlaylistDAO model) {
		this.view = view;
		this.model = model;
	}

	public void display() {
		
		view.setPlaylistList(model.getAllPlaylist());
		view.display();
        System.out.println(" \n Press enter return to the main menu");
		this.input.nextLine();
		
	}		


}
