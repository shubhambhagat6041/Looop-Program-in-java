import java.util.*;
public class Find_Firsr_Last_digit
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=xyz.nextInt();
		int rem;
		rem=num%10;
		while(num>9)
		{
			num=num/10;
		}
		System.out.println("First Number:"+num);
		System.out.println("Last Number:"+rem);
	}
}
