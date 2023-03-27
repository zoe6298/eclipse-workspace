package week7day1oophw;

public class Pet {
	private String name;
	private int age;
	private String location;
	private String type;
	
	public Pet() {
		this.name = "default";
		this.age = 2;
		this.location = "default";
		this.type = "defautl";
	}
	public Pet(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
		
	}
	

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getType() {
		return type;
	}
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet1 = new Pet();
		Pet pet2 = new Pet("dobby", 2, "Austin", "dog");
		
		
	}

}
