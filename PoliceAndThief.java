import java.util.Scanner;
class PoliceAndThief{
  private static int a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{
        PoliceAndThief A=new PoliceAndThief();
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
    int b[]=new int[101];
    b[0]=-1;
    for(int i=1;i<101;i++)
      b[i]=0;
    int low=0,high=0,count=0;
    int m=testCase();
    int x=testCase();
    int y=testCase();
    int r[]=new int[m];
    for(int i=0;i<m;i++)
       r[i]=testCase();
    for(int i=0;i<m;i++)
    {
      int aw=(r[i]-(x*y));
      if(aw<1)
       low=1;
      else
       low=aw;
       aw=r[i]+(x*y);
      if(aw>100)
        high=100;
      else
        high=aw;
      for(int j=low;j<=high;j++)
          b[j]=1;
    }
    for(int i=1;i<101;i++)
     {
       if(b[i]==0)
         count++;
     }
     return count;
  }
}
