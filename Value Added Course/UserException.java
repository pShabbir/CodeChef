//create a program to generate a user define exception when
//we try to create an array of length between 7-10
import java.util.Scanner;
class UserException{
  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=obj.nextInt();
    try{
      if(n>7 && n<10)
        throw new MyException();
      else
        System.out.println("Your array input is valid");
    }
    catch (Exception e) {
      System.out.println("Size of array is invalid");
    }
  }
}
class MyException extends Exception
{

}
