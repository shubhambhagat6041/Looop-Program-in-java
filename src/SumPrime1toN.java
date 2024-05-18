import java.util.*;
public class SumPrime1toN {
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Range");
		int range=xyz.nextInt();
		int count,sum=0;
		for(int num=1;num<=range;num++)
		{	count=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum=sum+num;
			}
		}
		System.out.println("Sum of 1 to N Prime Number:"+sum);
	}
}
