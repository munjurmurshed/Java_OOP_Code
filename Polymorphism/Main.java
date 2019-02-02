
package Polymorphism;

/**
 *
 * @author munju
 */


public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Anik";
        e1.age = 23;
        e1.qualification = "MSC CSE";
        e1.DisplayInformation();
        
        
        Person e2 = new Employee();
        e2.name = "Anik";
        e2.age = 24;
        e2.DisplayInformation();
        
        Person p1 = new Person();
        p1.name = "Munjur";
        p1.age = 20;
        p1.DisplayInformation();
        
        
        p1 = new Employee2();
        p1.DisplayInformation();
        
    }
}
