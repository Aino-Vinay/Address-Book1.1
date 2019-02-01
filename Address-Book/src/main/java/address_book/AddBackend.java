package address_book;


import menu.Menu;
import menu.MenuItem;

public class AddBackend extends Menu{

	

	public AddBackend(int id,String name,MenuItem parent){
		super(id,name);
		AddBackendFileSystem addBackendFileSystem=new AddBackendFileSystem(1,"File System",this,parent);
		AddBackendDatabase addBackendDatabase=new AddBackendDatabase(2,"Database",this,parent);
		GoBack goBack=new GoBack(3,"Go Back",parent);
		Exit exit=new Exit(4,"Exit");



		addMenuItemList(addBackendFileSystem);
		addMenuItemList(addBackendDatabase);
		addMenuItemList(goBack);
		addMenuItemList(exit);


	}

	public void doSelected(){
		try {
			    super.doSelected(); //display for the menu
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
