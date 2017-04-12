import java.io.*;
class ChefAndDoll{
  private static int a[];
  BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
  public static void main(String sha[])
  {
    try{

        ChefAndDoll A=new ChefAndDoll();
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
    int a=0;
     try{
          a=Integer.parseInt(obj.readLine());
     }
     catch (Exception e) {

     }
     return a;
  }
  public int cal(){
                    int i=0,k=0;
                    int n=testCase();
                    int b[]=new int[n+1];
                    for(i=0;i<n;i++)
                    {
                      b[i]=testCase();
                      k += b[i];
                    }
                      b[n]=k;
                    java.util.Arrays.sort(b);
                    for(i=0;i<n;i=i+2)
                    {
                      if(b[i]!=b[i+1])
                         {
                           k=b[i];
                           break;
                         }
                    }
                    return k;
  }
}
