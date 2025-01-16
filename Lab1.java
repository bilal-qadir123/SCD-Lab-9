import java.util.*;

interface BankInterface {
    void performTask();
}

class BillPayment implements BankInterface {
    private Stack<String> bills;

    public BillPayment() {
        bills = new Stack<>();
    }

    public void addBill(String bill) {
        bills.push(bill);
    }

    public void performTask() {
        while (!bills.isEmpty()) {
            System.out.println("Processing bill: " + bills.pop());
        }
    }
}

class NewAccountOpening implements BankInterface {
    private List<String> newAccounts;

    public NewAccountOpening() {
        newAccounts = new ArrayList<>();
    }

    public void addAccount(String account) {
        newAccounts.add(account);
    }

    public void performTask() {
        for (String account : newAccounts) {
            System.out.println("Opening account: " + account);
        }
    }
}

class LoanDefaulterContact implements BankInterface {
    private Queue<String> defaulters;

    public LoanDefaulterContact() {
        defaulters = new LinkedList<>();
    }

    public void addDefaulter(String defaulter) {
        defaulters.add(defaulter);
    }

    public void performTask() {
        while (!defaulters.isEmpty()) {
            System.out.println("Contacting defaulter: " + defaulters.poll());
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BillPayment billPayment = new BillPayment();
        billPayment.addBill("Electricity Bill");
        billPayment.addBill("Gas Bill");

        NewAccountOpening accountOpening = new NewAccountOpening();
        accountOpening.addAccount("Bilal Ahmed");
        accountOpening.addAccount("Ayesha Khan");

        LoanDefaulterContact defaulterContact = new LoanDefaulterContact();
        defaulterContact.addDefaulter("Ali Raza");
        defaulterContact.addDefaulter("Sanaullah");

        billPayment.performTask();
        accountOpening.performTask();
        defaulterContact.performTask();
    }
}
