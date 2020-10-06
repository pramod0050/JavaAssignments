import java.util.Scanner;
class Prg16
{
   public static void main(String arg[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number");
     byte b = sc.nextByte();
     for(byte i=1;i<=10;i++)
     { 
       System.out.println(b+" x "+i+" = "+b*i);
     }
}
}
 
    
  