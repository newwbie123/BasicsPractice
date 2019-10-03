package vjezba1;


public class StudentExecutioner {

	public static void main(String[] args) {
		
		//klasa Student
		
		Student student1 = new Student(1, "Stipe", 5);
		Student student2 = new Student(2, "Mate", 3);
		Student student3 = new Student(3, "Ivan", 7);
		
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		
		student3.setGrade(100);
		System.out.println("Ivan with updated grade value:");
		student3.displayInfo();
		
		
		//klasa StatixStud
		
		StatixStud x1 = new StatixStud(10, "Stipe");
		StatixStud x2 = new StatixStud(11, "Mia");
		StatixStud x3 = new StatixStud(12, "Marko");
		
		x1.studentInfo();
		x2.studentInfo();
		
		
		
		//klasa StatixStud
		
		Scounter sc1 = new Scounter();
		Scounter sc2 = new Scounter();
		Scounter sc3 = new Scounter();
		
		CalculateCube C1 = new CalculateCube();
		int result = C1.cube(5);
		
		System.out.println("Volume of the cube with " + C1.getX() + " length is " + result);
		
		CalculateCube C2 = new CalculateCube();
		int result1 = C2.cube(6);
		System.out.println("Volume of the cube with " + C2.getX() + " length is " + result1);
		
		CalculateExtent E1 = new CalculateExtent();
		
		double resultE = E1.calculateExtent(10);
		System.out.println(resultE);
	}

}
