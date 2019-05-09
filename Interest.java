import java.util.*;
abstract class Bank{
static double si,ci;
void simpleInterest(double p,double r,double t){
si=(p*r*t)/100;
System.out.println("simple interest"+si);
}
void compoundInterest(double p,double r,double t){
ci=p* Math.pow((1 + r/100),t);
System.out.print("compound interest" +ci);
}
}
class Interest extends Bank{
public static void main(String args[]){
 Interest i=new Interest();
Scanner sc=new Scanner(System.in);
System.out.println("enter principal amount");
double p=sc.nextDouble();
System.out.println("enter rate of interest");
double r=sc.nextDouble();
System.out.println("enter time");
double t=sc.nextDouble();
System.out.println("choose ur plan");
String c=sc.next();
if(c.equals("simpleinterest"))
{
 System.out.println("Simple Interest" +si);
}
if(c.equals("compoundinterest"))
{
System.out.println("compoundInterest"+ci);
}
}
}
