import java.util.*;
public class StrongNumorNot
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=xyz.nextInt();
		int temp=num;
		int rem,f=1,sum=0;
		while(num!=0)
		{
			rem=num%10;//5
			for(int i=1;i<=rem;i++)
			{
				f=f*i;//120//24//1
			}
			sum=sum+f;//120+24
			num=num/10;
			f=1;
		}
		num=temp;
		if(sum==num)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}
}
