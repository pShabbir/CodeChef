import java.util.*;
class BearAndRow{
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    //System.out.println("Enter the test cases");
    int n=obj.nextInt();
    for (int i=0;i<n ;i++ ) {
      calculate(obj);
    }
  }

  public static void calculate(Scanner obj){
    String s=obj.next();
    int n=s.length();
    int countofone=0;
    int arr[]=new int[n+1];
    for (int i=0;i<s.length() ;i++ ) {
      arr[i]=Integer.parseInt(s.charAt(i)+"");
      if(arr[i]==1)
        countofone++;
    }
    arr[n]=-1;
    int firstSelection=-1;
    int selection=0;
    int point = 0;
    for(int i=0;i<countofone+1;i++){//changing n to countofone
      for(int j=0;j<n;j++){
        if(arr[j]==1 && j!=n-1){
          if(arr[j+1]==0)
            {
              arr[j]=0;
              arr[j+1]=1;
              point++;
              if(firstSelection == -1){
                selection += 1;
                firstSelection = 0;
              }
            }else{
              firstSelection = -1;
            }
        }else{
          firstSelection = -1;
        }
      }
    }
    System.out.println((selection+point));

  }
}
