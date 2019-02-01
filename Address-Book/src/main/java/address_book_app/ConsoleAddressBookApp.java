package address_book_app;

import address_book.ManageBackend;

public class ConsoleAddressBookApp{

	public static void main(String[] args) {
		System.out.println("***************************Welocome To My Address-Book Console Application***********************");

		System.out.println("");
		
		ManageBackend manageBackend=new ManageBackend(0,"Manage Backend");
		manageBackend.doSelected();
	}

}
