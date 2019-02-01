package address_book;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import domain.DatabaseBackend;
import domain.FileBackend;
import menu.Menu;
import menu.MenuItem;

public class AddBackendDatabase extends MenuItem{
	
	Scanner scanner;
	String path=null;
	FileOutputStream file=null;
	ObjectOutputStream out=null;
	ManageBackend superParent;
	public AddBackendDatabase(int id, String name,MenuItem parent,MenuItem superParent) {
		super(id, name);
		scanner=new Scanner(System.in);
		this.superParent=(ManageBackend) superParent;
		
		
	}

	public void doSelected(){
		addBackend();
	}
	
	public void addBackend(){
	
		System.out.println("Enter The IP Address : ");
		String ip=scanner.next();
		
		System.out.println("Enter The Port Number : ");
		String portNumber=scanner.next();
		
		System.out.println("Enter The Database Name dataBaseName : ");
		String dbName=scanner.next();
		
		System.out.println("Enter The User Name : ");
		String userName=scanner.next();
		
		System.out.println("Enter Password : ");
		String password=scanner.next();
		
		
		superParent.addFiletoList(new DatabaseBackend(ip,portNumber,dbName,userName,password));
	}
}
