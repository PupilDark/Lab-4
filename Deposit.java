import java.util.Scanner;

public class Deposit {
	Account a;
	Scanner stdIn = new Scanner(System.in);
	public Deposit(Account a){
		this.a=a;;
	}
	public void execute(){
		int amount;
		System.out.print("Amount to Deposit? $");
		amount = stdIn.nextInt();
		System.out.println();
		System.out.println("****Reciept****");
		System.out.println("Account Balance = $" + a.deposit(amount));
		System.out.println();
		System.out.println();
	}
}
