//wap in java to convert astring succh that each char is replaced my its nextCharacter
//eg ABCDEF BCDEFG
class Replay{
  public static void main(String sha[])
  {
    String s="ABCDEZ";
    char c[]=new char[s.length()];
    for(int i=0;i<s.length();i++)
    {
      c[i]=s.charAt(i);
    }
    for(int i=0;i<s.length();i++)
    {
      if(c[i]=='Z')
         c[i]='A';
      else
        {
          c[i]++;
        }
    }
    String sh=new String(c);
    System.out.println(sh);
  }
}
