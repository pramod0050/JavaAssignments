import java.util.Scanner;

class Que13
{
  public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
      System.out.println("Enter Three NUmbers");
       int no1 = sc.nextInt();
       int no2 = sc.nextInt();
       int no3 = sc.nextInt();
       if((no1 > no2) && (no1 > no3))
       {
         System.out.println(no1+" is Greatest number");
       }
       else if((no2 > no1 ) && (no2 > no3))
        {
           System.out.println(no2+" is greatest number");
        }
        else
        {
         System.out.println(no3+" is greatest number");
        }


       String s =(no1 > no2 && no3 > no3)? "no1 is greater": no2>no3 ? "no2 is greater" : "no3 is greater";
       System.out.println(s);

}
}