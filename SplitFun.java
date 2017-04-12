import java.util.*;
class SplitFun{
  public static void main(String sha[])
  {
    /*
    Scanner obj=new Scanner(System.in);
    String s=obj.nextLine();
    String[] sr=s.split(" ");
    int r=Integer.parseInt(sr[0]);

    int k=Integer.parseInt(sr[1]);
    //String[] s=r.split(" ");
    //for(int i=0;i<s.length;i++)
      System.out.print(r+"\n"+k);
      */
      //int date=Calendar.DATE;
      Date date=new Date(2016,8,22);

      //Calendar rightNow = Calendar.getInstance();
      System.out.println(date.getDay());
  }
}
