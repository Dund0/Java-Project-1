import java.util.*;

public class Classroom extends Person implements Displayable {
   int roomNumber;
   Displayable teacher;
   ArrayList<Displayable> students;
   
   public Classroom()
   {
   
   }
   
   public Classroom(int setRoomNumber, Displayable setTeacher,
                                       ArrayList<Displayable> setStudents)
   {
      super();
      roomNumber = setRoomNumber;
      teacher = setTeacher;
      students = setStudents;
      
   }
   
   public String display()
   {
      return "temp";
   }
}