package management;

public class Director extends Manager {
    //instance variable:
    private double budget;


    //constructor function:
    public Director(String name, Integer NINumber, double salary, String deptName, double budget) {
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }

    //getter:
    public double getBudget() {
        return budget;
    }


}
