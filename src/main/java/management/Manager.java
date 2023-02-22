package management;
import staff.Employee;
public class Manager extends Employee {
    //instance variable:
    private String deptName;

    //constructor function:
    public Manager(String name, Integer NINumber, double salary, String deptName) {
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    //getters:
    //because the getters are created in the Employee class, we don't need to add them here*
    public String getDeptName() {
        return deptName;
    }
}
