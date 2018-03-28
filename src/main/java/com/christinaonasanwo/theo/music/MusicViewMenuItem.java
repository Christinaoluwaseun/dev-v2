package com.christinaonasanwo.theo.music;

import java.util.Scanner;

import com.christinaonasanwo.theo.data.DataManagerSQLite;
import com.christinaonasanwo.theo.menu.ConsoleControls;
import com.christinaonasanwo.theo.menu.IExecuatable;
import com.christinaonasanwo.theo.user.UserConsoleListView;
import com.christinaonasanwo.theo.user.UserController;
import com.christinaonasanwo.theo.user.UserDAO;

public class MusicViewMenuItem implements IExecuatable {

	Scanner input = new Scanner(System.in);
	 
	public MusicViewMenuItem() {}

	//@Override
	public void execute() {
		
		System.out.println( ConsoleControls.ANSI_YELLOW_BRIGHT + "... MUSIC VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n"+ MusicViewMenuItem.class.getName() + " has no MVC implementation.");
        System.out.println(" \n Press enter return to the main menu");
		this.input.nextLine();
		
		
		MusicDAO model = new MusicDAO( DataManagerSQLite.getInstance() );
		MusicConsoleListView view = new MusicConsoleListView();
		MusicController controller = new MusicController( view, model);
		controller.display();
	}

}
