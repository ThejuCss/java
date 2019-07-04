import java.util.*;
public class CountChar
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter String");
    String s=sc.nextLine();
    System.out.println("enter character");
    char c=sc.next().charAt(0);
    System.out.println(countChar(s,c));
  }
  static int countChar(String s,char c)
  {
    int count=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)==c)
      count++;
    }
   return count;
  }
 
}