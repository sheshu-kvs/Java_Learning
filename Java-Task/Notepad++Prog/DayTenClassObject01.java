class Bank{
	private static int accNum=8989;
	private static String accHolderName="AlexMerin";
	private static int balance=1000;
	static{
		System.out.println("Hello welcome to the Bank!!");
		System.out.println("Bank accHolderName is::"+accHolderName);
		System.out.println("Bank Account Number is the:"+accNum);
		System.out.println("Balance in the Account::"+balance);
		
	}
	static void deposit(int amount){
		System.out.println("The Deposited Amount in the Account:"+amount);
		balance+=amount;
	}
	static void withdraw(int amount){
		System.out.println("Withdrawn amount is the!!"+amount);
		if(amount<balance){
			balance-=amount;
			System.out.println("Amount withdrawn Successfully!!:"+balance);
		}
		else{
		System.out.println("There is no sufficient balance.Please deposit the amount!!");
		}
	
	}
	static void disp(){
		System.out.println("The total balance in the account is:"+balance);
	}
}
public class DayTenClassObject01{
	public static void main(String[] args){
		Bank b1=new Bank();
		
	Bank.deposit(1500);
	Bank.withdraw(3500);
	Bank.disp();

		
		
		
	}
}