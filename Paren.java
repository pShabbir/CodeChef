//()((()()))===((()))
import java.io.*;
class Paren{
  private static String a[];
  BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
  public static void main(String sha[])
  {
    try{
        Paren A=new Paren();
        //Enter the test case
        int n=Integer.parseInt(A.testCase());
        a=new String[n];
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
  public String cal()
  {
    String k=testCase();
    int b=validString(k);
    k="";
    for(int i=0;i<b;i++)
       k=k+"(";
    for(int i=0;i<b;i++)
       k=k+")";
     return k;
  }
  public int validString(String s)
  {
    int balance=0,maxbal=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='(')
       balance++;
      else
        balance--;
       maxbal=Math.max(balance,maxbal);
    }
    return maxbal;
  }
}
