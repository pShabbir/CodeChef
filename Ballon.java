import java.io.*;
class Ballon{
  private static int a[];
  BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
  public static void main(String sha[])
  {
    try{
        Ballon A=new Ballon();
        //Enter the test case
        int n=Integer.parseInt(A.testCase());
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
  public String testCase()
  {
      String s="";

       try{
           s=obj.readLine();
       }
       catch (Exception e) {

       }
       return s;
  }
  public int cal(){
    String s=testCase();
    int a=0,b=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='a')
       a++;
      else
       b++;
    }
    int k=Math.min(a,b);
    return k;

  }
}
