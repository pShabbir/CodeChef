import java.util.Scanner;
class Life
{
	public static void main(String sha[])
	{   
	    Scanner obj=new Scanner(System.in);
	    int k=0;
		int []a=new int[100];
		//System.out.println("Enter the number");
		for(int i=0;i<100;i++)
		{
			a[i]=obj.nextInt();
			if(a[i]>99)
			{
				a[i]=0;
				i--;
			}
			if(a[i]!=42)
				k++;
			else
				break;
				
		}
		a[k]=obj.nextInt();
		for(int i=0;i<k;i++)
			System.out.println(a[i]);
	}
}