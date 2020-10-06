import java.util.Scanner;
 
class Prg21
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
     System.out.println("Enter The Numberes");
     int arr[] = new int[10];
     for(int i=0;i<10;i++)
     {
      arr[i]=sc.nextInt();
      }
     int sum=0;
     for(int j=0;j<10;j++)
     {
      sum =sum+ arr[j];
      }
     int avg = sum/10;
     System.out.println("Sum is "+sum+" & average is "+avg);
  }
}
      