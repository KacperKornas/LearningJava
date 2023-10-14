public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 1000, "Warsaw");
        System.out.println(customer.getName());
        System.out.println(customer.getLimit());
        System.out.println(customer.getAddress());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getLimit());
        System.out.println(secondCustomer.getAddress());

        Customer thirdCustomer = new Customer("Ryś", "Krakow");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getLimit());
        System.out.println(thirdCustomer.getAddress());

    }
}
