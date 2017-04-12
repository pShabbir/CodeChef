import java.util.Scanner;
class InputModel
{
  private int a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    InputModel A=new InputModel();
    //Enter the test Case
    int n=A.testCase();

    for(int i=0;i<n;i++)
    {
      a[i]=A.cal();
    }
   for(int i=0;i<n;i++)
   System.out.println();
   {
     System.out.println(a[i]);
   }
  }
  public int testCase(){

         return obj.nextInt();
  }
}
