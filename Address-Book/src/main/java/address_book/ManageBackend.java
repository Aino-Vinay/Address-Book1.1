package address_book;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;

import domain.Backend;
import domain.DatabaseBackend;
import domain.FileBackend;
import helper.BackendHelper;
import menu.Menu;

public class ManageBackend extends Menu {

	private ArrayList<Backend> backendList=new ArrayList<Backend>();
	private FileOutputStream file;
	private ObjectOutputStream out;
	private FileInputStream fileInputStream;
	 private ObjectInputStream objectInputStream;
	 private Backend currentBackend=null;
	 private BackendHelper backendHelper=null;
	 
	public BackendHelper getBackendHelper() {
		return backendHelper;
	}

	public void setBackendHelper(BackendHelper backendHelper) {
		this.backendHelper = backendHelper;
	}

	public Backend getCurrentBackend() {
		return currentBackend;
	}

	public void setCurrentBackend(Backend currentBackend) {
		this.currentBackend = currentBackend;
	}

	//Constructor
	public ManageBackend(int id,String name){
		super(id,name);

		load();
		AddBackend addBackend=new AddBackend(1,"Add Backend",this);
		SelectBackend selectBackend=new SelectBackend(2,"Select Backend",this);
		ListBackend listBackend=new ListBackend(3,"List Backend",this);
		RemoveBackend removeBackend=new RemoveBackend(4,"Remove Backend",this);
		Exit exit=new Exit(5,"Exit");

		addMenuItemList(addBackend);

		addMenuItemList(selectBackend);

		addMenuItemList(listBackend);

		addMenuItemList(removeBackend);
		
		addMenuItemList(exit);


	}

	public void addFiletoList(Backend backend)	{
		getBackendList().add(backend);
		save();
	}

	public void save(){
		try {
			file=new FileOutputStream("/home/intern1/Desktop/serialize.ser");
			out=new ObjectOutputStream(file);
			out.writeObject(getBackendList());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void load()
	{
		 try {
			 fileInputStream = new FileInputStream("/home/intern1/Desktop/serialize.ser");
			 objectInputStream= new ObjectInputStream(fileInputStream);

			 setBackendList((ArrayList<Backend>) objectInputStream.readObject());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {

			 try {
				objectInputStream.close();
				 fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}


	public void displayList(){
		int i=1;

		for(Backend list : getBackendList()){
						if(list instanceof FileBackend )
			{
			System.out.println(i+". File Backend : "+list);
			}
			else if(list instanceof DatabaseBackend){

				System.out.println(i+". Database Backend : "+list);
			}
			i++;
		}
		
	}

	public ArrayList<Backend> getBackendList() {
		return backendList;
	}

	public void setBackendList(ArrayList<Backend> backendList) {
		this.backendList = backendList;
	}
	
	public void removeBackend(int choice){
		backendList.remove(choice);
		save();
			System.out.println("Backend Removed Successfully..............!!!!!!!!!!!!!!!!!!!");
	}


}
