class Ass2 {
  public static void main(String sha[])
  {
    String asd[]={
                  "Rahul","Anshikha","Suruchi","Shabbir"};
    for(int i=0;i<asd.length;i++)
    {
      String s=asd[i];
      s=s.toUpperCase();
      if(s.endsWith("A")||s.endsWith("E")||s.endsWith("I")||s.endsWith("U")||s.endsWith("O"))
          System.out.println(asd[i]+" ends wuth vowel");
    }
    java.util.Arrays.sort(asd);
    for(int i=0;i<asd.length;i++)
    {
      System.out.print(" "+asd[i]);
    }

  }
}
