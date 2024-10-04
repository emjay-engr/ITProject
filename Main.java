
package oop;

/**
 *
 * @author meljun polillo
 */
public class Main {
    public static void main(String[]args){
      Person p = new Person();
       p.firstName = "Meljun";
       p.lastName = "Polillo";
       p.age = 19;
       p.sex = 'M';
      
       
       StudentInfo f = new StudentInfo();
       f.Section = "Bachelor of Science in Information Technology";
       f.IdNumber = 202311745;
       f.grade = 90.0f;
      
    

     //  Person p = new Person("Alenner", "Sdpt", 'F', 20);
      
     
     System.out.println( "First Name: " + p.firstName);
     System.out.println( "Last Name: " + p.lastName);
     System.out.println( "Age: " + p.age);
     System.out.println ("Sex: " + p.sex);
     
     System.out.println( "Section: " + f.Section);
     System.out.println( "Student Id Number: " + f.IdNumber);
     System.out.println( "Grades: " + f.grade);
     
    }
}
 