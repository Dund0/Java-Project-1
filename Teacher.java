public class Teacher extends Person implements Displayable {
   String subject;
   
   public String getSubject()
   {
      return subject;
   }
   
   public void setSubject(String setSubject)
   {
      subject = setSubject;
   }
   
   public Teacher(String setFirstName, String setLastName, String setSubject)
   {
      super();
      firstName = setFirstName;
      lastName = setLastName;
      subject = setSubject;
   }
      
   public String display()
   {
      return getFullName() + " teaches " + subject;
   }
} 