import java.util.Scanner;
 
class Prg27
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
       System.out.println("Enter The Size of array");
     int n = sc.nextInt();
     int arr[] = new int[n];
     System.out.println("Enter The Numberes");
     
     //arr[0]= sc.nextInt();
     //arr[0]=10;
     for(int i=0;i<n;i++)
     {
      arr[i]=sc.nextInt();
     }
          //50  45 98 77 12
     int greatest=arr[0];//50 98
     int smaller=arr[0];//50 45 
     for(int j=1;j<n;j++)   
    {
             
      if(smaller > arr[j])
        {   
          smaller=arr[j];
         }  
      if(greatest < arr[j])
      {      
         greatest=arr[j];
       }
}
System.out.println("Greatest Number is "+greatest+"And  Smaller Number is "+smaller);
}
}