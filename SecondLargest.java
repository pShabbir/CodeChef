//We have to find smallest sum in given array of number

import java.util.Scanner;
class SecondLargest{
  private static int a[],b[],n;


  public static void main(String sha[])
  {

    Scanner obj=new Scanner(System.in);
    try{
       SecondLargest A=new SecondLargest();
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

          a=new int[3];
          for(int j=0;j<3;j++)
          {
            a[j]=obj.nextInt();
          }
       m=second(a);

    }
    catch (Exception e) {

    }
    return m;
  }
  public int second(int a[])
  {
    java.util.Arrays.sort(a);
    return (a[1]);

  }

}
