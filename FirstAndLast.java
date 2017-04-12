import java.util.Scanner;
class FirstAndLast{
  private static int a[];
  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);
    //Enter the test case
    int n=obj.nextInt();
    a=new int[n];
    FirstAndLast A=new FirstAndLast();
    for(int i=0;i<n;i++)
       {
         a[i]=A.fun2(obj.nextInt());
       }
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
  }
  public int fun2(int x)
  {
    int m=(x%10);
    x=x/10;
    while(x>0)
    {
      if(x<10)
      {
        m += x;
      }
        x=x/10;
    }
    return m;
  }
}
