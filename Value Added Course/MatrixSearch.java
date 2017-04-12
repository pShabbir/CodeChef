//finding elements in matrix
import java.util.Scanner;
class MatrixSearch{
  public static void main(String sha[])
  {
    Scanner obj=new Scanner(System.in);
    int a[][]={
           {00,01,02,03,04,05,06,07,8,9},
           {10,11,12,13,14,15,16,17,18,19},
           {20,21,22,23,24,25,26,27,28,29},
           {30,31,32,33,34,35,36,37,38,39},
           {40,41,42,43,44,45,46,47,48,49},
           {50,51,52,53,54,55,56,57,58,59},
           {60,61,62,63,64,65,66,67,68,69},
           {70,71,72,73,74,75,76,77,78,79},
           {80,81,82,83,84,84,86,87,88,89},
           {90,91,92,93,94,95,96,97,98,99}
    };
    int flag=0;
    for(int i=0;i<10;i++)
    {
      for(int j=0;j<10;j++)
        {
          System.out.print(" "+a[i][j]);
        }
        System.out.println();
    }
    System.out.println("\nEnter the item to be search");
    int search=obj.nextInt();
     int mid=(10/2);
     int first  = 0;
     int last   = 10 - 1;
     int middle = (first + last)/2;
     //int search=79;
     while( first <= last )
     {
       if ( a[middle][mid] < search )
        {
          first = middle + 1;
          flag=1;
        }
       else
        {
           last = middle - 1;
           flag=0;
        }

          switch (flag) {
            case 1:if (a[middle-1][mid]<search && (middle-1)>-1)
                   break;
            case 0:if (a[middle+1][mid]>search && (middle+1)<10)
                   break;

          }
               middle = (first + last)/2;
    }

    if(search>a[middle][9])
      {
        middle++;
      }

      //System.out.println(a[middle][mid]);
    //Second Search Start here
    //*
    //*
    first  = 0;
   last   = 10 - 1;
   int middle1 = (first + last)/2;
   try{
     while( first <= last )
     {
       if ( a[middle][middle1] < search )
         first = middle1 + 1;
       else if ( a[middle][middle1] == search )
       {
         System.out.println(search + " found at location " +middle+" " +(middle1) + ".");
         break;
       }
       else
          last = middle1 - 1;

       middle1 = (first + last)/2;
    }
    //
    //
    //
      if ( first > last )
        System.out.println(search + " is not present in the list.\n");
   }
   catch (Exception e) {
     System.out.println(search + " is not present in the list.\n");
   }
  }
}
