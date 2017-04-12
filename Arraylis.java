import java.util.*;
class abc
{
public static void main(String args[])
{

ArrayList<String> al =new ArrayList<String>();
ArrayList<String> al2=new ArrayList<String>();

al.add("Tejas");
al.add("Shabbir");
al.add("Shivam");

al2.addAll(al);
al2.add("Ravi");
al2.add("Rahul");

Iterator i=al2.iterator();

while(i.hasNext())
System.out.println(i.next());



// for(String st:al2)
// {
//  System.out.println(st);
// }




}

}
