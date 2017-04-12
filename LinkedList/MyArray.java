import java.util.*;
class Complex{
  int real;
  int imag;
  Complex(int a,int b){
    real=a;
    imag=b;
  }

  //public void se
  public String toString()
  {
    String s=real+"+i"+imag;
     return s;
  }
}
class MyArray{
  public static void main(String[] args) {
    ArrayList<Complex> s1=new ArrayList<Complex>();
    Complex a=new Complex(2,3);
    Complex b=new Complex(5,6);
    Complex c=new Complex(10,4);
    s1.add(a);
    s1.add(b);
    s1.add(c);

    ArrayList<Complex> s2=new ArrayList<Complex>();
    Complex d=new Complex(8,90);
    Complex e=new Complex(53,61);
    Complex f=new Complex(110,24);
    s2.add(d);
    s2.add(e);
    s2.add(f);
    s2.addAll(s1);

    for (Complex st :s2 ) {
      System.out.println(st);
    }
  }
}
