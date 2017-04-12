import java.util.Scanner;
class WildCardMatch{
  private static String a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{

        WildCardMatch A=new WildCardMatch();
        //Enter the test case
        int n=Integer.parseInt(A.testCase());
        a=new String[n];
        for(int i=0;i<n;i++)
           {
                String x=A.testCase();
                String y=A.testCase();
                int b=A.match(x,y);
                if(b==x.length())
                   a[i]="Yes";
                else
                    a[i]="No";
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

      return obj.next();
  }
  public int match(String x,String y)
  {
    int count=0;
    char[] mn={'?'};
    String c =new String(mn);
    for(int i=0;i<x.length();i++)
    {
      if(x.charAt(i)==y.charAt(i) || x.charAt(i)==c.charAt(0) || y.charAt(i)==c.charAt(0))
         count++;
     }
       return count;
  }
}
