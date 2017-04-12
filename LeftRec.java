//CD Lab removing left Recursion

import java.util.*;
class LeftRec{
  public static void main(String[] args) {
    //String input="L -> L,S/S";
    //String input="E -> E+T/T";
    String[] arr={"L -> L,S/S","E -> E+T/T","T -> T*F/F"};
    for (String input : arr ) {
      String[] tokens=input.split("->");
      String left=tokens[0].trim();
      String right=tokens[1].trim();

      String[] product=right.split("/");
      // for (String s :product ) {
      //   System.out.println(s);
      // }

      if(left.equals(product[0].charAt(0)+""))
        product[0]=product[0].substring(1);
      String alpha=new String(product[0]);
      String beta=new String(product[1]);
      String newProduction=left+"'";

        System.out.println(beta+newProduction);
        System.out.print("null/");
        System.out.println(alpha+newProduction);
    }
        //System.out.println(product[0]);
  }
}
