public class Main {

    public static void main(String[] args) {
        BankAccount miloAccount = new BankAccount();

        miloAccount.setAccountNumber(2803940);
        miloAccount.getAccountBalance();
        miloAccount.setEmail("milo@gmail.com");
        miloAccount.setCustomerName("Milo");
        miloAccount.setPhoneNumber("423-523-523");

        miloAccount.depositingFunds(530);
        miloAccount.withdrawingFunds(230);
        miloAccount.withdrawingFunds(301);
        miloAccount.withdrawingFunds(300);
        miloAccount.withdrawingFunds(1);
    }
}

