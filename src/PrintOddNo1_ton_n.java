import java.util.*;
public class PrintOddNo1_ton_n {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Limit");
		int limit=xyz.nextInt();
		int i=1;
		while(i<=limit)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
