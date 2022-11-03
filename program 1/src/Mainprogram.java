import java.util.Scanner;

class Person
{
  String name;
  int age ;
  String city;
  String lives;
 
  public void show()
  {
    System.out.println("Student inheriting properties from Person:\n");
  }
}
//child class
class Student extends Person
{
  // defining additional properties to child class
  int marks;
  String tutorial;
}
public class Mainprogram
{

  public static void main(String args[])
  {
    Student obj = new Student();
    obj.show();
    Scanner sc=new Scanner(System.in);
    System.out.println("Name of the student is:");
    String name=sc.next();
    System.out.println("Age of the student is:");
    int age=sc.nextInt();
    System.out.println("Student lives in: ");
    String  lives =sc.next();
    System.out.println("Student learns from the city name: ");
    String city=sc.next();
    System.out.println("Marks obtained by the student is:");
    int mark=sc.nextInt();
  }
}
