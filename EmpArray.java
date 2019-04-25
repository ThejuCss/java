import java.io.*;
class EmpArray
{
	Integer id;
	String name;
	String dept;
	String doj;
	Double salary;
void enter() throws IOException
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Emplyee Id ");
		id=Integer.valueOf(br.readLine());
		System.out.println("Enter Name :");
		name=br.readLine();
		System.out.println("Enter dept :");
		dept=br.readLine();
		System.out.println("Enter doj :");
		doj=br.readLine();
		System.out.println("Enter Salary :");
		salary=Double.valueOf(br.readLine());
		}
void display()
		{
		System.out.println("Employee Id :"+id);
		System.out.println("Employee Name :"+name);
		System.out.println("Employee Department :"+dept);
		System.out.println("Employee Joining date :"+doj);
		System.out.println("Employee Salary :"+salary);
		}
	public static void main(String... args) throws Exception
	{
	EmpArray[] arr = new EmpArray[5];
	for(int i=0; i<arr.length; i++)	
	{
	arr[i] = new EmpArray();
	}
	for(int j=0; j<arr.length; j++)
	{
	arr[j].enter();
	arr[j].display();
	}
	for(EmpArray e : arr)
	{
	e.display();
	}
	}
}