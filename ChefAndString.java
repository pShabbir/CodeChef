import java.util.Scanner;
class ChefAndString{
  //private static int a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{
        ChefAndString A=new ChefAndString();
        //Enter the test case
        //int n=Integer.parseInt(A.testCase());
        //a=new int[n];
        //for(int i=0;i<n;i++)
          // {
                int c=A.cal();
            //   }

          //System.out.println();
          //for(int i=0;i<n;i++)
            // {
               System.out.println(c);
              //   }

    }
    catch (Exception e) {}
  }
  public String testCase()
  {

       return  obj.next();
  }

  public int cal(){
    String s=testCase();
    int a[]=new int[4];
    for (int i=0;i<4 ;i++ ) {
      a[i]=0;
    }
    for(int i=0;i<s.length();i++)
    {
      char c=s.charAt(i);
      if(c=='C')
        a[0]++;
      if(c=='H')
        a[1]++;
      if(c=='E')
        a[2]++;
      if(c=='F')
        a[3]++;
    }
    java.util.Arrays.sort(a);
    return a[0];
  }
}
