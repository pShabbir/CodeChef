//import java.util.Scanner;
import java.io.*;
class Einput
{
	public static void main(String sha[])
	{
		try{


		int n,k,count=0;//The input begins with two positive integers n k (n, k<=107).
		//The next n lines of input contain one positive integer ti, not greater than 109, each.
		//Scanner obj=new Scanner(System.in);
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		//radius = Integer.parseInt(br.readLine());

		//n=obj.nextInt();
		n=Integer.parseInt(obj.readLine());
		//k=obj.nextInt();
		k=Integer.parseInt(obj.readLine());
		for(int i=0;i<n;i++)
		{
			//int r=obj.nextInt();
			int  r=Integer.parseInt(obj.readLine());
			if((r%k)==0)
				count++;
		}
		System.out.print(count);
	 }
	 catch(Exception ex)
	 {
		 
	 }
	}

}
