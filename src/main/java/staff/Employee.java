package staff;

public abstract class Employee {

    private String name;
    private Integer nationalInsurance;
    private Double salary;

    public Employee(String name, Integer nationalInsurance, Double salary) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNationalInsurance() {
        return this.nationalInsurance;
    }

    public void setNationalInsurance(Integer nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void raiseSalary(Double raise){
        if(raise > 0) {
            this.salary += raise;
        }
    }

    public Double payBonus(){
        return this.salary/100;
    }
}
