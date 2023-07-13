import java.util.*;
public class Bank {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [][] Account = new int [50][3];
		while (true) {		
		System.out.println("Choose one option from the following: ");
		System.out.println("Enter 1 to Sign In");
		System.out.println("Enter 2 to Creat New Account");
				int a = sc.nextInt();
				switch(a) {
				case 1 :
						Create_Account(Account);
					break;
				case 2 :
						Sign_In(Account);
				default:
	            	System.out.println("Wrong input! Try again");
			}
				continue;
		} 
		}
		public static void Sign_In(int [][] Sign) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter your Account Number:");
			int AccNumber = sc.nextInt();
			System.out.println("Enter your Password:");
			int password = sc.nextInt();
		for (int i = 0; i < Sign.length;i++)
	    {
	        if (AccNumber == Sign[i][0] && password == Sign [i][1] )
	        {
	    		System.out.println("Welcome");
	    		int withdraw=0,deposite=0,balance1=Sign[i][2];
	    		while (true) {
	    		System.out.println("You have 5 options choose one:");
	    		System.out.println("Enter 1 for Withdraw");
	    		System.out.println("Enter 2 for Deposit");
	    		System.out.println("Enter 3 for Check Balance");
	    		System.out.println("Enter 4 for change password");
	    		System.out.println("Enter 5 for Exit");
	    		int choice =sc.nextInt();
	    		switch (choice) {
	    		case 1 : 
	    			System.out.print("Enter money to be withdrawn =");
	    			withdraw=sc.nextInt();
	    			if(balance1 >= withdraw)
	                {
	                    balance1-=withdraw;
	                    System.out.println("Collect your money");
	                    System.out.println(" ");
	                }
	                else
	                {
	                    System.out.println("Your balance is insufficient");
	                    System.out.println(" ");

	                }
	                break;
	    		case 2:
	    			System.out.print("Enter money to be deposited = ");
	    			deposite=sc.nextInt();
	    			balance1 +=deposite;
	    			System.out.println("Your money has been deposited successfully");
	                System.out.println(" ");
	    			break;
	    		case 3:
	    			System.out.println("your balance = " + balance1);
	                System.out.println(" ");
	    			break;
	    		case 4 : 
	    			for (i=0;i<Sign.length;i++) {
	    			System.out.println("Enter your new Password");
	    			int newPassword = sc.nextInt();
	    			Sign [i][1] = newPassword;
	    			return;
	    			}
	    		case 5: 
	    			System.exit(5); 
	    		default:
	            	System.out.println("Wrong input! Try again");
	    			
	   }
		}
	    }
	    }

		}

		public static void Create_Account(int [][] Create) {
			Scanner sc = new Scanner (System.in);
			int balance, randAccNo = 0;
		System.out.print("Enter your username = ");
		String user = sc.next();
		System.out.print("Enter your password = ");
		int password = sc.nextInt();
		do {
			System.out.println("you should deposit a minimum of 5000 dollars.");
			 balance = sc.nextInt();
			 if(balance < 5000) {
					System.out.println("you should deposit more.");
			 continue;}
		}while (balance <5000);
		if (balance >=5000) {
		for (int i = 0; i < Create.length; i++)
	    {
	        if (Create[i][0] == 0)
	        {
	        	Create[i][0] = randAccNo = 1000  + i;
	        	Create[i][1] = password;
	        	Create[i][2] = balance;
	            break;
	        }
	    }
		}		System.out.println("Welcome " + user + " your account number is " + randAccNo );
			System.out.println(" ");
	}

}
