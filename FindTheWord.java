import java.util.*;
import java.util.regex.*;
class FindTheWord{
  public static void main(String[] args) {

    Scanner obj=new Scanner(System.in);
    Scanner obj2=new Scanner(System.in);
    int n=obj.nextInt();
    String[] arr=new String[n];
    for(int i=0;i<n;i++){
      arr[i]=obj2.nextLine();
    }
    int q=obj.nextInt();
    for(int i=0;i<q;i++){
      String in=obj.next();
      getResult(in,arr);
    }

  }
  public static void getResult(String s,String[] arr){
    Pattern pattern= Pattern.compile("\\w"+s+"\\w");//"([a-zA-Z]|[0-9]|_)+(is)([a-zA-Z]|[0-9]|_)+"
    for(int i=0;i<arr.length;i++){
      int count=0;
      Matcher matcher = pattern.matcher(arr[i]);
      while(matcher.find()){
       count++;
     }
      System.out.println(count);
    }
  }
}
