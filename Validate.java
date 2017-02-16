import java.util.Scanner;

public class Validate {
	Account a;
	Scanner stdIn = new Scanner(System.in);
	public Validate(Account a){
		this.a=a;;
	}
	public boolean execute(){
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
}
