import java.util.*;
public class ProductOfDigit {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=xyz.nextInt();
		int pro=1,rem;
		while(num!=0)
		{
			rem=num%10;
			pro=pro*rem;
			num=num/10;
		}
		System.out.println("Product Of Digit:"+pro);
	}

}
