import java.util.Scanner;
class Stick
{
  private static int a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    Stick A=new Stick();
    //Enter the test Case
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
  public int testCase(){

         return obj.nextInt();
  }
  public int cal(){
    //Enter no of stick
    int n=testCase();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=testCase();
    }
    int area=0;
    java.util.Arrays.sort(arr);
    //int k[]=java.util.Arrays.copyOfRange(arr,0,3);
    for(int i=0;i<(n-3);i++)
    {
      area=myCal(java.util.Arrays.copyOfRange(arr,0,i+3),area);
    }
    /* if(n<4)
     {
       area=-1;
     }
     else
     {
       for(int i=0;i<n-3;i++)
       {
         ///System.out.print(" "+k[i]);
         if((a[i]==a[i+1])&&(a[i+2]==a[i+3]))
         {
           int s=a[i]*a[i+2];
           area=Math.max(s,area);
         }
       }
     }*/
      return area;


  }
  public int myCal(int arr[],int area)
  {
    int s=0;
    if((arr[i]==arr[i+1])&&(arr[i+2]==arr[i+3]))
    {
      int s=arr[i]*arr[i+2];
      area=Math.max(s,area);
    }
    return area;
  }
}
