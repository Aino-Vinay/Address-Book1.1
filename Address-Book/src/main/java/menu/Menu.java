package menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends MenuItem {	
	private ArrayList<MenuItem> menuItemsList=null;
	private Scanner scanner=null;
	private int choice=-1;
	private String title;
	//constructors

	public Menu(int id,String name){
		super(id,name);
		this.title=name;
		menuItemsList=new ArrayList<MenuItem>();
		scanner=new Scanner(System.in);
	}

	//member functions
	public void doSelected(){
		try {
			while(true){

			displayTitleAndMenuItems();
			getInput();
			handleEvent();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void displayTitleAndMenuItems(){
		try {
			System.out.println(title);
			for(int i=0;i<menuItemsList.size();i++)
			{
				System.out.println(menuItemsList.get(i));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getInput(){
		try {
			System.out.println("");

			System.out.println("Please Enter Your Choice :");
			choice=scanner.nextInt();
			System.out.println("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void handleEvent(){
		try {
			if(choice<1 || choice>menuItemsList.size()){
				System.out.println("");
				System.out.println("Invalid Choice....!!!!!!!!!!!!!");
				
			}
			
			for(int i=0;i<menuItemsList.size();i++){
				if(choice==menuItemsList.get(i).getId()){
					menuItemsList.get(i).doSelected();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	public void addMenuItemList(MenuItem menuItem){
		try {
			menuItemsList.add(menuItem);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
