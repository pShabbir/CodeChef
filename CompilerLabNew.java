import java.io.*;
import java.util.regex.*;
import java.util.*;
class CompilerLabNew{
  public static void main(String[] args) {
    String[] keywords={"printf","int","float","double","null","true","print","println"};
    String[] operator={"+","-","*","%","=","=="};
    StringBuffer input=new StringBuffer();
    try{
      BufferedInputStream in=new BufferedInputStream(new FileInputStream("my.txt"));
      int t=in.read();
      while(t!=-1){
        input.append((char)t);
         t=in.read();
       }
       String l=new String(input);
       System.out.println("Given Input sequence is");
       System.out.println(l);
       String[] sh1=l.split(" ");
       ///////////////
       ArrayList<String> sh=new ArrayList<String>();
       for (String s :sh1 ) {
         sh.add(s);
       }

       /////////////////////////////
       System.out.println("///////////////////////////////////");
       System.out.println("OUTPUT");

       for(int i=0;i<sh.size();i++){
         for(int j=0;j<keywords.length;j++){
            if(isKeyword(sh.get(i),keywords[j])){
              {
                System.out.println(keywords[j]+" is a keyword");
                sh.remove(i);
                break;
              }
            }
         }
      }
      //////////////////////////////
      for(int i=0;i<sh.size();i++){
        for(int j=0;j<operator.length;j++){
           if(isOperator(sh.get(i),operator[j]))
            {
              System.out.println(operator[j]+" is a operator");
              sh.remove(i);
              break;
            }

        }
     }
      //  matchKeyword(st);
      //  matchOperators(st);
       matchIdentifier(sh);

    }catch(Exception e){}
  }
  public static boolean isKeyword(String sh,String keywords){
    if(sh.contains(keywords)){
          return true;
        }
      else{
        return false;
      }

  }
  public static boolean isOperator(String sh,String keywords){
    if(sh.contains(keywords)){
          return true;
        }
      else{
        return false;
      }
  }
  public static void matchIdentifier(ArrayList<String> sh){
    Pattern pattern= Pattern.compile("([A-Za-z])+([0-9])*");
    for(int i=0;i<sh.size();i++){
      Matcher matcher = pattern.matcher(sh.get(i));
      if(matcher.find()){
          System.out.println(matcher.group() +" is an identifier");
      }
        //System.out.println(matcher.group());
    }

  }

}
