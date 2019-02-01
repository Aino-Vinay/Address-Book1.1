package menu;

public abstract class MenuItem {

	//data members 
	private int id;
	private String name;
	
	
	
	public MenuItem(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	

	//getter setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
	
		try {
			return ""+id+"."+" "+name;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	//declaring a abstract method
	public abstract void doSelected();




}
