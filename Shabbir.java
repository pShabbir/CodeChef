import java.io.*;
class Shabbir {
  public static void main(String sha[])
  {
          try{
                BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
                /*System.out.println("Enter the String and Dispalying it");
                String s=obj.readLine();
                System.out.println("String is = "+s);
                System.out.println("Enter the Int and Dispalying it");
                int i=Integer.parseInt(obj.readLine());
                System.out.println("The Integer value is = "+i);
                System.out.println("Enter the Double and Dispalying it");
                Double k=Double.parseDouble(obj.readLine());
                System.out.println("The Double value is = "+k);*/
                // System.out.println("Enter the String and Dispalying it");
                // String s=obj.readLine();
                // String[] test=s.split(" ");
                // for(int i=0;i<test.length;i++){
                //   System.out.print(" "+(Integer.parseInt(test[i])+5));
                // }
                //   System.out.println();
                int a[]={5,4,3,2,1};
                java.util.Arrays.sort(a);
                for (int i=0;i<a.length;i++)
                    System.out.print(" "+a[i]);

              }
            catch(Exception ex)
            {

            }
  }
}
