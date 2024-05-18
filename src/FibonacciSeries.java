import java.util.*;
public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=xyz.nextInt();
		int f1=0,f2=1,fib;
		for(int i=1;i<=num;i++)
		{
			System.out.println(f1);//0//1//1//2//3//5//8
			fib=f1+f2;//1//2//3//5//8//13
			f1=f2;//1//1//2//3//5//8
			f2=fib;//1//2//3//5//8//13
		}

	}

}
