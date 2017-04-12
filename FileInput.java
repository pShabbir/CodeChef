import java.io.*;
class FileInput{
  public static void main(String[] args) {

    try{
      BufferedInputStream in=new BufferedInputStream(new FileInputStream("my.txt"));
      int t=in.read();
      while(t!=-1){
        System.out.print(""+(char)t);
         t=in.read();
       }

    }catch(Exception e){}
  }
}
