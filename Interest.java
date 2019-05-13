abstract class Bank {
abstract void simpleInterest(double p,double r,double t) ;
abstract void compoundInterest(double p,double r,double t,double n) ;
}

class Interest extends Bank{

void simpleInterest(double p,double r,double t) {
    double si=(p*t*r)/100;
    System.out.println("simple Interest is "+ si);
}
void compoundInterest(double p,double t,double r,double n) {
    double amount = p * Math.pow(1 + (r / n), n * t);
    double interest = amount - p;
    System.out.println("Compound Interest is "+interest);
}
public static void main(String args[]) {
   Interest b=new Interest();
	b.simpleInterest(25000,9.25,25);
	b.compoundInterest(35000,3,2,4);
}
}