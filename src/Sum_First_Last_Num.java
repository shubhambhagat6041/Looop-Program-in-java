import java.util.*;
public class Sum_First_Last_Num 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=xyz.nextInt();
		int rem,sum=0;
		rem=num%10;
		while(num>9)
		{
			num=num/10;
		}
		sum=rem+num;
		System.out.println("Sum Of First and Last:"+sum);
	}
}
