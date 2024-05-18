import java.util.*;
public class LCM_of_Two_num {
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Two Number");
		int num1=xyz.nextInt();
		int num2=xyz.nextInt();
		int i=1,hcf=0,lcm;
		while(i<=num1 && i<=num2)
		{
			if(num1%i==0 && num2%i==0)
			{
				hcf=i;
			}
			i++;
		}
		lcm=(num1*num2)/hcf;
		System.out.println("HCF is:"+hcf);
		System.out.println("LCM is:"+lcm);
	}
}
