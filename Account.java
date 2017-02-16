
public class Account {
		int accountNumber;
		int pinNumber;
		int balance;
	
		public Account(int account, int pin, int balance){
			accountNumber=account;
			pinNumber=pin;
			this.balance=balance;
		}
		public Account(Account a){
			accountNumber=a.accountNumber;
			pinNumber=a.pinNumber;
			this.balance=a.balance;
		}
		public int withdrawl(int amount){
			if(amount>balance){
				System.out.println("Insufficient Funds");
				return balance;
			}
			balance=balance-amount;
			return balance;
		}
		public int deposit(int amount){
			balance=balance+amount;
			return balance;
		}
}