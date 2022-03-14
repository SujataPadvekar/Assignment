package OppsConcept;

import java.util.Scanner;
import java.util.ArrayList;

public class bank_transaction {   
	    //static bank acc[]=new bank[100];
		static ArrayList<Bank> acc=new ArrayList<Bank>();
		static int count=0;


		public static void main(String[] args)
		{
			int acc_no,ch;
			String name;
			long bal;
			Scanner sc=new Scanner(System.in);
			do {
				
			int flag=1;
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
				acc.add(new Bank(acc_no,name,bal));
				count++;
			    System.out.println(" Account succesfully created ");
				break;
		
			case 2:
				int ac;
				System.out.println("enter account number ");
			     ac=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(ac==acc.get(i).acc_no)
					{
					acc.get(i).deposite();
					flag=0;
					}
				}
				if(flag==1)
				{
					 System.out.println("account number not found ");
				}
				break;
				
			case 3:
				
				System.out.println("enter account number ");
			     ac=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(ac==acc.get(i).acc_no)
					{
					acc.get(i).withdraw();
					flag=0;
					}
				}
				if(flag==1)
				{
					 System.out.println("account number not found ");
				}
				break;
				
			case 4:
				System.out.println("enter account number ");
			     ac=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(ac==acc.get(i).acc_no)
					{
					acc.get(i).check_balance();
					flag=0;
					}
				}
				if(flag==1)
				{
					 System.out.println("account number not found ");
				}
				
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