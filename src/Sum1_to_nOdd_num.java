import java.util.*;
public class Sum1_to_nOdd_num 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Limit");
		int limit=xyz.nextInt();
		int i=1,sum=0;
		while(i<=limit)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("Sum of Odd Number:"+sum);
	}
}
