import java.util.Scanner;
class RadixGeneral{
  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=obj.nextInt();
    String arr[]=new String[n];
    System.out.println("Enter array");
    for(int i=0;i<n;i++)
    {
      arr[i]=obj.next();
    }
    int t=0;
  //  String arr[]={"44","39","20","90","08","11"};
    String c="";
    for (int i=(arr[0].length()-1);i>=0 ;i-- ) {
         for(int j=0;j<n;j++){
           for(int k=0;k<n-1-j;k++){
             String a=arr[k].charAt(i)+"";
             String b=arr[k+1].charAt(i)+"";
             if(a.compareTo(b)>0 || a.compareTo(b)==0)
               {
                 c=arr[k];
                 arr[k]=arr[k+1];
                 arr[k+1]=c;
               }

           }
         }
    }
    for(int m=0;m<n;m++)
      System.out.print(" "+arr[m]);
   System.out.println();


}
}
