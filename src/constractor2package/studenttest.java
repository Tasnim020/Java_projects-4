package constractor2package;

public class studenttest {

		
		String name;
		int age;
		String course;
		int coursepayment;
		int paidamount;
		int remainingamount;

		
		public studenttest(String name, int age, String course , int paidamount) {
			
		this.name = name;
		this.age = age;
		this.course = course;
		this.paidamount = paidamount;
		}
	
		void showinfo() {
			
			System.out.println("student's name: " + name);
			System.out.println("student's age: " + age);
			System.out.println("course name: "+ course);
			
		}
			
			
			void makepayment() {remainingamount = 3500 - paidamount; 
				
			if(paidamount < 3500) {
				
				System.out.println("amount needs to be paid: " + remainingamount + "$");
				
			} else {
				
				System.out.println("Course payment is done");

			}
		}
		
		
		void eat() {
			
			System.out.println(name + " eats in the canteen");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


