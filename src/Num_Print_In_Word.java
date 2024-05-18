import java.util.*;
public class Num_Print_In_Word 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=xyz.nextInt();
		int rem,rev=0,rem1;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		while(rev!=0)
		{
			rem1=rev%10;
			switch(rem1)
			{
				case 1:
					System.out.println("One");
					break;
					
				case 2:
					System.out.println("Two");
					break;
					
				case 3:
					System.out.println("Three");
					break;
					
				case 4:
					System.out.println("Four");
					break;
					
				case 5:
					System.out.println("Five");
					break;
					
				case 6:
					System.out.println("Six");
					break;
					
				case 7:
					System.out.println("Seven");
					break;
					
				case 8:
					System.out.println("Eight");
					break;
					
				case 9:
					System.out.println("Nine");
					break;
					
					default:
						System.out.println("Zero");
			}
			rev=rev/10;
		}
	}
}
