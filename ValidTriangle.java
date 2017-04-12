import java.io.*;
import java.util.Scanner;
class ValidTriangle{
  private static String a[];
  public static void main(String sha[])
  {
    try{
         BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
         //Enter the test Case
         int n=Integer.parseInt(obj.readLine());
         a=new String[n];
         ValidTriangle A=new ValidTriangle();
         for(int i=0;i<n;i++)
         {
           a[i]=A.angle();
         }
         for(int i=0;i<n;i++)
         {
           System.out.println(a[i]);
         }
    }
    catch(Exception ex)
    {}
  }
  public String angle()
  {
           String m="NO";
           int j=9;
           Scanner obj=new Scanner(System.in);
           int a=obj.nextInt();
           if( a >= 40 && a <= 180)
               {
                 j=9;
               }
           int b=obj.nextInt();
           if( b >= 40 && b <= 180)
               {
                 j=9;
               }
           int c=obj.nextInt();
           if( c >= 40 && c <= 180)
               {
                 j=9;
               }
           int k=(a+b+c);
           if((k==180) && (j!=9))
              {
                m="YES";
              }
       return m;
  }
}
