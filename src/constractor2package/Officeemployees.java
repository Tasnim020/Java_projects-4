package constractor2package;

public class Officeemployees {

	

	String name;
	int age;
	String designation;
	
	public Officeemployees(String name, int age, String designation) {
		
	this.name = name;
	this.age = age;
	this.designation = designation;
	}
	void showinfo() {
		
		System.out.println("Employee's name : " + name);
		System.out.println("Employee's age : " + age);
		System.out.println("Employee's designation : " + designation);
		
	}
	
	
	void eat() {
		
		System.out.println(name + " eats in the canteen");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
