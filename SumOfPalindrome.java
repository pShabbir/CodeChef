import java.util.Scanner;
class SumOfPalindrome{
  private static int a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{

        SumOfPalindrome A=new SumOfPalindrome();
        //Enter the test case
        int n=A.testCase();
        a=new int[n];
        for(int i=0;i<n;i++)
           {
                int x=A.testCase();
                int y=A.testCase();
                a[i]=A.pallinSum(x,y);
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

      int n=obj.nextInt();
      return n;
  }
  public int pallinSum(int x,int y)
  {
    int sum=0;
    for(int i=x;i<=y;i++)
    {
      int m=0,r=0;
      r=i;
      while(r>0)
      {
        m= m*10 + (r%10);
        r=r/10;
      }
      if(m==i)
        sum += i;
      }
     return sum;
    }
  }
