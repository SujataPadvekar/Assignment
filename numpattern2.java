package pattern_Prrgra;

public class numpattern2 {

	public static void main(String[] args) {
		int i, j;
		
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=i; j++)//for(j=i; j>=1; j--)
			{
				System.out.print(+i);
			}
			System.out.println();
		}
		
	}
}