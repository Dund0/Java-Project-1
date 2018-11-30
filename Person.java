public abstract class Person {

   String firstName;
   String lastName;
   
   public String getFirstName() 
   {
      return firstName;
   }
   
   public String getLastName() 
   {
      return lastName;
   }
   
   public void setFirstName (String setFirstName)
   {
      firstName = setFirstName;
   }
   
   public void setLastName (String setLastName)
   {
      lastName = setLastName;
   }
   
   public String getFullName()
   {
      return firstName + lastName;
   }

}