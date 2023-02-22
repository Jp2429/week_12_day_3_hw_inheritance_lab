package staff;

public abstract class Employee {
    //instance variables:
    private String name;
    private Integer NINumber;
    private double salary;

    //constructor function:
    public Employee(String name, Integer NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    //getters:
    public String getName() {
        return this.name;
    }
    public Integer getNINumber() {
        return this.NINumber;
    }
    public double getSalary() {
        return this.salary;
    }

    //methods:
    public void raiseSalary(double numberToIncreaseSalaryBy) {
        this.salary += numberToIncreaseSalaryBy;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

}
