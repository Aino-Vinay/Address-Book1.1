package address_book;

import java.util.Scanner;

import domain.Backend;
import helper.FileBackendHelper;
import menu.MenuItem;

public class RemoveBackend extends MenuItem {
	int choice;
	ManageBackend superParent;
	public RemoveBackend(int id, String name,ManageBackend superParent) {
		super(id, name);
		this.superParent=superParent;
	}

	@Override
	public void doSelected() {
		superParent.displayList();
		takeChoice();
		removeBackend();
	}
	
	public void takeChoice(){
		try {
			System.out.println("");
			System.out.println("Enter The Backend Number To be Removed");

			Scanner scanner=new Scanner(System.in);
			choice=scanner.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void removeBackend(){
		superParent.removeBackend(--choice);
	
	}

}
