import java.util.Scanner;
class Servent{
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
         if(y<10)
            a[i]="What an obedient servant you are!";
          else
            a[i]="-1";
       }
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
  }
}
