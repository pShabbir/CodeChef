import java.util.Scanner;
class CuttingReciepe
{
  private static int[] N,R;//Array to store test case and reciepe
  private static String result[];
  static int counter=1;
  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);
    //Enter the test Case
    int n=obj.nextInt();
    N=new int[n];
    R=new int[50];

    result=new String[n];
    //Enter the first total reciepe then number which denoting quantity of each reciepe
    for(int i=0;i<n;i++)
    {
      int m=obj.nextInt();
          result[i]="";

        for(int j=0;j<m;j++)
        {
          R[j]=obj.nextInt();
        }
         counter=R[0];
         for(int j=1;j<m;j++)
         {
           if(R[j]<counter)
              counter=R[j];
         }
        for(int j=0;j<m;j++)
        {
          double r=Math.floor(R[j]/counter);
          result[i] +=r + " ";
        }

    }

    for(int i=0;i<n;i++)
    {
      System.out.println(result[i]);
    }

  }
}
