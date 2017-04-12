class LCM{
    public static void main(String sha[])
    {
      int a=30,b=45,lcm=0;
      for(int i=1;i<=a;i++)
      {
        int x=i*b;
        if(x%a==0)
        {
          lcm=x;
          break;
        }
      }
      System.out.println("LCM = "+lcm);
    }
}
