import java.util.*;
public class ReverseNumber 
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=xyz.nextInt();
		int rem,rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse Number is:"+rev);
	}

}
