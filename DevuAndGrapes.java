import java.util.Scanner;
class DevuAndGrapes{
  private static int a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{
        DevuAndGrapes A=new DevuAndGrapes();
        //Enter the test case
        int n=A.testCase();
        a=new int[n];
        for(int i=0;i<n;i++)
           {
                a[i]=A.cal();
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

       return  obj.nextInt();
  }
  public int cal()
  {
    int count=0;
    int n=testCase();
    int x=testCase();
    int s=x/2;
    int b[]=new int[n];
    for(int i=0;i<n;i++)
       b[i]=testCase();
    for(int i=0;i<n;i++)
    {
      int ro=b[i]%x;
      if(ro>s)
        count += (x-ro);
      else
        count +=ro;
    }
    return count;
  }
}
