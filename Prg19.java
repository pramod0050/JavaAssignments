import java.util.Scanner;
 

class Prg19
{
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Series Number");
    int n= sc.nextInt();
    int sum1=0,sum=0;
    for(int i=1;i<=n;i++)
    {
     sum=sum+i;
     sum= sum*10;
     
     sum1=sum1+sum;
    sum=0;
     }
  System.out.println(sum1);
}
}
