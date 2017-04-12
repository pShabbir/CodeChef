import java.util.Scanner;
class HeadBob{
  private static int b[],n;
  private static char a[];


  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);

       HeadBob A=new HeadBob();
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
         switch(b[i])
         {
           case 1:  System.out.println("NOT INDIAN");
                    break;
          case 2:System.out.println("INDIAN");
                   break;
          default:System.out.println("NOT SURE");


         }
      }


  }
  public int input()
  {
    Scanner obj=new Scanner(System.in);
    int m=0;

          int k=obj.nextInt();
          a=new char[k];
          String s=obj.next();
          m=Calculate(s);

    return m;
  }
  public int Calculate(String a)
  {
    int r=0;
    for(int i=0;i<a.length();i++)
    {
      if(a.charAt(i)=='Y')
      {  r=1;
          break;
}
      else
        if(a.charAt(i)=='I')
{          r=2;
            break;
              }
      else
        r=0;


    }
          return r;
  }
}
