import java.util.Scanner;
class calculate
{
public static void main(String args[])
{
int num1, num2, add, mul, sub, div;
double mod;
Scanner sc= new Scanner(System.in);
System.out.println("Enter first number");
num1 = sc.nextInt();
System.out.println("Enter second number");
num2 = sc.nextInt();
add = num1+num2;
mul = num1*num2;
sub = num1-num2;
div = num1/num2;
mod = num1%num2;
System.out.println("addition is=" +add);
System.out.println("multiplication is=" +mul);
System.out.println("substraction is=" +sub);
System.out.println("division is=" +div);
System.out.println("modulous is=" +mod);
}
}

result

C:\Users\Hp\Desktop>javac calculate.java

C:\Users\Hp\Desktop>java calculate
Enter first number
20
Enter second number
12
addition is=32
multiplication is=240
substraction is=8
division is=1
modulous is=8.0
 