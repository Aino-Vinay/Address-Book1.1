package crud;

import address_book.ManageBackend;
import domain.FileBackend;
import helper.FileBackendHelper;
import menu.MenuItem;

public class CreateAddrFileSystem extends MenuItem {
	
	String title=null;
	ManageBackend superParent;
	public CreateAddrFileSystem(int i, String string,MenuItem superParent) {
		super(i,string);
		 title=string;
		 this.superParent=(ManageBackend)superParent;
	}

	@Override
	public void doSelected() {
		superParent.getBackendHelper().create();
	}

}
