Class Customer
{
String custname;
long contact;
}
Class Account
{
 String accountNo;
 String accountType; 
} 
Class RBI
{
Customer c; 
Account a;	
Public double GetInterestRate() {	}
Public double GetWithdrawalLimit() {	}
}
Class SBI: public RBI
{

} 
Class ICICI: public RBI
{

}
