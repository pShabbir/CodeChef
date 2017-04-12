//Program To implement sort
import java.io.*;
class TurboSort{
	public static void main(String sha[])
	{
		try{
			BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		//Taking total no of entries
		int n=Integer.parseInt(obj.readLine());
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(obj.readLine());
		java.util.Arrays.sort(a);
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		}
		catch(Exception ex)
		{
			
		}
	}
}