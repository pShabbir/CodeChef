//Replace the second index a in abcdeafghaij by X
class MyReplay{
  public static void main(String sha[])
  {
    StringBuffer s=new StringBuffer("abcdeafghaij");
    /*char ch[]=new char[s.length()];
    for(int i=0;i<s.length();i++)
    {
      ch[i]=s.charAt(i);
    }
    int flag=0;
    for(int i=0;i<s.length();i++)
    {
      if(ch[i]=='a')
      {
        if(flag==1)
          {
            flag=i;
            break;
          }
          flag++;
      }
    }
    ch[flag]='X';
    String sk=new String(ch);
    System.out.println(sk);*/
    s.setCharAt(s.indexOf("a",s.indexOf("a")+1),'X');
      System.out.println(s);
  }
}
