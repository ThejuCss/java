import java.util.Scanner;

public class StudMarks 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks in first subject");
	int m1=sc.nextInt();
	System.out.println("Enter marks in second subject");
	int m2=sc.nextInt();
	System.out.println("Enter marks in third subject");
	int m3=sc.nextInt();
	int total=m1+m2+m3;
	double percentage=(total)/300*100;
	System.out.println(total);
	System.out.println(percentage);	
}
}
