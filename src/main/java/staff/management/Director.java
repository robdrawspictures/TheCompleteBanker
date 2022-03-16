package staff.management;

public class Director extends Manager {

    private Double budget;

    public Director(String name, Integer nationalInsurance, Double salary, String deptName, Double budget) {
        super(name, nationalInsurance, salary, deptName);
        this.budget = budget;
    }

    public Double payBonus(){
        return (this.getSalary()/100) * 2;
    }
}
