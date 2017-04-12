import java.util.*;
class BathroomStall{
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
  //  System.out.println("Enter the total test case");
    int n=obj.nextInt();
    String[] s=new String[n];
    for (int i=0;i<n ;i++ ) {
      //System.out.println("Enter the test case");
      int N=obj.nextInt();
      int k=obj.nextInt();
      s[i]=calculate(N,k);
    }
    for (int i=0;i<n ;i++ ) {
      System.out.println("Case #"+(i+1)+": "+s[i]);
    }

  }
  public static String calculate(int n,int o){
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(1);
    for(int i=0;i<n;i++){
      arr.add(0);
    }
    arr.add(1);


    int index=-1,i=0;
    Test[] test=new Test[n];
    for( i=0;i<o;i++){
      for(int j=1;j<n+1;j++){
        ///
        int ls=0,rs=0;
        if(arr.get(j)!=1){
          for(int k=j-1;k>-1;k--){

            if(arr.get(k)==0){
              ls++;
            }
            else{
              break;
            }
          }
          //
          for(int k=j+1;k<n+1;k++){

            if(arr.get(k)==0)
              rs++;
            else
              break;
          }

        }
        else{
          ls=-1;
          rs=-1;
        }
        test[j-1]= new Test(ls,rs);
      }
      index = gettingMinIndex(test);
     //System.out.println("position of split "+(test[index].getl()+1));
     //arr.set(test[index].getl()+1,1);
     arr.set(index+1,1);
    // System.out.println(arr);
    }

      String s=test[index].getmax()+" "+test[index].getmin();
      // System.out.print("Case #"+i+": "+test[index].getmax());
      // System.out.println(" "+test[index].getmin());
    //Testting
    // for(int i=0;i<n;i++){
    //   System.out.println("("+test[i].getl()+","+test[i].getr()+")");
    // }
    return s;
  }

  public static int gettingMinIndex(Test[] test){
    int max=0,index=0,sum=0;
    ArrayList<Integer> arr=new ArrayList<>();
    for (int i=0;i<test.length ;i++ ) {
      if(test[i].getmin() != -1){
        {
          arr.add(test[i].getmin());
          sum += test[i].getmin();
        }

      }
    }

    if(sum == (arr.get(0)*arr.size()))
    {
      max = test[0].getmax();
      index = 0;
      for (int i=1;i<test.length ;i++ ) {
        //System.out.println("h "+test[i].getmin());
        if(max<test[i].getmax())
         {
           max=test[i].getmax();
           index = i;
         }
      }
       //System.out.println("My index :"+index);
      return index;
    }
    else{
      for (int i=0;i<test.length ;i++ ) {
        //System.out.println("h "+test[i].getmin());
        if(max<test[i].getmin())
         {
           max=test[i].getmin();
           index = i;
         }
      }
       //System.out.println("My index :"+index);
      return index;
    }

  }
}
class Test{
  private int l,r;
  Test(int a,int b){
    l=a;
    r=b;
  }
  public void setl(int l){
    this.l=l;
  }
  public void setr(int r){
    this.r=r;
  }
  public int getl(){
    return l;
  }
  public int getr(){
    return r;
  }
  public int getmin(){
    if(l>=r)
     return r;
    else
      return l;
  }
  public int getmax(){
    if(l>=r)
     return l;
    else
     return r;
  }
}
