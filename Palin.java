import java.util.Scanner;
class Palin{
  private static String a[];
  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);
    //Enter the test case
    int n=obj.nextInt();
    a=new String[n];
    for(int i=0;i<n;i++)
       {
              int y=obj.nextInt();
              int x=rev(y);
              if(x==y)
                a[i]="wins";
              else
                a[i]="losses";

           }
      System.out.println();
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
  }
  public static int rev(int x)
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
