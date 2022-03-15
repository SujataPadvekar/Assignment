package even_perfectnum;

import java.util.Scanner;

public class perfect_num {

public static void main(String[] args) {
		
		int n, i=1, sum=0;
		
		 Scanner  sc= new Scanner(System.in);
		 
		 System.out.println("Enter the number.");
		 n=sc.nextInt();
		 
		 while(i<=n/2)
		 {
			 if(n%i==0)
			 {
				 sum = sum+i;
			 }
			 i++;
		 }
		 
		 if(sum==n)
		 {
			 System.out.println("the number entered is perfect number.");
		 }
		 else
		 {
			 System.out.println("the number entered is not perfect number.");
		 }
		 
	}
}
