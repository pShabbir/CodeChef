import java.util.*;
class GradingStudent{
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    ArrayList<Integer> arr=new ArrayList<Integer>();
    for (int i=0;i<n;i++ ) {
      arr.add(obj.nextInt());
    }
    for (int i =0;i<n;i++ ) {
      int m=(arr.get(i))%5;
      if(m>2 && (arr.get(i)>37))
        {
          int k=arr.get(i)+(5-m);
          arr.set(i,k);
        }
    }
    for (int i :arr ) {
      System.out.println(i);
    }
  }
}
