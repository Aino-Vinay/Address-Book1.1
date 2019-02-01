package crud;

import address_book.ManageBackend;
import menu.MenuItem;

public class ReadAddrFileSystem extends MenuItem{
	String title=null;
	ManageBackend superParent;
	public ReadAddrFileSystem(int i, String string,MenuItem superParent) {
		super(i,string);
		 title=string;
		 this.superParent=(ManageBackend)superParent;
	}

	@Override
	public void doSelected() {
		superParent.getBackendHelper().read();
	}

}
