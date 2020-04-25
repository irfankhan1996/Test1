import java.util.Scanner;

public class Q2 {
	public static void main(String args[])
	{
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter series");
		int count=sc.nextInt();
		int n=2;
		for(int i=1;i<=count;i++)
		{
			
			System.out.print("a:"+i+" ");
			System.out.print("Output:");
			int k=1;
			for(int j=1;j<=i;j++)
			{
					
				   System.out.print(k +" ");
				   k+=n;
			}
			System.out.println();
		}
	}
}
