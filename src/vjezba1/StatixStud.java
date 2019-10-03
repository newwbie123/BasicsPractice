package vjezba1;


//Primjer gdje jedan atribut klase definiramo kao static, pa ga nije potrebno definirati u konstrukoru jer je fiksan, tj. ne mijenja se prilikom pozivanja u metodi

public class StatixStud {
	
	private int studentNo;
	private String studentName;
	private static String college = "Promet";
	
	public StatixStud(int sNO, String sName) {
		
		studentNo = sNO;
		studentName = sName;
		
	}
	
	public void studentInfo() {
		
		System.out.println("Student number: " + studentNo + ", name: " + studentName + ", college: " + college);
	}
	


}

class Scounter{
	
	//if count is defined as STATIC, every new instance of Scounter will print value increased by 1
	static int count = 0;
	
	Scounter() {	
		
		System.out.println("Counter:" + count);
		count++;
	}
	
}

class CalculateCube{
	
	private int x;	

	public int getX() {
		return x;
	}

	//sto ako ispred dodamo static i maknem this.x definiciju?
	int cube(int x) {
		this.x = x;
		return x * x * x;
	}
}

class CalculateExtent{
	
	double calculateExtent(double r) {
		
		double radius = 0;
		radius = r * 2 * Math.PI;
		return radius;
	}
}
