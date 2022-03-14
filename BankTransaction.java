package OppsConcept;

import java.util.Scanner;

public class BankTransaction {   
	static Bank sid;


	public static void main(String[] args)
	{
		int acc_no,ch;
		String name;
		long bal;
		Scanner sc=new Scanner(System.in);
		do {
			
		
		System.out.println("1 - Create Account \n 2-deposite \n 3- withdraw \n 4-check acount \n 5- quit ");
		System.out.println(" Enter your choice ");
		ch=sc.nextInt();
		
        
        	
		
		
		
			
		
		switch(ch)
		{
		case 1:
			System.out.println(" Enter Account number ");
			acc_no=sc.nextInt();
			sc.nextLine();
			System.out.println(" Enter Account holder name ");
			name=sc.nextLine();
			System.out.println(" enter balance ");
			bal=sc.nextLong();
			sid=new Bank(acc_no,name,bal);
		    System.out.println(" Account succesfully created ");
			break;
	
		case 2:
			sid.deposite();
			break;
		case 3:
			sid.withdraw();
			break;
			
		case 4:
			sid.check_balance();
			break;
		case 5:
			 System.out.println("\" thanking for visit \"");
			break;
		default:
			System.out.println("your entered choice is wrong");
		}
		}while(ch!=5);
		
				
		
		
				

	}

}
