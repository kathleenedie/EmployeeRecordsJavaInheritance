package Staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null){
        this.name = name;}
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(Double raise){
        Double raisedSalary = 0.0;
        if(raise >= 0){
        raisedSalary = getSalary() + raise;}
        return raisedSalary;
    }

    public double payBonus(){
        return getSalary()*0.01;
    }
}
