import java.util.Scanner;
class FactorialEx {

public static void main(String sha[]){

     Scanner obj=new Scanner(System.in);
     int num=obj.nextInt();
     System.out.println("Factorial of Number is = "+fact(num));

}
public static int fact(String x)
    {
      if ((int)x<2)
         return 1;
      else
         return (int)x * fact((int)x-1);

    }
}
