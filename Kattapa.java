import java.util.Scanner;
class Kattapa{
  private static int a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{
        int e=0,o=0;
        Kattapa A=new Kattapa();
        //Enter the test case
        int n=A.testCase();
        a=new int[n];
        for(int i=0;i<n;i++)
           {
                a[i]=A.testCase();
                if(a[i]%2==0)
                   e++;
                else
                   o++;
               }

          System.out.println();
           if(e>o)
             System.out.println("READY FOR BATTLE");
          else
             System.out.println("NOT READY");
    }
    catch (Exception e) {

    }
  }
  public int testCase()
  {

       return  obj.nextInt();
  }
}
