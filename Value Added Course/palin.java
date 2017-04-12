//wap in java to check wheter a particular string is pallindrome
class palin{
  public static void main(String sha[])
  {
    //String s="AABBAA";
    StringBuffer sm=new StringBuffer("AABAA");
  //  sm=sm.reverse();
    //System.out.print(sm);
    //char c[]=new char[s.length()];
    //for(int i=s.length()-1;i>=0;i--)
    //{
      //c[i]=s.charAt(i);
  //  }
    //String q=new String(c);
    if(sm.equals(sm.reverse()))
      System.out.print("Yes");
    else
    System.out.print("No");
  }
}
