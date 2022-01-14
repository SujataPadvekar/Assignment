import java.util.Scanner;
class display
{
public static void main(String args[])
{
String name;
double per;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Name");
name=sc.nextLine();
System.out.println("Enter percentage");
per=sc.nextDouble();
System.out.println("Name is " +name);
System.out.println("percentage is" +per);

}
}

 
result

C:\Users\Hp\Desktop>javac display.java

C:\Users\Hp\Desktop>java display
Enter Name
sujata padvekar
Enter percentage
78.90
Name is sujata padvekar
percentage is78.9