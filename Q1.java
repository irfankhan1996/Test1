import java.util.Scanner;

public class Q1 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		double a =  sc.nextDouble();
		double b=sc.nextDouble();
		String c;
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter Choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			c=Double.toString(a+b);
			System.out.println("Addition:"+c);
			break;
		case 2:
			c=Double.toString(a-b);
			System.out.println("substraction:"+c);
			break;
		case 3:
			c=Double.toString(a*b);
			System.out.println("Multiplication:"+c);
			break;
		case 4:
			c=Double.toString(a/b);
			System.out.println("Division:"+c);
			break;
		}
	}
}
