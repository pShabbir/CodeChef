//Reverse position eg I am a good boy --> boy good a am I
class Rev{
   public static void main(String sha[])
   {
     String s="I am a good boy";
     String sh[]=s.split(" ");
     for(int i=sh.length-1;i>=0;i--)
      {
        System.out.print(sh[i]+" ");
      }
   }
}
