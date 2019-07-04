import java.util.*;
public class MyClass 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string");
    String s=sc.nextLine();
    char[] c = s.toCharArray();
     for (int i = c.length-1; i>=0; i--)
     { 
       System.out.print(c[i]);
     }
  }
} 

