//QuickSort
import java.util.Scanner;
class QuickSort{
  public static void main(String sha[]){
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=obj.nextInt();
    int[] a=new int[n];
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++)
    {
      a[i]=obj.nextInt();
    }
    QuickSort A=new QuickSort();
    a=A.quick(a,0,a.length);
    for(int i=0;i<n;i++)
    {
      System.out.print(" "+a[i]);
    }
  }
  public int[] quick(int a[],int p,int r)
  {
    if(p<r)
    {
      int q=partition(a,p,r);
      quick(a,p,q);
      quick(a,q+1,r);
    }
    return a;
  }
  public int partition(int a[],int p,int r)
  {
    int i=p-1;
    int k=a[r-1];
    for(int j=p;j<r-1;j++)
    {
      if(a[j]<=k)
      {
        i++;
        int c=a[j];
        a[j]=a[i];
        a[i]=c;
      }
    }
    i++;
    int c=a[r-1];
    a[r-1]=a[i];
    a[i]=c;
  /*  for(int l=0;l<a.length;l++)
    {
      System.out.print(" "+a[l]);
    }*/
    return i;
  }
}
