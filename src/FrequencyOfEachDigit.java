import java.util.*;
public class FrequencyOfEachDigit 
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=xyz.nextInt();
		int count,rem;
		
		for(int i=1;i<=9;i++)
		{
			count=0;
			for(int j=num;j!=0;j=j/10)
			{
				rem=j%10;
				if(i==rem)
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(i+"===>"+count);
			}
		}
	}

}
