//HarvardLawyer.java
public class HarvardLawyer extends Lawyer{
    public int getVacationDays() {
        return super.getVacationDays() + 3;          //3 days more vacation than normal lawyer
    }

    public String getVacationForm() {
        String s = super.getVacationForm();
        return s+s+s+s;
    }
    
    public double getSalary() {
        double salary = super.getSalary();
return 1.2 * salary;                     
// 20% more salary than lawyer
    }
}