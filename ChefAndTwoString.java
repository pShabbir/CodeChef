import java.util.Scanner;
class ChefAndTwoString{
  private static String a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{

        ChefAndTwoString A=new ChefAndTwoString();
        //Enter the test case
        int n=Integer.parseInt(A.testCase());
        a=new String[n];
        for(int i=0;i<n;i++)
           {
                String x=A.testCase();
                String y=A.testCase();
                a[i]=A.match(x,y);
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
  public String match(String x,String y)
  {
    int count1=0,count2=0;
    char[] mn={'?'};
    String c =new String(mn);
    for(int i=0;i<x.length();i++)
    {
      if(x.charAt(i)!=y.charAt(i) && x.charAt(i)!=c.charAt(0) && y.charAt(i)!=c.charAt(0))
         count1++;
     //count1=x.length()-count1;
     if(x.charAt(i)!=y.charAt(i) || x.charAt(i)==c.charAt(0) || y.charAt(i)==c.charAt(0))
        count2++;
     }
       return (count1+" "+count2);
  }
}
