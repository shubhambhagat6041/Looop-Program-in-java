import java.util.*;
public class SumOfDigit
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Enter");
		int num=xyz.nextInt();
		int sum=0,rem;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of Digit is:"+sum);
	}
}
