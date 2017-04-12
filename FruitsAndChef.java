import java.util.Scanner;
class FruitsAndChef{
  private static int a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{

        FruitsAndChef A=new FruitsAndChef();
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
    int k=0;
    int a=testCase();
    int o=testCase();
    int g=testCase();
    if((Math.abs(a-o))<g)
      k=0;
    else
    {
      int r=a+g;
      int dif=Math.abs(r-o);
      r=o+g;
      int dif2=Math.abs(r-a);
      if(dif<=dif2)
         k=dif;
      else {
        k=dif2;
      }
    }
    return k;
  }
}
