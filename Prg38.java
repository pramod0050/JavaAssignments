import java.util.Scanner;

class Employee
{
  static int empNo;
  int salary;
  static int totalSalary;
  Employee(int salary)
  {
    this.salary=salary;
    this.empNo++;
   this.totalSalary=totalSalary+salary;
   }
   void Display()
{
 System.out.println("total number of Employees are "+empNo+" totalSalary is "+totalSalary); 
 }
}
class EmployeeDemo
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
  int sal=sc.nextInt();
   Employee e=new Employee(sal);
    sal=sc.nextInt();
   Employee e1=new Employee(sal);
   e1.Display();
  }
}
    
   