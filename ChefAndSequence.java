import java.util.Scanner;
class ChefAndSequence{
  private static String a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{
        ChefAndSequence A=new ChefAndSequence();
        //Enter the test case
        int n=Integer.parseInt(A.testCase());
        a=new String[n];
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
  public String testCase()
  {

       return  obj.nextLine();
  }
  public String cal(){
     String l1=testCase();
     String l2=testCase();
     String l3=testCase();
     String l4=testCase();
     boolean p=l2.contains(l4);
     if(!p)
      return "No";
     else
      return "Yes";
  }
}
