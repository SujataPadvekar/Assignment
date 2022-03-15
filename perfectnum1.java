package even_perfectnum;

public class perfectnum1 {
	
public static void main(String[] args) {
		
		int  i, j;
		
		 for(i=0; i<100; i++) 
		 { 
			 int sum=0;
			 for(j=1; j<i; j++)
			 {
				 if(i%j==0)
				 {
					 sum = sum+j;
				 }
			}
			 if(sum==i && sum!=0)
			 {
			 		System.out.println(i+"\t");
			 }

		 }
	}

}
