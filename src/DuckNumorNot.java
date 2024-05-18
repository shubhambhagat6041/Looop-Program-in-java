import java.util.*;
public class DuckNumorNot 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=xyz.nextInt();
		int rem;
		boolean flag=false;
		while(num!=0)
		{
			rem=num%10;
			if(rem==0)
			{
				flag=true;
				break;
			}
			num=num/10;	
		}
		if(flag)
		{
			System.out.println("Duck Number");
		}
		else
		{
			System.out.println("Not Duck Number");
		}
	}
}
