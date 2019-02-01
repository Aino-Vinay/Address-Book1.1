package address_book;

import java.util.ArrayList;
import java.util.Scanner;

import crud.CreateAddrFileSystem;
import crud.DeleteAddFileSystem;
import crud.ReadAddrFileSystem;
import crud.UpdateAddrFileSystem;
import domain.Backend;
import domain.FileBackend;
import helper.FileBackendHelper;
import menu.Menu;
import menu.MenuItem;

public class SelectBackendFileSystem extends Menu {
	int choice=0;
	ManageBackend superParent;
	ArrayList<Backend> temporary;
	
	public SelectBackendFileSystem(int id, String name,MenuItem parent,MenuItem superParent) {
		super(id, name);
		this.superParent=(ManageBackend) superParent;
		temporary=new ArrayList<Backend>();
		
		CreateAddrFileSystem createAddrFileSystem=new CreateAddrFileSystem(1,"Create",superParent);
		DeleteAddFileSystem deleteAddrFileSystem=new DeleteAddFileSystem(2,"Delete",superParent);
		ReadAddrFileSystem readAddrFileSystem=new ReadAddrFileSystem(3,"Read",superParent);
		UpdateAddrFileSystem updateAddrFileSystem=new UpdateAddrFileSystem(4,"Update",superParent);
		
		GoBack goBack=new GoBack(5,"Go Back",parent);
		Exit exit=new Exit(6,"Exit");
		
		
		
		addMenuItemList(createAddrFileSystem);
		addMenuItemList(deleteAddrFileSystem);
		addMenuItemList(readAddrFileSystem);
		addMenuItemList(updateAddrFileSystem);

		addMenuItemList(goBack);
		addMenuItemList(exit);
	}


	public void doSelected() {
		try {
			displayFileBackendList();
			takeChoice();
			setCurrentBackend();
			super.doSelected();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void displayFileBackendList(){
		try {
			int i=0;
			for(Backend list : superParent.getBackendList()){
				if(list instanceof FileBackend)
				{
					System.out.println(++i+". FileBackend : "+list);
					temporary.add(list);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void takeChoice(){
		try {
			System.out.println("");
			System.out.println("Enter The Backend Number To be Selected");

			Scanner scanner=new Scanner(System.in);
			choice=scanner.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setCurrentBackend(){

		try {
			Backend currentBackend=temporary.get(--choice);
			superParent.setCurrentBackend(currentBackend);
			superParent.setBackendHelper(new FileBackendHelper(superParent));
			System.out.println("");
			System.out.println("Current Backend Selected................!!!!!!!!!!!!!!!!!!!!!!!!");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

