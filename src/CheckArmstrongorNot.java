import java.util.*;
public class CheckArmstrongorNot 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int num=xyz.nextInt();//153
		int count=0;
		int temp=num;
		while(num!=0)
		{
			num=num/10;
			count++;//3
		}
		num=temp;
		int rem,p;
		int sum=0;
		while(num!=0)//153//15
		{	p=1;
			rem=num%10;//3//5
			for(int i=1;i<=count;i++)
			{
				p=p*rem;//27+125
			}
			num=num/10;//15//1
			sum=sum+p;//27+125+1
		}
		if(sum==temp)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}
