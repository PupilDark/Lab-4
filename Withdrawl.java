import java.util.Scanner;

public class Withdrawl {
	Account a;
	Scanner stdIn = new Scanner(System.in);
	public Withdrawl(Account a){
		this.a=a;;
	}
	public void execute(){
		int amount;
		System.out.print("Amount to Withdrawl? $");
		amount = stdIn.nextInt();
		System.out.println();
		System.out.println("****Reciept****");
		System.out.println("Account Balance = $" + a.withdrawl(amount));
		System.out.println('\n');
	}
}
