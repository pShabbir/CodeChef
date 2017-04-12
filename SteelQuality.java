import java.util.Scanner;
class SteelQuality{
  private static int a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{

        SteelQuality A=new SteelQuality();
        //Enter the test case
        int n=(int)A.testCase();
        a=new int[n];
        for(int i=0;i<n;i++)
           {
                double h=A.testCase();
                double c=A.testCase();
                double t=A.testCase();
                a[i]=A.cal(h,c,t);
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
  public double testCase()
  {

      double n=obj.nextDouble();
      return n;
  }
  public int cal(double h,double cc,double t)
  {
    boolean a=(h>50);
    boolean b=(cc<0.7);
    boolean c=(t>5600);
    if(a && b && c)
      return 10;
    else if (a && b) {
      return 9;
    }
    else if (b && c) {
      return 8;
    }
    else if (a && c) {
      return 7;
    }
    else if (a||b||c) {
      return 6;
    }
    else {
      return 5;
    }
  }
  }
