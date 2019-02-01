package address_book;

import menu.MenuItem;

public class Exit extends MenuItem {

	public Exit(int id, String name) {
		super(id, name);
	}

	public void doSelected(){
		System.out.println("Closing The Application..............!!!!!!!!!!!!");
		System.out.println("Application Closed");
		System.exit(0);
	}
}
