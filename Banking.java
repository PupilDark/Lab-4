import java.util.*;

public class Banking {

	int accountNum;
	int pinNum;
	int amount;
	String temp;
	static List<Account> accounts;
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args){
		Banking bank = new Banking();
		
		while(true){
			int accountLoc = bank.start();
			if(accountLoc!=-1&&validate(accounts.get(accountLoc))){
				execute(accounts.get(accountLoc));
			}
		}
		
	}
	
	public Banking(){
		accounts = new ArrayList<Account>();
		accounts.add(new Account(1234, 6789, 80));
		accounts.add(new Account(6789, 4321, 60));
	}
	public int start(){
		System.out.print("Enter Account Number: ");
		if(!stdIn.hasNextInt()){
			stdIn.next();
			return -1;
		}
		
		int accountNum = stdIn.nextInt();
		
		int i=0;
		while(accounts.get(i).accountNumber!=accountNum){
			i++;
			if(i>=accounts.size())
				return -1;
		}
		return i;
	}
	public static boolean validate(Account a){
		int tries=0;
		int pinNum;
		do{
			System.out.print("Enter PIN: "); 
			pinNum = stdIn.nextInt();
			tries++;
		}while(pinNum!=a.pinNumber&&tries!=3);
		if(tries==3&&pinNum!=a.pinNumber){
			System.out.print("Invalid PIN");
			System.out.println('\n');
			return false;
		}
		return true;
	}
	public static void execute(Account a){
		int amount;
		System.out.print("W for Withdrawl. D for Desposit. ");
		String temp = stdIn.next();
		if(temp.equalsIgnoreCase("W")){
			System.out.print("Amount to Withdrawl? $");
			amount = stdIn.nextInt();
			System.out.println();
			System.out.println("****Reciept****");
			System.out.println("Account Balance = $" + a.withdrawl(amount));
			System.out.println('\n');
		}
		else if(temp.equalsIgnoreCase("D")){
			System.out.print("Amount to Deposit? $");
			amount = stdIn.nextInt();
			System.out.println();
			System.out.println("****Reciept****");
			System.out.println("Account Balance = $" + a.deposit(amount));
			System.out.println();
			System.out.println();
		}
	}

}
