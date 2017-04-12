import java.util.Scanner;
class MinMax{
  private static int a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{

        MinMax A=new MinMax();
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
    int sum=0;
    //Enter the size of array
    int n=testCase();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
        arr[i]= testCase();
    for(int i=0;i<n-1;i++)
    {
      if(arr[i]==arr[i+1])
          break;
      if(arr[i]>arr[i+1])
         sum += arr[i+1];
      else
         sum += arr[i];
    }
    return sum;
  }
}
