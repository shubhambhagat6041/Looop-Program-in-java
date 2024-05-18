import java.util.*;
public class PrintEvenNo1_to_n {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=xyz.nextInt();
		int i=1;
		System.out.println("Even Number is");
		while(i<=limit)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
