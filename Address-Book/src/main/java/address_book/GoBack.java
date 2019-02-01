package address_book;

import menu.Menu;
import menu.MenuItem;

public class GoBack extends MenuItem{
	MenuItem parent;
	public GoBack(int id, String name,MenuItem parent) {
		super(id, name);
		this.parent=parent;
	}

	public void doSelected(){
		parent.doSelected();
		
		
	}
}
