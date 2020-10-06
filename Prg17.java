import java.util.Scanner;

class Prg17
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    int no = sc.nextInt();
    int a=0;
    while(no>0)
   {
       a = a+(no%10);
      a =a*10;
      no=no/10;
   }
    a=a/10;
System.out.println(a);
}
}
      
