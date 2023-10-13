public class BankAccount {

    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void depositingFunds(int value) {
        accountBalance += value;
        System.out.println("On your account is " + accountBalance);
    }

    public void withdrawingFunds(int value) {
        if (accountBalance - value < 0) {
            System.out.println("There are not that many funds in your account");
        } else {
            accountBalance -= value;
            System.out.println("On your account is " + accountBalance);
        }
    }
}
