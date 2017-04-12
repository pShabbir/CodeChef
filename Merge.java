import java.util.Scanner;
class Merge{

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
    Merge A=new Merge();
    int[] l=A.break1(a,0,a.length-1);
    for(int i=0;i<n;i++)
    {
      System.out.print(" "+a[i]);
    }
  }
  public static int[] break1(int b[],int p,int r)
  {
     int[] z=null;
    if(p<r)
     {
       int q=(((p+r)/2));
       break1(b,p,q);
       break1(b,q+1,r);
       z=combine(b,p,q,r);
     }
     return z;
  }
  public static int[] combine(int c[],int p,int q,int r)
  {
    int i=0,j=0;
    int sum1=0;
    int n1=q-p+1;
    int n2=r-q;
    int l[]=new int[n1+1];
    int ri[]=new int[n2+1];
    for(i=0;i<n1;i++)
    {
      l[i]=c[i+p];  
      sum1 += c[i+p];
    }

    for(i=0;i<n2;i++)
    {
      ri[i]=c[i+q+1];
      sum1 += c[i+q+1];
    }
    l[n1]=sum1;
    ri[n2]=sum1;
    i=0;
    j=0;
    for(int k=p;k<=(r);k++)
    {
      if(l[i]<=ri[j])
      {
        c[k]=l[i];
        i++;
      }
      else
      {
        c[k]=ri[j];
        j++;
      }
    }
    return c;
  }
}
