import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
class Employee implements Comparable<Employee>
{
  String empId;
  String empName;
  Double salary;
  public Employee(String empId,String empName,Double salary)
  {
    super();
    this.empId=empId;
    this.empName=empName;
    this.salary=salary;
   }
 public void setEmpId(String empId)
 {
    this.empId=empId;
 }
 public String getEmpId()
 {
   return empId;
 }
 public void setEmpName(String empName)
 {
    this.empName=empName;
 } 
 public String getEmpName()
 {
  return empName;
 }
 public void setSalary(Double salary)
 {
  this.salary=salary;
 }
 public Double getSalary(){
  return salary;
 }
 @Override
    public String toString() {
        return "Employee id is :" + empId + "\nEmployee Name is: " + empName + "\nSalary is :" + salary ;
    } 
void display()
{
System.out.println("name is"+empName);
System.out.println("id is"+empId);
System.out.println("salary is"+salary);
}

public int compareTo(Employee o)
  {
      if(this.salary < o.salary)
      return 1;
      else if(this.salary > o.salary)
      return -1;
      else
      return 0;
  }
}
class EmployeeIDComparator implements Comparator<Employee>
{
  @Override
  public int compare(Employee o1,Employee o2)
  {
     return o1.empId.compareTo(o2.empId);
  }
}

class EmployeeNameComparator implements Comparator<Employee>
{
   @Override
  public int compare(Employee o1,Employee o2)
  {
     return o1.empName.compareTo(o2.empName);
  }
}

class EmployeeSalComparator implements Comparator<Employee>
{
  @Override
  public int compare(Employee o1,Employee o2)
  {
      if(o1.salary < o2.salary)
      return 1;
      else if(o1.salary > o2.salary)
      return -1;
      else
      return 0;
  }
}
class Sortable{
	SortedSet<Employee> s1=new TreeSet<Employee>();
	SortedSet<Employee> addEmp(Employee e)
    {
        s1.add(e);
        return s1;
		
    }
	
}

class HashSetExample
{
public static void main(String args[])
{
EmployeeNameComparator enc=new EmployeeNameComparator();
SortedSet<Employee> s1=new TreeSet<Employee>(enc);
Scanner sc=new Scanner(System.in);
System.out.println("Do you want to create object yes/no");
String ch1=sc.next();
if(ch1.equals("yes"))
{
Employee e1=new Employee("E001","theju",23454.00);
 s1=el.addEmp(e1);
Employee e2=new Employee("E002","prathyu",258674.00);
 s1=e2.addEmp(e2);
Employee e3=new Employee("E003","rishi",45678.00);
 s1=e3.addEmp(e3);
}
System.out.println("enter your choice");
 Scanner s=new Scanner(System.in);
 String ch=s.next();
 if(ch.equals('1')){
 Collections.sort(s1,new EmployeeSalComparator());
 if(ch.equals('2')){
 sort.reverse(s1,new EmployeeSalComparator());
  for(Employee e:s1)
  {  
    e.display();  
  } 
}
}
}
}
