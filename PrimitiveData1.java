import java.util.Scanner;

class PrimitiveData1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value for x");
int x = sc.nextInt();

System.out.println("Enter the value for y");
int y = sc.nextInt();

int z = x++ - --y - --x + x++;
System.out.println("value of x is "+x);
System.out.println("value of y is "+y);
System.out.println("value of z is "+z);

}
}