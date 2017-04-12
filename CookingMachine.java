// 4 1 least possible way is 2
import java.util.Scanner;
class CookingMachine{
  private static int a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{
        CookingMachine A=new CookingMachine();
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
    return obj.nextInt();
  }
  public int cal()
  {
    int a=testCase();
    int b=testCase();
    int count=0;
    b=myPower(b);
    if(a==1)
     a=0;
    else{
      if(a%2==0)
       {
         a=myPower(a);
       }
       else
        {
          count++;
          a=(a-1)/2;
          a=myPower(a);
        }
    }
      count += Math.abs(b-a);
      return count;
  }

  public int myPower(int a)
  {
    int x=2,count=1,j=0;
    if(a==1)
     count=0;
    else
     {
       while(x!=a)
       {
         x=x*2;
         count++;
       }

     }
     return count;
  }

}
