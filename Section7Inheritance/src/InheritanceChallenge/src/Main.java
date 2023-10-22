public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2022");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        Employee bill = new Employee("Bill", "15/3/2000", "12/05/2020");
        System.out.println(bill);
        System.out.println("Age = " + bill.getAge());
        System.out.println("Pay = " + bill.collectPay());

        Worker worker = new Worker("mateo", "21/10/1999");
        System.out.println(worker);
        System.out.println(worker.getAge());


        SalariedEmployee matt = new SalariedEmployee("Matt", "15/3/2000", "12/05/2020", 35000);
        System.out.println("Matt's Paycheck = $" + matt.collectPay());
        matt.retire();
        System.out.println(matt.collectPay());

        HourlyEmployee tom = new HourlyEmployee("Tom", "15/3/2000", "12/05/2020", 15);
        System.out.println(tom.getDoublePay());

    }
}
