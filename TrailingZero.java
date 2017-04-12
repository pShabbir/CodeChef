//Trailing zero of factorial
//import java.util.Scanner;
import java.io.*;
class TrailingZero
{

   public static void main (String sha[])
   {
			try{
				int n,count=0;
				BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
				//Scanner obj=new Scanner(System.in);
			//System.out.println("Enter the total no of elements");
			n=Integer.parseInt(obj.readLine());
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=Integer.parseInt(obj.readLine());
			System.out.println("");
      for(int i=0;i<n;i++)
      {
        int m=a[i];
        int k=5;
        while(k<=a[i])
        {
          count += (m/k);
          k = k*5;
          m=a[i];
        }
        System.out.println(count);
				count=0;
      }
	

			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
   }
}
