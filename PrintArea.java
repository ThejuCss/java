public class PrintArea{
 
  static void dispArea(int x,int y){
    System.out.println(x*y);
  }
  static void dispArea(int x){
    System.out.println(x*x);
  }
  public static void main(String args[]){
   dispArea(2,3);
   dispArea(2);
}
} 
