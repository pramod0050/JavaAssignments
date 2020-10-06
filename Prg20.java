import java.util.Scanner;
 
class Prg20
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enetr the Starting Number");
   int n1 = sc.nextInt();
   System.out.println("Enetr the Second Number");
   int n2 = sc.nextInt();
   if(n1<2 || n2<2)
   {  
    System.out.println("Enetr number Greater than 2");
     return;
   }
   for(int i=n1;i<n2;i++)
   { 
    //System.out.println(i);
    int count=2;
    for(int j=2;j<i;j++)
     {
       if(i%j==0)
       {
        break;
       }
       count++;
     }
     if(i==count)
     {
     System.out.println(i+" Is The Prime Number");
     }
   }

}
}
   