//To find A between 1 to N so that he gets max to eat
import java.io.*;
class ChefCake{
	public static void main(String sha[])
	{
		try{
			BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
			//Take input of total test case
			int n=Integer.parseInt(obj.readLine());
			int a[]=new int[n];
			//Taking total cupcakes in each test case
			for(int i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(obj.readLine());
			}
			//printing size of cupcakes to be held in each container
			for(int i=0;i<n;i++)
			{
				if(a[i]%2==0)
					System.out.println(a[i]);
				else
					System.out.println((a[i]/2)+1);
					
			}
			
		}
		catch(Exception ex) {
				
			}
	}
}
