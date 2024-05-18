import java.util.*;
public class Count_Digit 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=xyz.nextInt();
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Total Digit in Number:"+count);
	}
}
