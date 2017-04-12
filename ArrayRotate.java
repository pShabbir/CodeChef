import java.util.*;
class ArrayRotate{
  static int[] arr;
  static int[] arr2;
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int k=obj.nextInt();
    int q=obj.nextInt();
     arr=new int[n];
     arr2=new int[n];
    for (int i=0;i<n ;i++ ) {
      arr[i]=obj.nextInt();
    }
    k=k%n;
    for (int i=0;i<n ;i++ ) {
      arr2[i]=arr[(i-k+n)%n];
    }

  for (int i=0;i<q;i++ ) {

      System.out.println(arr2[obj.nextInt()]);
  }


  }
}
