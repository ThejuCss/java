import java.util.*;
class Student{
	static String name;
	static String address;
	static int age;
	Student()
	{
		name="unkown";
		address="not available";
		age=0;
	}

	static void setinfo(String name, int age) {
		Student[] s = new Student[10]; 
		for(int i=0;i<s.length;i++)
		{ 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name");
			name=sc.next();
			System.out.println( "Enter age");
			age=sc.nextInt();
			
		}
	}
	static void setinfo(String name,String address, int age) {
		Student[] s = new Student[10];
		for(int i=0;i<s.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name");
			name=sc.next();
			System.out.println( "Enter age");
			age=sc.nextInt();
			System.out.println("Enter address");
			address=sc.next();
		}
	}
}
	class StudentInfo{
		public static void main(String args[])
		{
			Student[] s = new Student[10];
			String name = "theju",address = "chennai";
			int i,age=22;
			Student.setinfo(name,age);
		for(i=0;i<s.length;i++)
		{
          System.out.println("Student at "+ i + " : " +s[i].name +" "+ s[i].age);  
		}

		Student.setinfo(name,address,age);

		for(i=0;i<s.length;i++)
		{
			System.out.println("Student at " + i + " : " +s[i].name +" "+ s[i].age+" "+ s[i].address); 
		}
	}



}



