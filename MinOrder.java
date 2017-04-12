import java.io.*;
class MinOrder{
  public static void main(String sha[])
  {
    try{
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
      //System.out.println("Enter the test case");
      int t=Integer.parseInt(obj.readLine());
      int a[]=new int[t];
      //System.out.println("Enter the amount");
      for(int i=0;i<t;i++)
          {

            a[i]=Integer.parseInt(obj.readLine());
          }


      for(int i=0;i<t;i++)
      {



            int m=a[i];
            int count=0;
            while(m>2048)
            {
              m=m-2048;
              count++;
            }
            while(m>0)
            {
              if(m%2!=0)
                count++;
              m=m/2;
            }
            System.out.println(count);

        }
    }
    catch(Exception ex)
    {

    }
  }
}
