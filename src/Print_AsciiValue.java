import java.util.*;
public class Print_AsciiValue 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		 char ch=65,chh=90;
		 while(ch<=chh)
		 {
			System.out.printf("%c==>%d\n",ch,(int)ch);
			 ch++;
		 }
	}
}
