class Bank{
 int a;
 int getBalance(){
  return 0;
  }
static class BankA extends Bank{
  BankA(int a){
  this.a=a;
  }
 int getBalance(){
  return a;
 }
}
static class BankB extends Bank{
 BankB(int a){
  this.a=a;
  }
 int getBalance(){
  return a;
 }
}
static class BankC extends Bank{
 BankC(int a){
  this.a=a;
  }
 int getBalance(){
  return a;
 }
}
public static void main(String args[]){
 BankA a=new BankA(100);
  a.getBalance();
 BankB b=new BankB(200);
  b.getBalance();
 BankC c=new BankC(300);
   c.getBalance();
 }
}
