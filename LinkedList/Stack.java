import java.util.*;
class input{
  public int takeinput(){
    Scanner obj=new Scanner(System.in);
    return obj.nextInt();
  }
}
class Stack  {
  public static void main(String[] args) {

       LinkedList stack=new LinkedList();
       System.out.println("Enter the choice");
       System.out.println("1.Push\n2.Pop\n3.print\n4.Exit");
       int choice=new input().takeinput();
       while(true)
       {
         switch (choice) {
           case 1://A.Push();
                 PushC P=new PushC();
                 stack=P.push(stack);
                  break;
          case 2://A.pop();
               PopC P1=new PopC();
                stack=P1.pop(stack);
                break;
          case 4 :System.exit(0);
                 break;
          case 3:System.out.println("List is\n"+stack);
                 break;
          default:System.out.print("Wrong Choice!!!");

         }
         System.out.print("1.Push\n2.Pop\n3.print\n4.Exit");
         choice=new input().takeinput();
       }
  }
}
class PushC
{
  public LinkedList push(LinkedList stack){
    System.out.println("Enter the element to enter");
    int item=new input().takeinput();
    stack.add(item);
    return stack;
  }
}
class PopC
{
  public LinkedList pop(LinkedList stack){
    //System.out.println("Enter the element to enter");
    //int item=new input().takeinput();
    stack.remove();
    return stack;
  }
}
