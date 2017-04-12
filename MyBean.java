class Employee{
  private int id;
  private String name;
  public void setId(int id){
    this.id=id;
  }
  public void setName(String name){
    this.name=name;
  }
  public int getId(){
    return id;

  }
  public String getName(){
    return name;
  }
}
class MyBean{
  public static void main(String[] args) {
    Employee e1=new Employee();
    e1.setId(1);
    e1.setName("Shayam");
    System.out.println("Employee Id is : "+e1.getId());
    System.out.println("Employee Name is : "+e1.getName());
  }
}
