
import java.io.*;

class PrimeOrNot{
  private static String a[];
  public static void main(String sha[])
  {
    try{
         BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
         //Enter the test Case
         int n=Integer.parseInt(obj.readLine());
         a=new String[n];
         PrimeOrNot A=new PrimeOrNot();
         for(int i=0;i<n;i++)
         {
           int x=Integer.parseInt(obj.readLine());
           if(!(x%2==0))
             a[i]="yes";
           else
              a[i]="no";

         }
          System.out.println();
         for(int i=0;i<n;i++)
         {
           System.out.println(a[i]);
         }
    }
    catch(Exception ex)
    {}
  }

}
