class Print{
   static void print(char c,int a)
    {
        System.out.println(c);
        System.out.println(a);
    }
   static void print(int a,char c)
    {
       System.out.println(c);
       System.out.println(a);
    }
public static void main(String args[])
{
  print(2,'a');
  print('a',2);
}
}