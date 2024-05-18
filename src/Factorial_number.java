import java.util.*;
public class Factorial_number {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=xyz.nextInt();
		int f=1;
		for(int i=1;i<=num;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial Of Number:"+f);
	}

}
