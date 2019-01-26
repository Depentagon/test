package hello;

public class World {
	
	private int age;
	

	public World(int age) {
		super();
		this.age = age;
	}


	public static void main(String[] args) {
		System.out.println("Hello World!");

	}
	
	
	public String me() {
		
		String s = "Hello to me";
		
		return s;
	}
	
	public String toString() {
		
		return "overwritten";
		
	}

}
