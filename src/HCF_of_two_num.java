import java.util.*;
public class HCF_of_two_num {
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the two Number");
		int num1=xyz.nextInt();
		int num2=xyz.nextInt();
		
		int i=1,hcf=0;
		while(i<=num1 && i<=num2)
		{
			if(num1%i==0 && num2%i==0)
			{
				hcf=i;
			}
			i++;
		}
		System.out.println("HCF is:"+hcf);
	}
}
