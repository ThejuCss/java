class Degree{
  void  getDegree(){
    System.out.println("I got degree");
  }
static class UnderGraduate extends Degree{
   void  getDegree(){
  System.out.println("I got undergraduate degree");
  }
}
static class PostGraduate extends Degree{
   void  getDegree(){
  System.out.println("I got postgraduate degree");
  }
}
public static void main(String args[]){
  Degree a=new Degree();
  a.getDegree();
  UnderGraduate b=new UnderGraduate();
  b.getDegree();
  PostGraduate c=new PostGraduate();
  c.getDegree();
 }
}