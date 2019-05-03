import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Employee implements Comparable 
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
	public ArrayList<Employee> addEmp(Employee e3) {

		return null;
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

class EmployeeSalaryComparator implements Comparator<Employee>
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
class Sort{
	SortedSet<Employee> s1=new TreeSet<Employee>();
	ArrayList<Employee> li=new ArrayList<Employee>();
	List<Employee> addEmp(Employee e)
	{
		li.add(e);
		return li;

	}
}

class H
{
	public static void main(String args[])throws Exception
	{
		EmployeeSalaryComparator enc=new EmployeeSalaryComparator();
		Sort so=new Sort();
		SortedSet<Employee> s1=new TreeSet<Employee>(enc);
		List<Employee> li=new ArrayList<Employee>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String choice = null;
		do
		{
			System.out.println("Enter ID name and Salary");
			String id=br.readLine();
			String name=br.readLine();
			Double sal=Double.parseDouble(br.readLine());
			Employee e1=new Employee(id,name,sal);
			li=so.addEmp(e1);
			System.out.println("Do you want to create Employee Object");
			choice=br.readLine();
		}while(choice.equals("yes"));
		for(Employee emp:li)
		{

			emp.display();

		}  
			Collections.sort(li,new EmployeeSalaryComparator());
				Collections.sort(li,Collections.reverseOrder());
				for(Employee e:li)
				{  
					e.display();  
				}  
			}
		
	}




