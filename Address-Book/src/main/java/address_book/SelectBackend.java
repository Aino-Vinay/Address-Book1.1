package address_book;

import menu.Menu;
import menu.MenuItem;

public class SelectBackend extends Menu{
	
	MenuItem menuItem;
	MenuItem parent;
	public SelectBackend(int id,String name,MenuItem parent){
		super(id,name);
		SelectBackendFileSystem addBackendFileSystem=new SelectBackendFileSystem(1,"File System",this,parent);
		SelectBackendDatabase addBackendDatabase=new SelectBackendDatabase(2,"Database",this,parent);
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
