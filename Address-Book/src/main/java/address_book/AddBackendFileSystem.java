package address_book;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import domain.FileBackend;
import menu.Menu;
import menu.MenuItem;

public class AddBackendFileSystem extends MenuItem{
	
	Scanner scanner;
	String path=null;
	FileOutputStream file=null;
	ObjectOutputStream out=null;
	ManageBackend superParent;
	public AddBackendFileSystem(int id, String name,MenuItem parent,MenuItem superParent) {
		super(id, name);
		scanner=new Scanner(System.in);
		this.superParent=(ManageBackend) superParent;
		
		
	}

	public void doSelected(){
		addBackend();
	}
	
	public void addBackend(){
	
		System.out.println("Enter The Path : ");
		String path=scanner.next();
		
		superParent.addFiletoList(new FileBackend(path));
	}
}
