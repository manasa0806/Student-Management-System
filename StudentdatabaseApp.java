public class StudentdatabaseApp {
  
  public static void main(String[] args) {
      // NUMBER OF STUDENTS TO BE ADDED
      System.out.print("Enter number of new students to enroll: ");
      Scanner in = new Scanner(System.in);
      int numOfStudents = in.nextInt();
      Student[] students = new Student[numOfStudents];
      
      // CREATE n NUMBER OF NEW STUDENTS
      for(int n = 0; n < numOfStudents; n++) {
          students[n] = new Student();
          students[n].enroll();
          students[n].payTuition();
      }
      
      for(int n = 0; n< numOfStudents; n++) {
          System.out.println(students[n].toString());
      }
  }
}
    
