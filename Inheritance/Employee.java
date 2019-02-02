
package Inheritance;


public class Employee extends person{
      String qualification;
     
     
     
     @Override
     public void DisplayInformation()
     {  
         System.out.println("Name: "+name);
         System.out.println("Age: "+age);
         System.out.println("Qualification: "+qualification);
     }
}
