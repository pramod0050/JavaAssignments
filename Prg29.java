import java.util.Scanner;

 class Prg29
{ 
   public static void main(String ar[])
    {
       Scanner sc = new Scanner(System.in);
      int a[] = new int[3];
      int b[] = new int[4];
      int c[] = new int[5];

     int arr[][]=new int[3][];
      arr[0]=a;
      arr[1]=b;
      arr[2]=c;
     int count=0;

    for(int i=0;i<arr.length;i++)
      {
            count++;
           int count1=0;
           for(int j=0;j<arr[i].length;j++)
           { 
             count1++;
           }
         System.out.println("First Row contain "+count1+" elements");
      }

       System.out.println("It Conatins "+count+" 1-D arrays");
       
}

}

   