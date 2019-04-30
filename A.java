class A{
  void print(){
  System.out.println("parent");
}
static class B extends A{
  void print(){
  System.out.println("child");
}
}
public static void main(String args[]){
 A a=new A();
  a.print();
 B b=new B();
  b.print();
 A c=new B();
  c.print();
}
} 