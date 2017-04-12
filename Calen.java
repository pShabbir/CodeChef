import java.util.*;
import java.text.*;
class Calen{
  private static String a[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{
        Calen A=new Calen();
        //Enter the test case
        int n=A.testCase();
        a=new String[n];
        for(int i=0;i<n;i++)
           {
                a[i]=A.cal();
               }

          System.out.println();
         for(int i=0;i<n;i++)
         {
                System.out.println(a[i]);
         }
    }
    catch (Exception e) {

    }
  }
  public int testCase()
  {

       return  obj.nextInt();
  }
  public String cal(){
    int y=testCase();
    Date date=new Date(y,0,1);
     //Calendar calendar = Calendar.getInstance();
    //calendar.setTime(date);
    //System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
    System.out.println(simpleDateformat.format(date));
    int d=date.getDay();
    System.out.println(d);
    String day="";
    switch(d){
      case 2:day="sunday";
                 break;
      case 3:day="monday";
                 break;
      case 4:day="tuesday";
                 break;
      case 5:day="wednesday";
                 break;
      case 6:day="thursday";
                 break;
      case 0:day="friday";
                 break;
      case 1:day="saturday";
                 break;
    }
    return day;
  }
}
