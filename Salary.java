import java.util.Scanner;
class Salary{
  private static double a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{

        Salary A=new Salary();
        //Enter the test case
        int n=A.testCase();
        a=new double[n];
        for(int i=0;i<n;i++)
           {
                double x=A.testCase();
                a[i]=A.cal(x);
               }
          System.out.println();
        for(int i=0;i<n;i++)
        {
          if(a[i]==(int)a[i])
             System.out.println((int)a[i]);
          else
            System.out.printf("%.1f\n",a[i]);
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
  public double cal(double s)
  {
    if(s<1500)
    {
      return ((s)+(s*0.1)+(s*0.9));
    }
    else{
      return ((s)+(500)+(s*0.98));
    }
  }

  }
