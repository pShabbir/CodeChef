import java.util.*;
class Demo{
  //static  int a[]=new int[100];
    public static void main(String sha[])
    {    Scanner obj=new Scanner(System.in);
          Demo A =new Demo();
          System.out.println(A.myPower(obj.nextInt()));
    }
    public int myPower(int a)
    {
      int x=2,count=1,j=0;
      if(a==1)
       count=0;
      else
       {
         while(x!=a)
         {
           x=x*2;
           count++;
         }

       }
       return count;
    }
}
