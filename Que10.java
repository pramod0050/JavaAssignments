import java.util.Scanner;

class Que10{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Temperature");
float f = sc.nextFloat();
float C = 5*(f-32)/9;
System.out.println("Temperature in Celsius "+C);
}
} 