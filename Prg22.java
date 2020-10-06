import java.util.Scanner;
 
class Prg22
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
    int n1 ,n2;
    for(int j=0;j<5;j++)
    {
      for(int k=j+1;k<5;k++)
      {
         if(arr[j]<arr[k])
         {
          n1=arr[j];
          arr[j]=arr[k];
          arr[k]=n1;
             }
       }
}
   for(int l=0;l<5;l++)
     {
      System.out.println(arr[l]);
      }
}
}
         