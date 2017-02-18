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
			if(accountLoc!=-1){
				Validate v = new Validate(accounts.get(accountLoc));
			
				if(accountLoc!=-1&&v.execute())
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
	
	public static void execute(Account a){
		System.out.print("W for Withdrawl. D for Desposit. ");
		String temp = stdIn.next();
		if(temp.equalsIgnoreCase("W")){
			Withdrawl w = new Withdrawl(a);
			w.execute();
		}
		else if(temp.equalsIgnoreCase("D")){
			Deposit d = new Deposit(a);
			d.execute();

		}
	}

}
