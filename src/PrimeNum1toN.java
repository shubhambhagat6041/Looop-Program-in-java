import java.util.*;
public class PrimeNum1toN 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=xyz.nextInt();
		int sum=0;
		for(int num=1;num<=range;num++)
		{	sum=0;
			for(int i=1;i<num;i++)
			{
				if(num%i==0)
				{
					sum=sum+i;
				}
			}
			if(sum==num)
			{
				System.out.println(num);
			}
		}
	}
}
