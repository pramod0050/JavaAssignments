import java.util.Scanner;

class Product
{
 int pid=0,price=0,quantity=0;
 Product(int pid,int price,int quantity)
{
 this.pid=pid;
 this.price=price;
 this.quantity=quantity;
}
 public static int Product(
}
class ProductDemo
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   Product p[]=new Product[5];
   int Hprice[]=new int[5];
    for(int i=0;i<5;i++)
    {
     int pid=sc.nextInt();
     int price=sc.nextInt();
     int quantity=sc.nextInt();
     Product pobj=new Product(pid,price,quantity);
     p[i]=pobj;
     Hprice[i]=price;
    }
     int price1=Hprice[0];
    int Pos=0;
      for(int j=1;j<5;j++)
      {
        if(price1 < Hprice[j])
        {
         Pos=j;
          price1=Hprice[j];
        }
      }
     System.out.println("The pid For Highest price = "+price1+" is "+p[Pos].pid);
}
}
      