//We have to find smallest sum in given array of number
//import java.io.*;
import java.util.Scanner;
class CombinationOfTwo{
  private static int a[],b[],n;


  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);
    try{
       CombinationOfTwo A=new CombinationOfTwo();
      // Scanner obj=new Scanner(System.in);
      //Enter the test case
      n=obj.nextInt();
      b=new int[n];

      for(int i=0;i<n;i++)
         {
          //For every test case
           b[i]=A.input();
         }
         System.out.println();
       for(int i=0;i<n;i++)
      {
        System.out.println(b[i]);
      }
    }
    catch(Exception ex)
    {

    }
  }
  public int input()
  {
    Scanner obj=new Scanner(System.in);
    int m=0;
    try{
          int k=obj.nextInt();
          a=new int[k];
          for(int j=0;j<k;j++)
          {
            a[j]=obj.nextInt();
          }
       m=smallestSum(a);

    }
    catch (Exception e) {

    }
    return m;
  }
  public int smallestSum(int a[])
  {
    java.util.Arrays.sort(a);
    return (a[0]+a[1]);
  }

}
