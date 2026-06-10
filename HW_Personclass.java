package chapter9;

public class HW_Personclass {
	
	public static void main(String[] args) {
		
		//Create Person
		Person p1 = new Person();
		System.out.println(" ");
		Person p2 = new Person("Smith", "203 N broadway", "293-295-5870", "Sm234@gmail.com");
		
		//Display Person
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(" ");
		//Create new employee/ display
		Employee e1 = new Employee("Steph", "1954 wabash st", "493-496-0093", "ST555@gmail.com", 39000, "w303");
		System.out.println(e1);
		System.out.println(" ");
		//Create new student/ display
		Student s1 = new Student("Nick", "209 W Hill", "384-284-2245", "NI12345@gmail.com", 1);
		System.out.println(s1);
		System.out.println(" ");
		//Create new faculty/ display
		Faculty f1 = new Faculty("Josh", "543 N JIM", "230-583-5907", "Jo1234gmail.com", "Mon-Thu, 10:00AM - 4:00PM", "PROF");
		System.out.println(f1);
	}


}
