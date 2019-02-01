package crud;

import address_book.ManageBackend;
import menu.MenuItem;

public class DeleteAddFileSystem extends MenuItem{
	String title=null;
	ManageBackend superParent;
	public  DeleteAddFileSystem(int i, String string,MenuItem superParent) {
		super(i,string);
		title=string;
		this.superParent=(ManageBackend)superParent;
	}

	@Override
	public void doSelected() {
		superParent.getBackendHelper().delete();;
	}

}
