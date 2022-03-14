package OppsConcept;
import java.util.*;

public class Bank {
	int acc_no;
	String name;
	long bal;
	
	public Bank(int acc_no,String name,long bal)
	{
		this.acc_no=acc_no;
		this.name=name;
		this.bal=bal;
	}
	public void withdraw()
	{
		long amt;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter withdraw ammount ");
		amt=sc.nextLong();
		if(amt<=bal)
		{
			if(amt>=500)
			{
			  bal-=amt;
			  System.out.println(amt+" amount withdraw succesfull");
			}
			else
			{
				System.out.println("enter  withdraw amount more than 500");
			}
		}
		else
		{
			
		
			
			
				System.out.println("insufficient balance !deposite first ");
				deposite();
			
		}
	}
	public void deposite()
	{
		long amt;
		System.out.println("enter deposite ammount  ");
		Scanner sc=new Scanner(System.in);
		amt=sc.nextLong();
		bal+=amt;
		
	}
	public void check_balance()
	{
		System.out.println(" Account number = "+acc_no);
		System.out.println(" Account holder name = "+name);
		System.out.println(" Account balance = "+bal);
	}

	
	

}
