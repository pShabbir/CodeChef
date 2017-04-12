import java.io.*;
class ThreeWayC {
  static double d[]=new double[6];
  static String s[];
  public static void main(String sha[])
  {
  try{
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    //Enter the test case
    int n=Integer.parseInt(obj.readLine());
    s=new String[n];
    //Now runing program for test case and taking Input
    for(int i=0;i<n;i++)
    {
          //Enter the value of range
          int r=Integer.parseInt(obj.readLine());
          int ax=Integer.parseInt(obj.readLine());

          int ay=Integer.parseInt(obj.readLine());

          int bx=Integer.parseInt(obj.readLine());
          int by=Integer.parseInt(obj.readLine());
          int cx=Integer.parseInt(obj.readLine());
          int cy=Integer.parseInt(obj.readLine());
          d[0]=Math.abs(Math.sqrt(Math.pow((ax-bx),2)+Math.pow((ay-by),2)));
          d[1]=Math.abs(Math.sqrt(Math.pow((bx-cx),2)+Math.pow((by-cy),2)));
          d[2]=Math.abs(Math.sqrt(Math.pow((cx-ax),2)+Math.pow((cy-ay),2)));
          d[3]=d[1]+d[2];
          d[4]=d[0]+d[1];
          d[5]=d[0]+d[2];
                  //  System.out.println("hi "+d[3]+" "+d[4]+" "+d[5]);
                    int lo=2*r;
          if( d[3]<=lo && d[4]<=lo && d[5]<=lo)
          {
            s[0]="yes";
          }
          else
          {
            s[0]="no";
          }

        }
        for(int i=0;i<n;i++)
        {
          System.out.println(s[i]);
        }
    }
    catch(Exception ex)
    {

    }
  }
}
