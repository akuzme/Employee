import java.util.Locale;

public abstract class Employee implements Payable {
    // TODO fix class declaration and declare variables here
    public String employeeId;
    public String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
        // TODO fill in code here
    }

    public String getEmployeeId() {
        return employeeId;
        // TODO fill in code here and replace the return statement
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        // TODO fill in code here
    }

    public String getName() {
        return name;
        // TODO fill in code here and replace the return statement
    }

    public void setName(String name) {
        this.name = name;
        // TODO fill in code here
    }

    public double getAverageMonthlySalary() {
        // TODO fill in code here and replace the return statement
        return calculatePay();
    }

    @Override
    public String toString() {
        // TODO fill in code here and replace the return statement, be sure to format double value
        return String.format(Locale.ENGLISH, "%s, %s, %.2f", getEmployeeId(), getName(), getAverageMonthlySalary());
    }

    public abstract double calculatePay();

}
