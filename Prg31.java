class Student
{
 int rno;
 String name;
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
class Prg31
{
  public static void main(String args[])  
   {
     int i=11;
     String var="Ganesh";
     Student Sobj= new Student();
     Sobj.setData(i,var);
     Sobj.showData();
    }

}
  