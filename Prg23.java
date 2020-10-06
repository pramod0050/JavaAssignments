import java.util.Scanner;
 
class Prg23
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
     System.out.println("Enter The Numberes");
     int arr[] = new int[10];
     for(int i=0;i<5;i++)
     {
      arr[i]=sc.nextInt();
     }
      int n=0;
       int n1=0,n2=0;
     for(int j=0;j<5;j++)
     {
       n=arr[j];
       while(n>0)
       {
         n1=n%10;
         n2=n2+n1;
         n2=n2*10;
         n1=n1/10;
       }
        n2=n2/10;
      arr[j]= n2;
       }
    for(int k=0;k<5;k++)
     {
       System.out.println(arr[k]);
     }
}
} 
         