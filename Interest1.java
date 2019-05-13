abstract class Bank {
abstract void simpleInterest(double p,double r,double t) ;
abstract void compoundInterest() ;
}

class Interest extends Bank{

void simpleInterest(double p,double r,double t) {
    double si=(p*t*r)/100;
    System.out.println("simple Interest is "+ si);
}
void compoundInterest() {
   double ci=0;
   double p=10000;
    double r=2;
    for(double t=1;t<=5;t++){
    ci = p * Math.pow(1 + r,t); 

}
System.out.println("Compound Interest is "+ ci);
}
public static void main(String args[]) {
   Interest b=new Interest();
	b.simpleInterest(25000,9.25,25);
        b.compoundInterest();
}
}