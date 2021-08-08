class empl
{
int id;
String name;
String designation;
float salary;
float totalsalary;
void getDetails(int a,String b,String c,float d)
{
id=a;
name=b;
designation=c;
salary=d;
}
void calculateSalary()
{
float ta,da;
ta=(10*salary)/100;
da=(12*salary)/100;
totalsalary=ta+da+salary;
}
void printDetails()
{
System.out.println("Employee name is :"+name+"\nId is:"+id+"\nDesignation is :"+designation+"\nEmployee gross salary is :"+totalsalary);
}
public static void main(String geetansh[])
{
empl obj=new empl();
obj.getDetails(1127,"Geetansh","CEO",70000);
obj.calculateSalary();
obj.printDetails();
}
}
