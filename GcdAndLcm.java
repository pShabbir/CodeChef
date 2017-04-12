import java.util.Scanner;
class GcdAndLcm{
  private static int a[],b[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{

        GcdAndLcm A=new GcdAndLcm();
        //Enter the test case
        int n=A.testCase();
        a=new int[n];
        b=new int[n];
        for(int i=0;i<n;i++)
           {
                int x=A.testCase();
                int y=A.testCase();
                a[i]=A.Gcd(x,y);
                b[i]=A.Lcm(y,x);
               }
          System.out.println();
        for(int i=0;i<n;i++)
        {
          System.out.println(""+a[i]+" "+b[i]);
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
  public  int Gcd(int a,int b){
    if (b==0)
    return a;
    else
    return Gcd(b,a%b);
  }
  public int Lcm(int a,int b)
  {
    int lcm=0;
    try{

      for(int i=1;i<=a;i++)
      {
        int x=i*b;
        if(x%a==0)
        {
          lcm=x;
          break;
        }
      }
      //System.out.println("LCM = "+lcm);

    }
    catch(Exception e){}
      return lcm;
  }

  }
