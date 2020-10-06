import java.util.Scanner;

class Prg30
{
  public static void main(String arg[])
   {
     Scanner sc = new Scanner(System.in);
      int arr[][]=new int[3][3];
       int sum=0;
      System.out.println("Enter the elements");
       for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr[i].length;j++)
             {
                arr[i][j]=sc.nextInt();
                if(i==j)
                 {
                   sum=sum+arr[i][j];
                  }
              }
           }
        System.out.println("The total diagonal Elements Sum is "+sum);
}
}

