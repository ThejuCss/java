import java.util.*;
class Student{
        String name,address;
        int age;
        
        Student()
        {
            name="unknown";
            address="-";
            age=0;
        }
        void setinfo(String name, int age)
        {
            name = name;
            age = age;
        }
        void setinfo(String name, String address, int age)
        {
            name = name;
            address = address;
            age = age;
        }
       
        void getinfo()
        {
            System.out.println(name);
            System.out.println(age);
            System.out.println(address);
        }
}
class StudentInfo{
public static void main(String args[])throws Exception
{
    Student s[] = new Student[10];
    String name,addr;
    int i,age;
    
    for(i=0;i<s;i++)
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.next();
        System.out.println( "Enter age");
        age=sc.nextInt();
        s[i].setinfo(name, age);
    }
    
    for(i=0;i<s;i++)
    {
        s[i].getinfo();
    }
    
    for(i=0;i<s;i++)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.next();
        System.out.println( "Enter age");
        age=sc.nextInt();
        System.out.println("Enter address");
        String address=sc.next();
        s[i].setinfo(name,address,age);
    }
    
    for(i=0;i<s;i++)
    {
        s[i].getinfo();
    }
}
 
}



