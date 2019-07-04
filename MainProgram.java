import java.util.*;
class Employee
{
   String empName;
   String empContactNo;
   String empNo;
   String Designation;
   String empDept;
   int empSalary;

  void getEmployeeDetails()
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter employee name");
    this.empName=sc.nextLine();
    
    System.out.println("Enter employee contact no");
    this.empContactNo=sc.nextLine();
    
    System.out.println("Enter employee empno");
    this.empNo=sc.nextLine();
    
    System.out.println("Enter employee designation");
    this.Designation=sc.nextLine();
    
    System.out.println("Enter employee empdept");
    this.empDept=sc.nextLine();
    
    System.out.println("Enter employee salary");
    this.empSalary=sc.nextInt();
    sc.nextLine();    

  }
  
  void displayEmployeeDetails()
  {
    System.out.println("Employee name: "+this.empName);
    System.out.println("Employee name: "+this.empContactNo);
    System.out.println("Employee name: "+this.empNo);
    System.out.println("Employee name: "+this.Designation);
    System.out.println("Employee name: "+this.empDept);
    System.out.println("Employee name: "+this.empSalary);
  }
  Employee()
  {
     this.empName="theju";
     this.empContactNo="9182088110";
     this.empNo="4567";
     this.Designation="engineer";
     this.empDept="des";
     this.empSalary=567890;
  }
 
}

public class MainProgram
{
    public static void main(String args[])
    {
       Employee e1=new Employee();
       Scanner sc=new Scanner(System.in);
       System.out.println("Do u want to make changes in employee details");
        String c1=sc.nextLine();
        	
		if(c1.equals("yes"))
       {
       System.out.println("Enter the details of employee");
       e1.getEmployeeDetails();
       System.out.println("details of employee");
       e1.displayEmployeeDetails();
       }
       else
       {
           System.out.println("details of employee");
           e1.displayEmployeeDetails();
           System.out.println("ok thank u");
           
       }
     }
}
