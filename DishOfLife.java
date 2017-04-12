import java.util.*;
class DishOfLife{
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
  //  System.out.println("Enter the test Case");
    int n=obj.nextInt();
    for (int i=0;i<n ;i++ ) {
      calculate(obj);
    }
  }

  public static void calculate(Scanner obj){
    int n=obj.nextInt();
    int k=obj.nextInt();
    String s="";
    int arr[]=new int[k];
    // int island[]=new int[n];
    int lastIsland=-1;
    for (int i=0;i<k ;i++ ) {
      arr[i]=0;
    }
    for (int i=0;i<n ;i++ ) {
      int l=obj.nextInt();
      for (int j=0;j<l ;j++ ) {
        int m=obj.nextInt();
        m--;
        if(arr[m]==0){
          arr[m]=1;
          lastIsland = i+1;
        }
        //arr[m] += 1;
      }
    }
    int counter=0;
    for (int i=0;i<k ;i++ ) {
      if(arr[i] != 0)
        counter++;
    }
    if(counter == k){
      if(lastIsland == n)
        s="all";
      else
        s="some";
    }else{
      s="sad";
      }
        System.out.println(s);
  }
}
