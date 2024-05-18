import java.util.*;
public class StrongNum1toN 
{
	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=xyz.nextInt();
		int rem,sum=0,f=1;
		for(int num=1;num<=range;num++)
		{	
			int temp=num;
			sum=0;
			while(num!=0)
			{
				rem=num%10;
				for(int i=1;i<=rem;i++)
				{
					f=f*i;
				}
				num=num/10;
				sum=sum+f;
				f=1;
			}
			num=temp;
			if(sum==num)
			{
				System.out.println(num);
			}
		}
	}

}
