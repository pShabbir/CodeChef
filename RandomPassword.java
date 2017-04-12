class RandomPassword{
  public static void main(String[] args) {
    String s="ABCDEFGHIJKLMNOPQRSTUVWZYZ123456789@!@#$%";
    char c[]=new char[8];
    for(int i=0;i<8;i++)
    {
      int ch=(int)(Math.random()*s.length());
      c[i]=s.charAt(ch);
    }
    String pass=new String(c);
    System.out.println("Password ="+pass);
  }
}
