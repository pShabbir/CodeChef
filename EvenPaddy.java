import java.util.*;
class EvenPaddy{
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the total number of bits");
    int n=obj.nextInt();
    ArrayList<Integer> arr=new ArrayList<Integer>();
    int counter=0;
    //int[] arr=new int[8];
    int zero=0;
    int one=0;
    for(int i=0;i<n;i++){
      //arr[i]=obj.nextInt();
      arr.add(obj.nextInt());
      if(arr.get(i)==0)
        zero++;
      else
        one++;
     counter++;
     if(counter==7)
     {
       if(zero%2==0)
         arr.add(1);
       else
         arr.add(0);
      zero=0;
      one=0;
      counter=0;
     }
    }


    int h=(7-n%7);
    for(int i=0;i<h;i++)
      {
        arr.add(0);
        zero++;
      }
      if(zero%2==0)
        arr.add(1);
      else
        arr.add(0);



    System.out.print(" "+arr);
      // for(int i=0;i<8;i++){
      //   System.out.print(" "+arr[i]);
      // }
  }
}
