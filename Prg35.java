import java.util.Scanner;
import java.lang.Math;

class MathOperation
{
  public static int add(int n1,int n2)
 {
    int n3=n1+n2;
     return n3;
}
public static int subtract(int n1,int n2)
{
    int n3=n1-n2;
    return n3;
}
public static int multiply(int n1,int n2)
{
   int n3=n1*n2;
   return n3;
}
public static double power(int n1,int n2)
{
   double n3=Math.pow(n1,n2);
    return n3;
}
}
class Demo
{
public static void main(String args[])
{
 MathOperation mobj = new MathOperation();
  Scanner sc=new Scanner(System.in);
  int no1=sc.nextInt();
  int no2=sc.nextInt();
  int Add=mobj.add(no1,no2);
  int Sub=mobj.subtract(no1,no2);
  int Mul=mobj.multiply(no1,no2);
  double power=mobj.power(no1,no2);


System.out.println("Addition is"+Add);
System.out.println("Substraction  is"+Sub);
System.out.println("Multiplication is"+Mul);
System.out.println("Power is"+power);
}
}