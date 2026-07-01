package Day8;

class Bank {

    void bankName() {
        System.out.println("ABC Bank");
    }
}

class SavingAccount extends Bank {

    void accountType() {
        System.out.println("Saving Account");
    }
}

public class BankSavingAccount {

    public static void main(String[] args) {

        SavingAccount sa = new SavingAccount();

        sa.bankName();
        sa.accountType();
    }
}
