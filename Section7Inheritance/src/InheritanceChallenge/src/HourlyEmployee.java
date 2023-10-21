public class HourlyEmployee extends Employee {

    private double hourlyPayRate;


    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double getDoublePay() {
        return hourlyPayRate * 2;
    }
}
