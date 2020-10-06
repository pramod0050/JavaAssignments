class Person
{
 static String name;
 static int age;
  Person(){
  this.age=18;
}
 Person(String Name,int Age){
  this.name=Name;
  this.age=Age;
  }
  void Display()
{
  System.out.println("Person name is "+name+" & Age is "+age);
}
}
class PersonDemo
{
  public static void main(String args[])
  {
    Person  p = new Person("Ram",20);
    p.Display();
  }
}
    
     
 
  