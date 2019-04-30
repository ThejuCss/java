import java.util.*;
class student{
        string name,addr;
        int age;
        
        student()
        {
            name="unknown";
            addr="-";
            age=0;
        }
        void setinfo(string n, int ag)
        {
            name = n;
            age = ag;
        }
        void setinfo(string n, string a, int ag)
        {
            name = n;
            addr = a;
            age = ag;
        }
       
        void getinfo()
        {
            System.out.println(name);
            System.out.println(age);
            System.out.println(addr);
        }
}
class StudentInfo{
public static void main(String args[])
{
    Student[] x = new Student[10];
    string name,addr;
    int i,age;
    
    for(i=0;i<x;i++)
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println( "Enter age");
        int age=sc.nextInt();
        s[i].setinfo(name, age);
    }
    
    for(i=0;i<x;i++)
    {
        s[i].getinfo();
    }
    
    for(i=0;i<x;i++)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println( "Enter age");
        int age=sc.nextInt();
        System.out.println("Enter address");
        String address=sc.next();
        s[i].setinfo(name,addr,age);
    }
    
    for(i=0;i<x;i++)
    {
        s[i].getinfo();
    }
}
 
}



