import java.util.*;

public class PrintReports {
   
   public PrintReports()
   {
     Scanner scan = new Scanner(System.in);
     ArrayList<Displayable> classrooms = new ArrayList<Displayable>(); 
     char choice;
     do {
        classrooms.add(enterClassroom());
        System.out.println("Do you want to enter another classroom: enter y or n.");
        choice = scan.next().charAt(0);
     } while (choice == 'y');
     
   }
   
   public Displayable enterClassroom()
   {
      Scanner scan = new Scanner(System.in);
      
      int roomNumber;
      System.out.println("Please enter a room number.");
      roomNumber = scan.nextInt();
      while(roomNumber < 100){
         System.out.println("Please enter a number greater than or equal to 100");
         roomNumber = scan.nextInt();
      }
      
      Displayable teacher = enterTeacher();
      
      ArrayList<Displayable> students = new ArrayList<Displayable>();
      char choice;
      do {
         students.add(enterStudents());
         System.out.println("Do you want to enter another student: enter y or n.");
         choice = scan.next().charAt(0); 
      } while (choice == 'y');
      
      Displayable classroom = new Classroom(roomNumber, teacher, students);
      return classroom;
   }
   
   public Displayable enterTeacher()
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter the first name of the teacher.");
      String firstName = scan.nextLine();
      
      System.out.println("Please enter the last name of the teacher.");
      String lastName = scan.nextLine();
      
      System.out.println("Please enter the subject of the class.");
      String subject = scan.nextLine();
      
      Displayable teacher = new Teacher(firstName, lastName, subject);
      
      return teacher;
       
   }
   
   public Displayable enterStudents()
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Please enter your first name.");
      String firstName = scan.nextLine();
      
      System.out.println("Please enter your last name.");
      String lastName = scan.nextLine();
      
      System.out.println("Please enter your student ID number.");
      int studentId = scan.nextInt();
      while (studentId < 0){
         System.out.println("Please enter a valid student ID number.");
         studentId = scan.nextInt();
      }
      
      System.out.println("Please enter your final grade.");
      int finalGrade = scan.nextInt();
      while(finalGrade <= 0 && finalGrade >= 100){
         System.out.println("Please enter your final grade.");
         finalGrade = scan.nextInt();
      }
      
      Displayable student = new Student(firstName, lastName, studentId, finalGrade);
      return student;
   }
   
   void report(ArrayList<Displayable> classroom){
      for(int i = 0; i < 0; i++){
         System.out.println(classroom.get(1).display());
         
      } 
   }
}