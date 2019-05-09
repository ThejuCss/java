import java.util.*;
class IllegalMarksException extends Exception{
 public IllegalMarksException(String s){
   super(s);
}
}
public class Marks{
public void eval(int marks)throws IllegalMarksException{ 
 if(marks<0){
   throw new IllegalMarksException("please enter valid marks");
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
 System.out.println("Enter name");
 String name=sc.next();
 System.out.println("Enter course");
 String course=sc.next();
 System.out.println("enter regno");
 String regno=sc.next();
 System.out.println("enter marks");
 int marks=sc.nextInt();
Marks m=new Marks();
try{
  m.eval(marks);
}
catch(IllegalMarksException e){
System.out.println(e.getMessage());
}
if(marks>=0 && marks<45)
{
System.out.println("candidate fail");
}
}
}