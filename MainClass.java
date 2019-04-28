import java.io.*;
import java.util.*;
class Employee
{
 	Integer empId;
       	String empName;
       	String deptName;
       	String doj;
       	Double salary;  

    	Employee()
	{
       
    	}
     
	Employee(Integer empid,String empName)
     	{
      		this.empId=empId;
                this.empName=empName;
      	}
     
	Employee(Integer empid,String empName,String deptName,String doj,Double salary)
	{
       		this.empId=empId;
       		this.empName=empName;
       		this.deptName=deptName;
       		this.doj=doj;
       		this.salary=salary;
    	}
  
    	public Integer getEmpId()
     	{
       		return empId;
     	}
     	public void setEmpId(Integer empId)
     	{
        	this.empId=empId;
      	}
     	public String getEmpName()
     	{
       		return empName;
     	}
     	public void setEmpName(String empName)
     	{
        	this.empName=empName;
      	}
     	public String getDeptName()
      	{
       		return deptName;
      	}
     	public void setDeptName(String deptName)
     	{
        	this.deptName=deptName;
      	}
     	public String getDoj() 
     	{
       		return doj;
     	}
     	public void setDoj(String doj)
     	{
        	this.doj=doj;
      	}
     	public Double getSalary()
     	{
       		return salary;
     	}
     	public void setSalary(Double salary)
      	{
        	this.salary=salary;
      	}
 
	void accept() throws IOException
   	{
    		InputStreamReader r=new InputStreamReader(System.in);   
    		BufferedReader br=new BufferedReader(r); 

     		System.out.println("Enter employee id");
     		empId=Integer.valueOf(br.readLine());

     		System.out.println("Enter employee name");
     		empName=br.readLine();

     		System.out.println("Enter employee deptname");
     		deptName=br.readLine();

     		System.out.println("Enter Date of joining");
     		doj=br.readLine();
	
     		System.out.println("Enter salary");
     		salary=Double.valueOf(br.readLine());
      
		save();
  	}
  	void display()
   	{
      		System.out.println("employee id:"+empId);
      		System.out.println("employee name:"+empName);
      		System.out.println("employee department name:"+deptName);
      		System.out.println("employee doj:"+doj);
      		System.out.println("employee salary:"+salary);
   	}
  	void save()
	{
    		System.out.println("Data has been saved into database");
   	}
    void count()
    {
      int count=0; 
    count++;
    System.out.println(count);
    }
}
public class MainClass
{
    	public static void main(String x[])throws IOException
	{      
       		Integer empId;
       		String empName;
       		String deptName;
       		String doj;
       		Double salary; 
                 
       		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String c=br.readLine();
                 switch(c)
                 {
                   case "1":
		   Employee theja=new Employee(12, "sdfb", "dfds", "vds", 432.5);
                   break;  
                   case "2":
                   Employee thejaswini=new Employee(234, "gfrg");
                   break;
                   case "3":
                   Employee theju=new Employee();
                   break;
                 }
         
		Employee theja=new Employee();

      		System.out.println("do you want to change data yes/no");
       		String c1=br.readLine();
        	
		if(c1.equals("yes"))
       		{
			
			System.out.println("Enter Id");
			Integer id=Integer.valueOf(br.readLine());
                        theja.setEmpId(id);
                        
			System.out.println("Enter Name");
			String name=br.readLine();
                        theja.setEmpName(name);
                        
			
       		}
       		else
		{
       			theja.display();
       		}
       for(int i=0;i<5;i++){
       System.out.println("do u want to create object yes/no");
       String Choice=br.readLine();
       
       if (Choice.equals("yes"))
        {
          Employee theju=new Employee();
           theju.count(); 
        } 
    else{
     System.out.println("object is no created");
    } 
}
}
}

            
			




