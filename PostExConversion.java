//Converting expression in post fix expression
import java.io.*;
class PostExConversion{
  private  int counter;
  private  int b[];
  public static void main(String sha[])
  {
    try{

      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
      String myexpression[]=new String[100];
      int n=Integer.parseInt(obj.readLine());
      for(int i=0;i<n;i++)
       myexpression[i]=obj.readLine();
       PostExConversion myObj=new PostExConversion();
      for(int i=0;i<n;i++)
      {
        myObj.printExpression(myexpression[i]);
        System.out.println();
      }
    }
    catch(Exception ex)
    {
         System.out.println(ex);
    }
  }
  public  void printExpression(String ex)
  {
    b=new int[ex.length()];
    for(int i=0;i<ex.length();i++){
      b[i]=0;
    }
     int cd=0;
    for(int i=0;i<ex.length();i++)
    {
      char ch=ex.charAt(i);
      cd=(int)ch;
      if(cd>96&&cd<123)
        {
          counter=cd;
          cd=33;
        }
      switch(cd)
      {
        case 33: System.out.print((char)counter);
                 break;

        case 41:
                   for(int j=i;j>=0;j--)
                   {
                     if(b[j]==40)
                     {
                       b[j]=0;
                       break;
                     }
                     if(b[j]!=0 && j>=0)
                        {
                          System.out.print((char)b[j]);
                          b[j]=0;
                          j--;
                        }

                   }
                   break;
            default:b[i]=cd;

      }
    }

  }
}
