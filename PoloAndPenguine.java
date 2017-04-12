//import java.util.Scanner;
import java.io.*;
class PoloAndPenguine {
  public static void main(String[] args) {
        try{
          //Scanner obj=new Scanner(System.in);
          BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
          //Test classe
          int k=Integer.parseInt(obj.readLine());
          for(int i=0;i<k;i++){
            String s=obj.readLine();
            String sh[]=s.split(" ");
            long L=Long.parseLong(sh[0]);
            long R=Long.parseLong(sh[1]);
            calculate(L,R);
        }
      }catch(Exception e){

      }
}
  public static void calculate(long L,long R){
    long sum=0;
    for(long i=L;i<=R;i++){
      int h=noOfDigit(i);
      sum +=(h*i);
    }
    sum = sum%(1000000007);
    System.out.println(sum);
  }
  public static int noOfDigit(long i){
    int k=0;
    while(i>0){
      i=i/10;
      k++;
    }
    return k;
  }
}
