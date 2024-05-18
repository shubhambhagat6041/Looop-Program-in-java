import java.util.*;
public class ArmstrongNum1tonN 
{
	public static void main(String x[])
	{	Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=xyz.nextInt();
		int count,rem,temp,p,sum;
		for(int num=1;num<=range;num++)
		{
			count=0;
			temp=num;
			while(num!=0)
			{
				num=num/10;
				count++;
			}
			num=temp;
			sum=0;
			while(num!=0)
			{
				rem=num%10;
				p=1;
				for(int i=1;i<=count;i++)
				{
					p=p*rem;
				}
				num=num/10;
				sum=sum+p;
			}
			num=temp;
			if(sum==num)
			{
				System.out.println(num);
			}
		}
	}
}
