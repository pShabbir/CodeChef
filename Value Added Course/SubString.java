class SubString{
  public static void main(String sha[])
  {
    int k=0,i=0,j=0;
    String main="Hi My Name";
    String sub="me";
    char c1[]=new char[main.length()];
    //c1=main.toCharArray();
    char c2[]=new char[sub.length()];
    for( i=0;i<main.length();i++)
       c1[i]=main.charAt(i);
    for( i=0;i<sub.length();i++)
      c2[i]=sub.charAt(i);

    while(i<main.length() && k==0)
    {
      j=0;
      while(j<sub.length())
      {
        if(c1[i]==c2[j])
        {
          i++;
          j++;
        }
        else{
          i++;
          j=0;
        }
      }
      if(j==sub.length())
        k=1;
    }
    System.out.println("Found at position= "+(i-sub.length()));
  }
}
