//What is the maximum number of squares of size 2x2 that can be fit in a right angled isosceles triangle of base B.
import java.io.*;
class SquareAndTriangle{
  private static int a[];
  public static void main(String sha[])
  {
    try{
         BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
         //Enter the test Case
         int n=Integer.parseInt(obj.readLine());
         a=new int[n];
         SquareAndTriangle A=new SquareAndTriangle();
         for(int i=0;i<n;i++)
         {
           a[i]=A.calculte(Integer.parseInt(obj.readLine()));
         }
         for(int i=0;i<n;i++)
         {
           System.out.println(a[i]);
         }
    }
    catch(Exception ex)
    {}
  }
  public int calculte(int a)
  {
       //int m=0;
       if(!(a<=2))
       {
         return  (a/2 - 1) + calculte(a-2);

       }
       else
         {
             return 0;
         }
  }
}
