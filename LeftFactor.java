//Cd Lab program
import java.util.*;
class LeftFactor{
  public static void main(String[] args) {
    String input="A -> aB/aC/aD/b1/b2/b3";
    String[] tokens=input.split("->");
    String left=tokens[0].trim();
    tokens=tokens[1].split("/");
    // for (String s :tokens ) {
    //   System.out.println(s);
    // }
    int count=0;
    char b=tokens[1].charAt(0);
    for (int i=0;i<tokens.length ;i++ ) {
      tokens[i]=tokens[i].trim();
      if(b==tokens[i].charAt(0))
        count++;
      else
        break;
    }
    System.out.println("Production in which left factoring be removed\n"+input);
    String[] newPod=new String[count];
    String[] newTokens=new String[tokens.length-count];
    for(int i=0;i<count;i++){
      newPod[i]=tokens[i].charAt(1)+"";
      newTokens[i]=tokens[i+count];
    }
    String left1=left+"'";
    System.out.print(left+"->"+b+left1);
    for (String s :newTokens ) {
      System.out.print("/"+s);
    }
    System.out.println();
    System.out.print(left1+"->");
    for (String s :newPod ) {
      System.out.print(s+"/");
    }





  }
}
