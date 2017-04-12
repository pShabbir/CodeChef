//Almost Sorted Permutation
import java.io.*;

class AlmostSorted {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    claculate(arr);
  }
  public static void claculate(int arr[])
  {
    int check=0;
    int sorted[]=java.util.Arrays.copyOf(arr,arr.length);
    java.util.Arrays.sort(sorted);
    for(int i=1;i<sorted.length-1;i++){
      int k=sorted[i];
      if(k==arr[i] || k==arr[i-1] || k==arr[i+1])
        check=1;
      else
        {
          check=99;
          break;
        }
      }
      if(sorted[0] != arr[0] || sorted[0] != arr[1])
        check = 99;
      if(sorted[sorted.length-1] != arr[sorted.length-1] || sorted[sorted.length-1] != arr[sorted.length-2])
        check = 99;

      if(check==99)
        System.out.println("NO");
      else
        System.out.println("YES");

    }


}
