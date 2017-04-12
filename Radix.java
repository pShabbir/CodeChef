class Radix{
  public static void main(String sha[])
  {
    int t=0;
    String arr[]={"44","39","20","90","08","11"};
    String c="";
    for (int i=1;i>=0 ;i-- ) {
         for(int j=0;j<6;j++){
           for(int k=0;k<6-1-j;k++){
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
    for(int m=0;m<6;m++)
      System.out.print(" "+arr[m]);
   System.out.println();


}
}
