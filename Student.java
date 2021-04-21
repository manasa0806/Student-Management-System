import java.util.Scanner;

public class Student {
	private String firstName;
	private String lasttName;
	private String gradeYear;
	private int studentID;
	private String course;
	private int tuitionBalance;
	private static int courseFee = 1000;
	private static int id = 118;
	
	// TO ENTER STUDENTS NAME AND GRADE YEAR BY USER
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - 1st Year\n2 - 2nd Year\n3 - 3rd Year\n4 - 4th Year\nEnter student grade year");
		this.gradeYear = in.nextInt();
		
		setStudentID();
	}
		
	// GENERATING AN ID
	private String setStudentID() {
		id++;
		this.studentID = gradeYear+""+id;
	}
	
	// ENROLLMENT IN COURSES
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses+ "\n " + course;
				tuitionBalance = tuitionBalance + courseFee;
			}
			else {
				System.out.println("BREAK!");
				break;				}
		}while(1!=0);
			
	}
	
	// VIEW BALANCE
	public void viewBalance() {
		System.out.print("Your Balance: Rs."+ tuitionBalance);
	}
	
	// PAY TUITION
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: Rs."+ payment);
		Scanner in = new Scanner(System.in);
		int payment = in.nextLine();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for the payment of Rs."+ payment);
		viewBalance();
	}
	
	// SHOW STATUS
	public String toString() {
		return "Name: " + firstName + " " + lastName + 
			   "\nGrade Year: " + gradeYear +
			   "\nStudent ID: " + studentID +
			   "\nCourses Enrolled: " + courses + 
			   "\nBalance: Rs." + tuitionBalance;
	}
}
		
