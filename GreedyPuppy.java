import java.util.Scanner;
class GreedyPuppy{
  private static int a[];
  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);
    //Enter the test case
    int n=obj.nextInt();
    a=new int[n];
    GreedyPuppy A=new GreedyPuppy();
    for(int i=0;i<n;i++)
       {
              int N=obj.nextInt();
              int k=obj.nextInt();
              a[i]=N%k;//(N-((N/k)*k));

           }
      System.out.println();
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
  }
  }
