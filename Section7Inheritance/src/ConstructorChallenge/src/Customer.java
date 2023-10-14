public class Customer {

    private String name;
    private double limit;
    private String address;


    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getAddress () {
        return address;
    }

    public Customer (String name, double limit, String address) {
        this.name = name;
        this.limit = limit;
        this.address = address;
    }

    public Customer () {
        this("Kamil", 142,"Wroclaw 80");
    }

    public Customer(String name, String address) {
        this(name, 459, address);

    }
}
