import java.io.*;
class Magic4 {
	public static int a[];
	public static void main(String sha[])
	{
		
		try
		{
			BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
			//Enter the test CASE	
			int n=Integer.parseInt(obj.readLine());
		    a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(obj.readLine());
				
			}
			for(int i=0;i<n;i++)
			{
				int counter=0;
				int yo=0;
				while(a[i]>0)
				{
					yo = a[i]%10;
					if(yo==4)
						counter++;
					a[i]=a[i]/10;
					
				}
				System.out.println(counter);
			}
		}
		catch(Exception ex)
		{
			
		}
	}
}