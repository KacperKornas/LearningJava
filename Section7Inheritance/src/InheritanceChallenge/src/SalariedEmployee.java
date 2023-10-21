public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public SalariedEmployee () {
        super();
    }

    public boolean getIsRetired() {
        return isRetired;
    }

    public void retire() {
        isRetired = true;
    }
}
