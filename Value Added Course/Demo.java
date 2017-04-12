import java.util.Scanner;
class Demo{
      public static void main(String sha[])
      {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array");
        StringBuffer s=new StringBuffer("ABCD");
        String h="0";
         s.replace(0,1,h);
          System.out.println("  "+s);
        //int n=obj.nextInt();
        //int a[]=new int[n];
      /*  for(int i=0;i<n;i++)
        {
          try{

              if(i==(n-1))
               throw new Exception();
              else
               System.out.print(" "+a[i]);
          }
          catch (Exception e)
          {
               System.out.print("Array Index Out Of Bound Exception");
          }
        }*/
      }
}
