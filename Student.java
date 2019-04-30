class Student{
  String name;
  String address;
  int age;
  Student(){
   name="unknown";
   address="not_available";
   age=0;
  }
   void setInfo(String name,int age)
   {
   this.name=name;
   this.age=age;
   }
   void setInfo(String name,int age,String address){
   this.name=name;
   this.age=age;
   this.address=address;
  }
}
class StudentInfo
{
  public static void main(String args[])
  {
   Student[] arr; 
    arr = new Student[5];
 for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + " : " +arr[i].name +" "+ arr[i].age); 
    } 

     
for (int i = 0; i < arr.length; i++) {
   System.out.println("Element at " + i + " : " +arr[i].name +" "+ arr[i].age+" "+ arr[i].address); 
    }
 }
}