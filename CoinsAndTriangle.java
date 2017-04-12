import java.io.*;
class CoinsAndTriangle{
  private static int a[];
  BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
  public static void main(String sha[])
  {
    try{
        CoinsAndTriangle A=new CoinsAndTriangle();
        //Enter the test case
        int n=A.testCase();
        a=new int[n];
        for(int i=0;i<n;i++)
           {
                a[i]=A.cal();
               }

          System.out.println();
          for(int i=0;i<n;i++)
             {
                  System.out.println(a[i]);
                 }
    }
    catch (Exception e) {

    }
  }
  public int testCase()
  {
      int s=0;
       try{
           s=Integer.parseInt(obj.readLine());
       }
       catch (Exception e) {

       }
       return s;
  }
  public int cal(){
    int n=testCase();
  double r=Math.sqrt(1+(8*n));
    r=(-1+r)/2;
    return (int)r;
  }
}
