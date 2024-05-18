import java.util.*;
public class Sum1_to_n_Natural_no {
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Limit");
		int limit=xyz.nextInt();
		int sum=0,i=1;
		while(i<=limit)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of Natural No:"+sum);
	}
}
