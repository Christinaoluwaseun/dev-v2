package com.christinaonasanwo.theo.user;

import com.christinaonasanwo.theo.data.DataManagerSQLite;
import com.christinaonasanwo.theo.menu.IExecuatable;

public class UserViewMenuItem implements IExecuatable {
	
	public UserViewMenuItem(){}
	
	public void execute()
	{
		//System.out.println("I ran: " + UserViewMenuItem.class.getName());
		
		//Get the User data
		UserDAO model = new UserDAO( DataManagerSQLite.getInstance() );
		UserConsoleListView view = new UserConsoleListView();
		UserController controller = new UserController( view, model);
		controller.display();
		
	}
	
}
