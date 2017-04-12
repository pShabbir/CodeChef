//given a string construt a odd pallindrome and even pallindrome
class Eopalin{
   public static void main(String sha[])
   {
     String s="XYZ";
     int l=s.length();
     char ce[]=new char[s.length()*2];
     char co[]=new char[s.length()*2-1];
     for(int i=0;i<s.length();i++)
     {
       ce[i]=s.charAt(i);
       ce[ce.length-1-i]=s.charAt(i);
     }
     for(int i=0;i<s.length();i++)
     {
       co[i]=s.charAt(i);
       co[co.length-1-i]=s.charAt(i);

     }
     for(int i=0;i<ce.length;i++)
     {
       System.out.print(ce[i]);

     }
     System.out.println();
     for(int i=0;i<co.length;i++)
     {
       System.out.print(co[i]);

     }
   }
}
