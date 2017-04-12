//Find sum of digit
import java.util.Scanner;
class SumOfDigit{
	static int a[];
	int m;
	public static void main(String sha[])
	{
		Scanner obj=new Scanner(System.in);
		//enter the test case
		int n=obj.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=obj.nextInt();
		for(int i=0;i<n;i++)
		{
			int yo=0;
			while(a[i]>0)
			{
				yo += a[i]%10;
				a[i]=a[i]/10;
				
			}
			System.out.println(yo);
		}
	}
}