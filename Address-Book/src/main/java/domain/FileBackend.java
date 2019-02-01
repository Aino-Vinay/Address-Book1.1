package domain;

public class FileBackend implements Backend {
	private String path=null;

	

	public FileBackend(String path) {
		super();
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	public String toString(){
		return path;
	}
}
