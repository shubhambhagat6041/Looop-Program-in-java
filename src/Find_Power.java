import java.util.*;
public class Find_Power
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Base");
		int base=xyz.nextInt();
		System.out.println("Enter the Index");
		int index=xyz.nextInt();
		int p=1;
		for(int i=1;i<=index;i++)
		{
			p=p*base;
		}
		System.out.println("Power of Number:"+p);
	}
}
