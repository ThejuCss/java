class I{
  int i;
  void printNum(){
   System.out.println(i);
  }

static class J extends I{
 int j;
 void printNum(){
   System.out.println(j);
  }
}
public static void main(String[] args){
    J a = new J();
    a.i = 34;
    a.j = 46;
    a.printNum();
    a.j = a.i;
    a.printNum();
  }
}