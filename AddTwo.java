import java.util.Scanner;
class AddTwo{
	private static int[] a;
	public static void main(String sha[])
	{
		Scanner obj=new Scanner(System.in);
		//Input test case
		int n=obj.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
		{
			int x=obj.nextInt();
			int b=obj.nextInt();
		     a[i]=x+b;
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}