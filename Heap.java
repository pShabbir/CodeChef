import java.util.Scanner;
class Heap{
  int heap_size;

  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the Total no of elements");
    int n=obj.nextInt();
    int []a=new int[n];
    System.out.println("Enter the elements in array");
    for(int i=0;i<n;i++)
    {
      a[i]=obj.nextInt();
    }
    Heap A=new Heap();
    int[] l=A.heapSort(a);
    for(int i=0;i<n;i++)
    {
      System.out.print(" "+a[i]);
    }
  }
  public int[] heapSort(int a[])
  {
    buildmaxheap(a);
    for(int i=(a.length-1);i>0;i--)
    {
      int c=a[i];
      a[i]=a[0];
      a[0]=c;
      heap_size--;
      maxheapify(a,0);
    }
    return a;
  }
  public void buildmaxheap(int []a)
  {
    heap_size=a.length-1;
    for(int i=((a.length-1)/2);i>=0;i--)
    {
      maxheapify(a,i);
    }
  }
  public void maxheapify(int a[],int i)
  {
    int larg=0;
    int l=2*i+1;
    int r=2*i+2;
    if(l<=heap_size && a[l]>a[i])
      larg=l;
    else
       larg=i;
    if(r<=heap_size && a[r]>a[larg])
      larg=i;
    if (larg != i)
      {
        int c=a[i];
        a[i]=a[larg];
        a[larg]=c;
        maxheapify(a,larg);
      }
  }

}
