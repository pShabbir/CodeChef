import java.util.Scanner;
class FarmerAndPlot{
  private static int a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{

        FarmerAndPlot A=new FarmerAndPlot();
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
     return obj.nextInt();
  }
  public int cal(){
    int l=testCase();
    int b=testCase();
    int k=gcd(l,b);
    return (l*b)/(k*k);

  }
  public int gcd(int a, int b)
   {
    if (b == 0)
        return a;
    else
        return gcd(b, a % b);
   }

  }
