import java.util.Scanner;

class Que9{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Number of Days");
   int Days = sc.nextInt();
   int Year = Days/365;
   int Days1 = Days%365;
   int Months = Days1/30;
   int Days2 = Days%30;
   System.out.println("Year= "+Year+"Months= "+Months+"Days = "+Days2);
}
}