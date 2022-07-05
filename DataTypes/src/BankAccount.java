public class BankAccount {
    static String bankName = "HDFC"; //static variables are stored in
                                     // method area of JVM
    String accountHoldersName;
    String accountNumber;
    float balance;

    public static void main(String[] args) {
        double interestRate = 7.5;
        System.out.println(BankAccount.bankName);
        BankAccount bankAccount = new BankAccount();
        // bankAccount.accountHoldersName = "John";
        // bankAccount.accountNumber = "ACC10236589";
        // bankAccount.balance = 2000f;
        System.out.println(bankAccount.balance);
        System.out.println(interestRate);

    }
}
