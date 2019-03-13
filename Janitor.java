public class Janitor extends Employee
{
public Janitor()
{
super();
setBaseHours(80);
setBaseSalary(30000);
setBaseVacationDays(5);
}
public void clean()
{
System.out.println("Workin' for the man.");
}
}