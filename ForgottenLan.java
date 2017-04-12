import java.util.Scanner;
class ForgottenLan{
  private static String a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{
        ForgottenLan A=new ForgottenLan();
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
            System.out.println(a[i]+" ");
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
    String s=obj.nextLine();
    String[] sr=s.split(" ");
    int n=Integer.parseInt(sr[0]);
    int k=Integer.parseInt(sr[1]);
    String[] fl=new String[n];
    String[] nl=new String[k];
    String fls=testCase();
    fl=fls.split(" ");
    for(int i=0;i<k;i++)
    {
      nl[i]=testCase();
    }
    for(int i=0;i<n;i++)
    {
      
      for(int j=0;j<k;j++)
      {
        if(nl[j].contains(fl[i]))
        {
          fl[i]="YES";
          break;
        }
      }
      if(!fl[i].equals("Yes"))
         fl[i]="NO";
    }
    s="";
    for(int i=0;i<n;i++)
      s += fl[i]+" ";

    return s;
  }
}
