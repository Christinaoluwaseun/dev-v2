package com.christinaonasanwo.theo.music;

import java.util.Scanner;

//import com.christinaonasanwo.theo.user.UserConsoleListView;
//import com.christinaonasanwo.theo.user.UserDAO;

public class MusicController {
	
	private MusicConsoleListView view;
	private MusicDAO model;
    Scanner input = new Scanner(System.in);
	
	public MusicController(MusicConsoleListView view, MusicDAO model) {
		this.view = view;
		this.model = model;
	}

	public void display() {
		
		view.setMusicList(model.getAllMusic());
		view.display();
        System.out.println(" \n Press enter return to the main menu");
		this.input.nextLine();
		
	}		

}
