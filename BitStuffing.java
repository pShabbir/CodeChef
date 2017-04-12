import java.util.*;
class BitStuffing {
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    ArrayList<Integer> arr=new ArrayList<Integer>();
    int counter=0;
    System.out.println("Enter the no of bits to transfer");
    int n=obj.nextInt();
    for (int i=0; i<n;i++ ) {
      int h=obj.nextInt();
      if(h==1)
       counter++;
      arr.add(h);
        if(counter==4)
          {
            arr.add(0);
            counter=0;
          }

      }
      Object a[]=arr.toArray();
    System.out.println("After Stufffing");
    System.out.print("011110");
    for (int i=0;i<a.length ;i++ ) {
      System.out.print(a[i]);
    }
    System.out.print("011110\n");
    //Destuffing
    counter=0;
    for (int i=0; i<arr.size();i++ ) {
      if(arr.get(i)==1)
        counter++;
      if(counter==4)
      {
        i++;
        arr.remove(i);
        counter=0;
      }

    }
    System.out.println("After DeStufffing");
    System.out.println(arr);

  }
}
