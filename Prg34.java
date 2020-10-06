import java.util.*;
class Circle
{
  Scanner sc = new Scanner(System.in);
  float radius;
  float area;
  public void init()
{
   this.radius=sc.nextFloat();
   
    
}
public void calculateArea()
{
   this.area= 3.14f*(this.radius)*(this.radius);
}
public void display()
{
   System.out.println("The Circle area is "+area);
}
}
class CircleDem
 public static void main(String args[])
  { 
    
     Circle cobj=new Circle();
      cobj.init();
      cobj.calculateArea();
      cobj.display();
 }
}