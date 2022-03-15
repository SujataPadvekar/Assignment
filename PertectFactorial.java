package OppsConcept;

import java.util.Scanner;

class calculation
{
	public int perfect(int num)
	{
		
		int i=1, sum=0, fact;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==num)
		{
			fact=factorial(num);
			return fact;
		}
		else
		{
			return -1;
		}
	}//perfect
	
	public int factorial(int num)
	{
		int fact=1, j;
		
		for(j=1; j<=num; j++)
		{
			fact=fact*j;
		}
		return fact;
	}
	
}


public class PertectFactorial {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
			
		System.out.println("Enter number:");
		int num=sc.nextInt();
	
		calculation ocal=new calculation();
	
		int facto=ocal.perfect(num);
		if( facto!=-1)
		{
			System.out.println("Factorial is: "+facto);
		}
		else
		{
			System.out.println(facto);
		}
	}


}
