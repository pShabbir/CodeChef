
import java.util.*;
class KeyWordTransposition{
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    String in=obj.nextLine();
    char arr[]=new char[in.length()];
    ArrayList<Integer> a=new ArrayList<Integer>();
    for (int i=0;i<in.length();i++ ) {
      arr[i]=in.charAt(i);
    }
    for(int i=0;i<arr.length;i++){
      for (int j=i+1;j<arr.length ;j++ ) {
        if(arr[i]==arr[j])
          arr[j]=0;
      }
    }
    for (char c :arr ) {
      if(c!=0)
        a.add(c-64);
    }
    in=obj.nextLine();
    String test[]=in.split(" ");
    int row=test.length;
    in = in.replaceAll(" ","");
    int column=a.size();
    int ser=0;
    int[][] matrix=new int[row][column];
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++)
          {
            if(ser==in.length())
              {
                break;
              }
            matrix[i][j]=in.charAt(ser);
            ser++;
          }
          if(ser==in.length())
            {
              break;
            }

    }
    for (int i=0;i<row ;i++ ) {
      for (int j=0;j<column ;j++ ) {
        System.out.print((char)matrix[i][j]);
      }
      System.out.println();
    }
    for(int i=0;i<a.size();i++){
      int x=a.lastIndexOf(Smallest(a));
      a.remove(x);
      for(int j=0;j<row;j++)
        System.out.print(" "+(char)matrix[j][x]);
      System.out.println();
    }

    // System.out.println(in);
    // System.out.println(a);
  }
  public static int Smallest(ArrayList<Integer> arr){
    Integer[] a=new Integer[arr.size()];
    a=arr.toArray(a);
    Arrays.sort(a);
    return a[0];
  }
}
