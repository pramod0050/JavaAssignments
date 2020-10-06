import java.util.Scanner;
 
class Prg28
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
     System.out.println("Enter The Size of row");
      int row=sc.nextInt();
     
       
     int arr[][]=new int[row][];
      
     for(int i=0;i<arr.length;i++)
     {
       System.out.println("Enter The Size of columns");
        int col=sc.nextInt();
      int arr1[]=new int[col];
       for(int j=0;j<col;j++)
     {
      arr1[j]=sc.nextInt();
     }
   arr[i]=arr1;
      
     }
     
  for(int i=0;i<arr.length;i++)
     {
       for(int j=0;j<arr[i].length;j++)
     {
      System.out.print(" "+arr[i][j]+" ");
     }
      System.out.println("");
      
     }

     
  }
}