public class Student extends Person implements Displayable {
   int studentId;
   int finalGrade;
   
   public int getStudentId()
   {
      return studentId;
   }
   
   public int getFinalGrade()
   {
      return finalGrade;
   }
   
   public void setStudentId (int setStudentId)
   {
      studentId = setStudentId;
   }
   
   public void setFinalGrade (int setFinalGrade)
   {
      finalGrade = setFinalGrade;
   }
   
   public Student(String setFirstName, String setLastName, 
                                    int setStudentId, int setFinalGrade)
   {
      super();
      firstName = setFirstName;
      lastName = setLastName;
      studentId = setStudentId;
      finalGrade = setFinalGrade;
   }
   
   public String display()
   {
      return "Student ID: " + studentId + "\t" + getFullName() + 
                                          " Final Grade: " + finalGrade;
   }
}