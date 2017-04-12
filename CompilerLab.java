import java.io.*;
import java.util.regex.*;
class CompilerLab{
  public static void main(String[] args) {


    StringBuffer input=new StringBuffer();
    try{
      // InputStream f=new FileInputStream("my.txt");
      // int n=f.available();
      // byte[] b=new byte[n];
      // f.read(b);
      BufferedInputStream in=new BufferedInputStream(new FileInputStream("my.txt"));
      int t=in.read();
      while(t!=-1){
        //System.out.print(""+(char)t);
        input.append((char)t);
         t=in.read();
       }
       String l=new String(input);
       String[] st=l.split(" ");
       matchKeyword(st);
       matchOperators(st);
       matchIdentifier(st);
       //matchKeyword(l);
      //  System.out.print(input);
      //  for(int i=0;i<st.length;i++){
      //    System.out.println(st[i]);
      //  }
      //for(int i=0;i<n;i++)
        //System.out.print(""+(char)b[i]);
        // System.out.print(""+(char)f.read());
      // f.close();
      // OutputStream fo=new FileOutputStream("my2.txt");
      // String app="This is the start of a new era";
      // byte[] bo=app.getBytes();
      // fo.write(bo);
    }catch(Exception e){}
  }
  public static void matchKeyword(String[] sh){
      String[] keywords={"printf","int","float","double","null","true","print","println"};
      int m=0;
      for(int i=0;i<sh.length;i++){
        for(int j=0;j<keywords.length;j++){
          if(sh[i].contains (keywords[j])){
            System.out.println(keywords[j]+" is a keyword");
            break;
          }
      }

      }
  }
  public static void matchOperators(String[] sh){
        String[] operator={"+","-","*","%","=","==",","};
      int m=0;
      for(int i=0;i<sh.length;i++){
        for(int j=0;j<operator.length;j++){
          if(sh[i].contains (operator[j])){
            System.out.println(operator[j]+" is a operator");
            break;
          }
      }

      }
  }
  public static boolean isOperators(String sh){
        String[] operator={"+","-","*","%","=","==",","};
        boolean m=false;
      for(int i=0;i<operator.length;i++){
          if(sh.contains(operator[i]))
            {
              m=true;
              break;
            }

          }
          return m;
      }
      public static boolean isKeyword(String sh){
          String[] keywords={"printf","int","float","double","null","true","print","println"};
          boolean m=false;
          for(int i=0;i<keywords.length;i++){
              if(sh.contains(keywords[i]))
                {
                  m=true;
                  break;
                }

              }
              return m;
      }


  public static void matchIdentifier(String[] sh){
    Pattern pattern= Pattern.compile("([A-Za-z])+([0-9])*");
    for(int i=0;i<sh.length;i++){
      Matcher matcher = pattern.matcher(sh[i]);
      if(matcher.find()){
        String g=matcher.group();
        if(isOperators(g)){

        }else if(isKeyword(g)){

        }
         else
           System.out.println(matcher.group()+" is a identifier");
      }
      //  System.out.println(matcher.group());
    }
  }

}
