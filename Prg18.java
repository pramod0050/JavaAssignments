import java.util.Scanner;

class Prg18
{
   public static void main(String args[])
  {
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter the number");
   int a =sc.nextInt();
   int count=2;
   for(int i=2;i< a;i++)
   {
     if(a%i==0)
    {
      break;
     }
    count++;
    
    }
    if(a==count)
    {
     System.out.println("Number is Prime Number");
    }
    else
    {
    System.out.println("Number is Not Prime Number");
     }
}
}
 