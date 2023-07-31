package constractor2package;

public class Information {

	public static void main(String[] args) {
		
		
	   studenttest person1 = new studenttest("Tasnim",  23, " QA" ,  500);
		person1.showinfo();
	person1.makepayment();
		person1.eat();
		
		studenttest person11 = new studenttest("Ohid", 26, "software developer", 3500);
		person11.showinfo();
        person11.makepayment();
        person11.eat();
		
		teacher person2 = new teacher("Rabbi", 35 , 7 );
		person2.showinfo();
		person2.eat();
		
		teacher person22 = new teacher("Jahid", 35, 8);
		person22.showinfo();
		person22.eat();
		
		Officeemployees person3 = new Officeemployees("Nahid", 30 , "manager");
		person3.showinfo();
		person3.eat();
		
		Officeemployees person33 = new Officeemployees("Swarna", 25, "junior officer");
		person33.showinfo();
        person33.eat();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
