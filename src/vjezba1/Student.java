package vjezba1;

public class Student {
	
	private int studentNo;
	private String studentName;
	private int grade;
	
//	dozivanje defaultnog konstruktora:
	
	public Student(int studentNo, String studentName, int grade) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	//KOJA JE RAZLIKA U PRIMJENI TA 2 KONSTRUKTORA?
	
//	rucno kreirani konstruktor:
//	public Student(int sNO, String sName, int g) {
//		
//		studentNo = sNO;
//		studentName = sName;
//		grade = g;
//		
//	}
	
	
	

	public void displayInfo() {
		
		System.out.println((studentNo + "|" + studentName + "|" + grade));
		 
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
