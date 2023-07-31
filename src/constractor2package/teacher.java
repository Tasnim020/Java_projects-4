package constractor2package;

public class teacher {

	
	String name;
	int age;
	int numberofclasses;
	
	public teacher(String name, int age, int numberofclasses) {
		
	this.name = name;
	this.age = age;
	this.numberofclasses = numberofclasses;
	}
	void showinfo() {
		
		System.out.println("teacher's name: " + name);
		System.out.println("teacher's age: " + age);
		System.out.println("teacher's number of classes taken: " + numberofclasses);
		
	}
		
	void eat() {
		System.out.println(name + " eats in the canteen");
	}
	
	
	
	
	
	
	
	
	
	
		

	}


