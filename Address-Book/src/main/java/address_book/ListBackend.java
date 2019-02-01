package address_book;

import menu.Menu;
import menu.MenuItem;

public class ListBackend extends MenuItem{
	
	//constructor

		ManageBackend superParent;
		public ListBackend(int id, String name,MenuItem parent){
			super(id,name);

			this.superParent=(ManageBackend)parent;
			
			
		}
		public void doSelected(){
			list();
		}
		public void list()
		{
			System.out.println("The List Of Backends Is:");

			System.out.println("");
			superParent.displayList();
			
			System.out.println("********************************************");
		}
}
