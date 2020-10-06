import java.util.Scanner;

class Percentage{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter Marks For Five Subjects");

int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt();
int e = sc.nextInt();

float  x = (a+b+c+d+e)/5F ;
System.out.println("percentage marks = "+x+"%");
}
}



