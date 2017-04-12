class PalinRule{
  public static void main(String[] args) {
    String demo="abba";
    char[] test=demo.toCharArray();
    // for(int i=0;i<test.length;i++)
    // System.out.print(" "+test[i]);
    String[] test=calculate(test,0);
  }
  public static String[] calculate(char[] test,int k)
  {
    String[] demo=new String[100];
    char m=test[k];
    int e=0;
    int u=k;
    int j=test.length-1;
    for(int i=2;i<=j;i++)
    {
      for(int r=u+1;r<test.length;r++)
      {
        demo[e]=m+test[r];
      }
    }
  }
}
