import java.io.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.InputMismatchException;

class PoloNew {
  	private static final int MOD = 1000000007;
  public static void main(String[] args) {
        try{
          // //Scanner obj=new Scanner(System.in);
          // BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
          // //Test classe
        //  InputReader in = new InputReader(System.in);
      		//OutputWriter out = new OutputWriter(System.out);
      		//int k = in.readInt();
          //int k=Integer.parseInt(obj.readLine());
          //for(int i=0;i<k;i++){
            // String s=obj.readLine();
            // String sh[]=s.split(" ");
            // long L=Long.parseLong(sh[0]);
            // long R=Long.parseLong(sh[1]);
            // int L = in.readInt();
            // int R = in.readInt();
            // calculate(L,R);
          //////////////////////////////////////////
          BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        		int T=Integer.parseInt(obj.readLine());
        		while (T-- > 0) {
              String s=obj.readLine();
              String sh[]=s.split(" ");
              int L=Integer.parseInt(sh[0]);
              int R=Integer.parseInt(sh[1]);
        //			System.out.println(ans(a, R) - ans(a, L-1));
        			long ans = ans(R) - ans(L-1);
        			if(ans < 0) {
        				ans += MOD;
        			}
        			System.out.println(ans);
        		}
        		//out.close();
        }catch(Exception e){}
      }


  public  static int digits(int num) {
      int count = 0;
      while (num > 0) {
        num /= 10;
        count++;
      }
      return count;
    }

  public  static long ans(int num) {
      long ans = 0;
      long from = 1;
      long to;
      long result;
      int digit = 1;
      while(from <= num) {
        to = from * 10 - 1;
        to = Math.min(to, num);
        result = (to-from + 1)*(from + to)/2;
        ans += result * digit;
        from *= 10;
        digit++;
      }
      ans %= MOD;
      return ans;
    }


}
