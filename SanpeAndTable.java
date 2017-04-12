//We have to find max and min value of a side of a triangle
import java.util.Scanner;
class SanpeAndTable {
private static  double[] B,LS;
  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);
    //Enter the test Case
    int n=obj.nextInt();
    B=new double[n];
    LS=new double[n];
    //Enter the side B and LS to help find RS
    for(int i=0;i<n;i++)
    {
      B[i]=obj.nextDouble();
      LS[i]=obj.nextDouble();
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(Math.sqrt(Math.pow(LS[i],2)-Math.pow(B[i],2))+" ");
      System.out.print(Math.sqrt(Math.pow(B[i],2)+Math.pow(LS[i],2)));
      System.out.println();

    }
  }
}
