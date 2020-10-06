import java.util.Scanner;

class Que12{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Salary");
   float Sal = sc.nextFloat();
   float DA=0;
   float HRA=0;
   float GS = 0;
   if(Sal <=10000)
   {
     HRA = (Sal)*(10/100);
      DA = (Sal)*(90/100);
      GS = Sal + DA + HRA;
      System.out.println(GS);
    }else
{
   DA=2000;
   HRA = Sal *(98/100);
   GS = Sal + DA + HRA;
   System.out.println(GS);
}
}
}
