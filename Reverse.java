import java.util.Scanner;
class Reverse{
  private static int a[];
  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);
    //Enter the test case
    int n=obj.nextInt();
    a=new int[n];
    Reverse A=new Reverse();
    for(int i=0;i<n;i++)
       {
         a[i]=A.fun(obj.nextInt());
       }
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
  }
  public int fun(int x)
  {
    int m=0;
    while(x>0)
    {
      m= m*10 + (x%10);
      x=x/10;
    }
    return m;
  }
}
