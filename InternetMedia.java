import java.util.Scanner;
class FileType {
  private String extension;
  private String type;
  FileType(String a,String b){
    extension=a;
    type=b;
  }
  public String getExtension(){
    return extension;
  }
  public String getType(){
    return type;
  }
}
class InternetMedia {
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the value of N and Q");
    int n=obj.nextInt();
    int q=obj.nextInt();
    FileType[] filetype=new FileType[n];
    String[] file=new String[q];
    for (int i=0;i<n ;i++ ) {
      String a=obj.next();
      String b=obj.next();
      filetype[i]=new FileType(a,b);
    }
    for(int i=0;i<q;i++)
    {
      file[i]=obj.next();
    }
    String[] output=calculate(filetype,file);
    for(int i=0;i<q;i++)
    {
      System.out.println(output[i]);
    }
  }
  public static String[] calculate(FileType[] filetype,String[] file)
  {
      String[] output=new String[file.length];
    try {

      for (int i=0;i<file.length ;i++ ) {
          String[] q=file[i].split("\\2E");
            //System.out.println(q[i]);
          for (int j=0;j<filetype.length ;j++ ) {
              if(q[q.length-1].contains(filetype[j].getExtension()))
                {
                  output[i]=filetype[j].getType();
                  break;
                }
                else{
                  output[i]="unknown";
                }

          }
      }

    }catch (Exception e) {
      System.out.println(e);
    }
    return output;
  }

}
