//We have to find all i and its max sum
import java.util.*;
class MaxI{
  public static void main(String[] args) {
    int sum=-9999;
    Scanner obj=new Scanner(System.in);
    int matrix[][]=new int[6][6];
    for (int i=0;i<6 ;i++ ) {
      for (int j=0;j<6 ;j++ ) {
        matrix[i][j]=obj.nextInt();
      }
    }
    // for (int i=0;i<6 ;i++ ) {
    //   for (int j=0;j<6 ;j++ ) {
    //     System.out.print(matrix[i][j]+" ");
    //   }
    //   System.out.println();
    // }

    for(int i=0;i<4;i++){
      for(int j=0;j<4;j++){
        System.out.print(matrix[0+i][0+j]);
          System.out.print(matrix[0+i][1+j]);
            System.out.print(matrix[0+i][2+j]);
              System.out.println();
              System.out.print(" "+matrix[1+i][1+j]+" ");
                System.out.println();
                System.out.print(matrix[2+i][0+j]);
                  System.out.print(matrix[2+i][1+j]);
                    System.out.print(matrix[2+i][2+j]);
                        System.out.println();
            int k = matrix[0+i][0+j] +matrix[0+i][1+j]+matrix[0+i][2+j]+matrix[1+i][1+j]+matrix[2+i][0+j]+matrix[2+i][1+j]+matrix[2+i][2+j];
            if(sum < k)
              sum = k;
      }
      System.out.println();
    }

    System.out.println("Max sum = "+sum);
  }
}
