import java.util.*;
public class Prime1tonN {
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Range");
		int range=xyz.nextInt();
		int count;
		System.out.println("Prime Numbers are:");
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
				System.out.println(num);
			}
		}
	}
}
