import java.util.*;
public class Sum_Even_1_toN {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Limit");
		int limit=xyz.nextInt();
		int sum=0,i=1;
		while(i<=limit)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("Sum of Even No:"+sum);
	}

}
