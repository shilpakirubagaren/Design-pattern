
import java.util.Scanner;
 class TestAccount {
	     String account_name;
	 	 int account_no,amount;
		 int account_deposite;
		 int account_widhdraw,account_balancecheck;

 public void readData()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter account_name:, account_no:,amount:,account_deposite:,account_widhraw");
		 account_name=scanner.next();
		 account_no=scanner.nextInt();
		 amount=scanner.nextInt();
		 account_deposite=scanner.nextInt();
		 account_widhdraw=scanner.nextInt();
		 account_balancecheck=amount+account_deposite-account_widhdraw;
	}
	public void printData()
	{ 
		System.out.println("account_name:"+account_name+" "
		  		+ "account_no:"+account_no +"amount: "+amount
+"account_deposite :"+account_deposite+" "
+"account_widhdraw :"+account_widhdraw+"account_balancecheck: "+account_balancecheck );
}
	public static void main(String[] args)
	{
		System.out.println("Enter the account details are");
		TestAccount account=new TestAccount();
		account.readData();
		account.printData();
		}		

	}

