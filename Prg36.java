class MathOperation
{
  public void multiply(int no1 ,int no2)
  {
   int no3=no1*no2;
   System.out.println(no3);
  }
  public void multiply(float no1,float no2,float no3)
  {
   float no4=no1*no2*no3;
   System.out.println(no4);
  }
  public void multiply(double no1,float no2)
  {
   double no3 = no1*no2;
   System.out.println(no3);
  }
}
class Prg36
{
 public static void main(String args[])
 {
  MathOperation mobj=new MathOperation();
  int arr[]=new int[5];
  
  mobj.multiply(10,10);
  mobj.multiply(10.05f,20.86f,10.05f);
  mobj.multiply(10.55,10);
  }
}