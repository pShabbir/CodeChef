import java.util.Scanner;
class PieceOfCake{
  private static int a[],ax[];
  Scanner obj=new Scanner(System.in);
  public static void main(String sha[])
  {
    try{

        PieceOfCake A=new PieceOfCake();
        //Enter the test case
        int n=A.testCase();
        a=new int[n];
        for(int i=0;i<n;i++)
           {
                String s=""+A.testCase();
                A.myChar(s);
               }
          System.out.println();
        for(int i=0;i<26;i++)
        {
          System.out.println(""+ax[i]);
        }
    }
    catch (Exception e) {

    }
  }
  public int testCase()
  {

      int n=obj.nextInt();
      return n;
  }
  public void myChar(String s)
  {
     ax=new int[26];
    for(int i=0;i<26;i++)
      ax[i]=0;
    for(int i=0;i<s.length();i++)
    {
      switch(s.charAt(i))
      {
              case 'a':a[0]++;
                       break;
              case 'b':a[1]++;
                      break;
              case 'c':a[2]++;
                       break;
             case 'd':a[3]++;
                      break;
            case 'e':a[4]++;
                   break;
            case 'f':a[5]++;
                      break;
            case 'g':a[6]++;
                     break;
           case 'h':a[7]++;
                    break;
            case 'i':a[8]++;
                     break;
           case 'j':a[9]++;
                    break;
            case 'k':a[10]++;
                     break;
           case 'l':a[11]++;
                      break;
          case 'm':a[12]++;
                     break;
           case 'n':a[13]++;
                    break;
          case 'o':a[14]++;
                    break;
          case 'p':a[15]++;
                    break;
          case 'q':a[16]++;
                    break;
           case 'r':a[17]++;
                  break;
          case 's':a[18]++;
                  break;
          case 't':a[19]++;
                  break;
          case 'u':a[20]++;
                   break;
         case 'v':a[21]++;
                  break;
         case 'w':a[22]++;
                   break;
         case 'x':a[23]++;
                  break;
          case 'y':a[24]++;
                   break;
          case 'z':a[25]++;
                  break;

      }
    }

  }
}
