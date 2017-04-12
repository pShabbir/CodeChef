import java.util.Scanner;
class SquareRoot{
  private static int a[];
  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);
    //Enter the test case
    int n=obj.nextInt();
    a=new int[n];
    SquareRoot A=new SquareRoot();
    for(int i=0;i<n;i++)
       {
         a[i]=A.root(obj.nextInt());
       }
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
  }
  public int root(int x)
  {
    return (int)Math.sqrt(x);
  }

}
