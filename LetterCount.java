//Program to count the no of letter in given string
import java.util.Scanner;
class LetterCount {
static  int arr[]=new int[26];
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    char a[]={'a','b','c','d','e','f','g','h','i','j',
              'k','l','m','n','o','p','q','r','s','t',
               'u','v','w','x','y','z'};

    System.out.println("Enter the requred string");
    String in=obj.nextLine();
    in=in.toLowerCase();
    for(int i=0;i<in.length();i++)
    {
      int x=(int)(in.charAt(i));
      x=x-97;
      arr[x]++;

      }

    /*for(int i=0;i<in.length();i++)
    {
      switch(in.charAt(i)){
        case 'a':arr[0]++;
                break;
        case 'b':arr[1]++;
                      break;
        case 'c':arr[2]++;
                      break;
        case 'd':arr[3]++;
                      break;
        case 'e':arr[4]++;
                      break;
        case 'f':arr[5]++;
                      break;
        case 'g':arr[6]++;
                      break;
        case 'h':arr[7]++;
                      break;
        case 'i':arr[8]++;
                      break;
        case 'j':arr[9]++;
                      break;
        case 'k':arr[10]++;
                      break;
        case 'l':arr[11]++;
                      break;
        case 'm':arr[12]++;
                      break;
        case 'n':arr[13]++;
                      break;
        case 'o':arr[14]++;
                      break;
        case 'p':arr[15]++;
                      break;
        case 'q':arr[16]++;
                      break;
        case 'r':arr[17]++;
                      break;
        case 's':arr[18]++;
                      break;
        case 't':arr[19]++;
                      break;
        case 'u':arr[20]++;
                      break;
        case 'v':arr[21]++;
                      break;
        case 'w':arr[22]++;
                      break;
        case 'x':arr[23]++;
                      break;
        case 'y':arr[24]++;
                      break;
        case 'z':arr[25]++;
                      break;
      }
    }*/
    for(int i=0;i<arr.length;i++ ) {
      if(arr[i]!=0)
         System.out.println("No of "+a[i] +" : "+arr[i]);

    }
  }
}
