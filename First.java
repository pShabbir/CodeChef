//To find the first in the given grammer
import java.io.*;
import java.util.*;
class First{
  public static void main(String[] args) {

    try{
      BufferedInputStream in=new BufferedInputStream(new FileInputStream("my1.txt"));
      int t=in.read();
      StringBuffer str=new StringBuffer();
      while(t!=-1){
        //System.out.print(""+(char)t);
          str.append((char)t);
         t=in.read();
       }
       String ss=new String(str);
       //Printing the production
       System.out.println("Given Production is\n"+"----------------------------------");

       String arr[] = ss.split(",");
        for (int i=0;i<arr.length ;i++ ) {
          arr[i]=  arr[i].trim();
          System.out.println(arr[i]);
        }
        //HashMap myDis = new HashMap();
        LinkedHashMap<String, String> myDis=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
          String[] sp=arr[i].split("->");

          String key=sp[0].trim();
          String value=sp[1].trim();
          myDis.put(key,value);
        }
          // HashMap a=new HashMap();
          // a.put("S","V");
        //System.out.print(myDis.keySet());
        //System.out.print(myDis.containsValue("AB"));
    //  System.out.print(myDis.keySet());
    int counter=0;
    System.out.println("Enter the production for which you want First");
    String search=new Scanner(System.in).next();
    String search1 = search;
    //String search=new String("A");
      while(counter==0){
        for (String key :myDis.keySet() ) {
          //String f=String.valueOf(key.charAt(0));
            if(key.equals(search))
              {
                String test=myDis.get(key);
                if(test.charAt(0) > 96)
                  {
                    System.out.println("First of "+search1+" is "+test.charAt(0));
                    counter=1;
                    break;
                  }
                else
                 search = test.charAt(0)+"";
              }
            //System.out.println(f);
        }
        counter=1;
      }
      // for(String key : myDis.keySet()){
      //   System.out.println(myDis.get(key));
      // }

    }catch(Exception e){}
  }
}
