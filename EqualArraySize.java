///have the array equal number as itss size eg a{1,1,1} size 3
import java.util.*;
class EqualArraySize{
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int arr[]=new int[n];
    //ArrayList<Integer> arr=new ArrayList<Integer>();
    for (int i=0;i<n ;i++ ) {
      arr[i]=obj.nextInt();
    }
    HashMap<Integer,Integer> mySet=new HashMap<Integer,Integer>();
    int count=0;
    Arrays.sort(arr);
    int object=arr[0];
    for (int i=0;i<n ;i++ ) {
      for (int j=0;j<n ;j++ ) {
          if(arr[i]==arr[j])
              count++;
      }
      mySet.put(arr[i],count);
      object=arr[i];
      count=0;
    }
    ArrayList<Integer> o=new ArrayList<Integer>();
    for (Integer i :mySet.keySet() ) {
      //System.out.println(mySet.get(i));
      o.add(mySet.get(i));
    }
    count=o.get(0);
    for (int i=1;i<o.size() ;i++ ) {
      if(count < o.get(i))
        count = o.get(i);
    }
    System.out.println("Ans :"+(n-count));
  }
}
