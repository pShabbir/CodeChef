class MyObj  {
  private int x;
  private int y;
  MyObj(int x,int y){
    this.x=x;
    this.y=y;
  }
  // public void setX(int x)
  // {
  //
  // }
  // public void setY(int y)
  // {
  //
  // }
  public boolean isPresent(double a){
    double f=x*x+y*y-a*a;
    if(f<0)
      return true;
    else
      return false;
  }
}
class Coordinate{
    public static void main(String[] args) {
      //System.out.println("Enter the value of N and K");
      int n=5,k=2;
      int x[]={0,1,2,1,2};
      int y[]={1,0,0,1,2};
      MyObj[] coor=new MyObj[n];
      for (int i=0;i<n ;i++ ) {
        coor[i]=new MyObj(x[i],y[i]);
      }
      claculate(coor,1,k);
    }
    public static void claculate(MyObj[] coor,double r,int k){
      int h=0;
      double ro=r;
      while(true){
        for (int i=0;i<coor.length ;i++ ) {
          if(coor[i].isPresent(r)){
            h++;
          }
        }
        //System.out.println("h = "+h);
        if(h>=k){
          actualRadius(coor,r,ro,k);
          break;
        }
        else{
          ro=r;
          r++;
          h=0;
        }
      }
    }
    public static void actualRadius(MyObj[] coor,double r,double ro,int k){
      int h=0;
      double rmid=(r+ro)/2;
      while(Math.abs((ro-r))>0.000001){
        for (int i=0;i<coor.length ;i++ ) {
          if(coor[i].isPresent(rmid)){
            h++;
          }
        }
        if(h>=k){
          r=rmid;
        }
        else{
          ro=rmid;
        }
        rmid=(r+ro)/2;
        //System.out.println("h = "+h);
        h=0;
      }
      //System.out.println("h = "+h);
      System.out.println("Required radius = "+rmid);
    }
}
