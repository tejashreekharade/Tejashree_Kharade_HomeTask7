
package Structural_AdapterPattern;

public class AdapterPattern 
{
	public static void main(String args[]){  
		  CreditCard targetInterface=new BankCustomer();  
		  targetInterface.giveBankDetails();  
		  System.out.print(targetInterface.getCreditCard());  
		 }   

}