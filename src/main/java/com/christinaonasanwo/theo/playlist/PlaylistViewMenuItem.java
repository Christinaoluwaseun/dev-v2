package com.christinaonasanwo.theo.playlist;

import java.util.Scanner;

import com.christinaonasanwo.theo.data.DataManagerSQLite;
import com.christinaonasanwo.theo.menu.ConsoleControls;
import com.christinaonasanwo.theo.menu.IExecuatable;
import com.christinaonasanwo.theo.music.MusicConsoleListView;
import com.christinaonasanwo.theo.music.MusicDAO;

public class PlaylistViewMenuItem implements IExecuatable {

	Scanner input = new Scanner(System.in);
	 
	public PlaylistViewMenuItem() {}

	@Override
	public void execute() {
		
		System.out.println( ConsoleControls.ANSI_YELLOW_BRIGHT + "... PLAYLIST VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n" + PlaylistViewMenuItem.class.getName() + " has no MVC implementation.");
        System.out.println(" \n Press enter return to the main menu");
		this.input.nextLine();
		
		// create model, view & controller
		PlaylistDAO model = new PlaylistDAO(DataManagerSQLite.getInstance());
		PlaylistConsoleListView view = new PlaylistConsoleListView();
		PlaylistController controller = new PlaylistController( view, model);
		controller.display();
	}
}
