import java.util.Scanner;
class QuantityAndPrice{
  private static double a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    QuantityAndPrice A=new QuantityAndPrice();
    //Enter the test case
    int n=A.testCase();
    a=new double[n];
    for(int i=0;i<n;i++)
       {
            a[i]=A.cal();
           }
      System.out.println();
      //DecimalFormat numberFormat = new DecimalFormat("#.000000");
     //System.out.println(numberFormat.format(number));
    for(int i=0;i<n;i++)
    {
      System.out.printf("%.6f\n",a[i]);
    }
  }
  public int testCase()
  {

      int n=obj.nextInt();
      return n;
  }
  public double cal()
  {
    double r=0;
    double q=obj.nextDouble();
    double p=obj.nextDouble();
    if(q>1000)
    {
      r=(q*p)-((q*p)/10);
    }
    else
    {
      r=q*p;
    }
    return r;
  }
  }
