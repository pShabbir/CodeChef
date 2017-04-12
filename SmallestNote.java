//To find smallest Combination of notes
import java.util.Scanner;
class SmallestNote{
  private static int a[];
  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);
    //Enter the test case
    int n=obj.nextInt();
    a=new int[n];
    SmallestNote A=new SmallestNote();
    for(int i=0;i<n;i++)
       {
         a[i]=A.noOfNotes(obj.nextInt());
       }
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
  }
  public int noOfNotes(int n)
  {
    int m=n;
    int count=0;
    while(m!=0)
    {
      if(m>=100)
      {
        count += m/100;
        m=m%100;
      }
      if(m>=50)
      {
        count += m/50;
        m=m%50;
      }
      if(m>=10)
      {
        count += m/10;
        m=m%10;
      }
      if(m>=5)
      {
        count += m/5;
        m=m%5;
      }
      if(m>=2)
      {
        count += m/2;
        m=m%2;
      }
      if(m>=1)
      {
        count += m/1;
        m=m%1;
      }

    }
    return count;
  }

}
