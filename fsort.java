//import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.Scanner;
class fsort {
	public static void main(String sha[])
	{
		int n=0,a[]=null;
		//Scanner obj=new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
         //     DataInputStream br=null;
		try{
                n=br.read();
		a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=br.read();
                }
                catch(Exception e){}
		java.util.Arrays.sort(a);
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		
	}
}