//wap to print the position of vowels in a String
class Str {
  public static void main(String sha[])
  {
    String s="I LOVE MY INDIA";
    s=s.toUpperCase();
    for(int i=0;i<s.length();i++)
    {
      char ch[]=new char[1];
      ch[0]=s.charAt(i);
       String c=new String(ch);
      switch (ch[0]) {
        case 'A':System.out.print(" "+i);
                break;
        case 'E':System.out.print(" "+i);
                 break;
        case 'I':System.out.print(" "+i);
                 break;
        case 'O':System.out.print(" "+i);
                 break;
        case 'U':System.out.print(" "+i);
                 break;

      }


    }
  }

}
