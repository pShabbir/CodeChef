import java.util.Scanner;
class RelationalOperatr{
  private static int a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{

        RelationalOperatr A=new RelationalOperatr();
        //Enter the test case
        int n=A.testCase();
        a=new int[n];
        for(int i=0;i<n;i++)
           {
                int x=A.testCase();
                int y=A.testCase();
                a[i]=A.Ch(x,y);
               }
          System.out.println();
        for(int i=0;i<n;i++)
        {
          System.out.println((char)a[i]);
        }
    }
    catch (Exception e) {

    }
  }
  public int testCase()
  {

      int n=obj.nextInt();
      return n;
  }
  public int Ch(int a,int b)
  {
    if(a==b)
      return 61;
    else if (a>b) {
      return 62;

    }
    else
      return 60;
  }
}
