class Student
{
 int rno;
 String name;
 static int count=0;
  Student(){
   this.count++; 
System.out.println(this.count);
  
}
public void setData(int rollno,String Sname)
{
   this.rno=rollno;
   this.name=Sname;
}
public void showData()
{ 
  System.out.println(rno);
  System.out.println(name);
}
}
class Prg32
{
  public static void main(String args[])  
   {
     int i=11;
     String var="Ganesh";
     Student Sobj= new Student();
     Sobj.setData(i,var);
     Sobj.showData();
     
       Student S1= new Student();
     S1.setData(i,var);
     S1.showData();
    System.out.println(count);
    }

}