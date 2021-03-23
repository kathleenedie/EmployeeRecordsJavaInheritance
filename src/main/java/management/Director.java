package management;

public class Director extends Manager{

    private Double budget;

    public Director(String name, String niNumber, double salary, String deptName, Double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public double payBonus(){
        return getSalary()*0.02;
    }
}
