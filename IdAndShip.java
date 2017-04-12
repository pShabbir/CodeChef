import java.util.Scanner;
class IdAndShip{
  private static String a[];
  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);
    //Enter the test case
    int  n=obj.nextInt();
    a=new String[n];
    for(int i=0;i<n;i++)
       {
            a[i]=ship(obj.next());
           }
      System.out.println();
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
  }
  public static String ship(String s){
     String g="";
    if(s.equalsIgnoreCase("b"))
     {
       g="BattleShip";
     }
     else if (s.equalsIgnoreCase("c")) {
       g="Cruiser";

     }
     else if (s.equalsIgnoreCase("d")) {
       g="Destroyer";

     }
     else if (s.equalsIgnoreCase("f")){
       g="Frigate";
     }
     return g;
  }
  }
