abstract class AccountOperations{
	public abstract void deposit(dou1ble amount);
	public abstract void withdraw(double amount);
	public abstract void displayBalance();
}

class BankAccount extends AccountOperations{
	private static int totalAccounts = 0;
	private String accountNumber;
    private String accountHolderName;
    private double balance;
	
	// Default constructor
	BankAccount(){
		this("Unknown",0.0);
		this.accountNumber = generateAccountNumber();
        totalAccounts++;
	}
	
	// Parameterized constructor
	public BankAccount(String accountHolderName, double balance){
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		totalAccounts++;
	}
	
	// Copy constructor
    public BankAccount(BankAccount bA) {
        this.accountNumber = bA.accountNumber;
        this.accountHolderName = bA.accountHolderName;
        this.balance = bA.balance;
        totalAccounts++;
    }
	
	private String generateAccountNumber() {
        return "AC" + (100000 + totalAccounts);
    }

	@Override
	public void deposit(double amount){
		if(amount > 0){
			 balance += amount;
			 System.out.println("Deposited: Rs" + amount);
		}else{
			  System.out.println("Deposited amount should be positive");
		}
	}
	
	@Override
	public void withdraw(double amount){
		 if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: Rs" + amount);
        }else{
            System.out.println("Insufficient balance.");
        }
	}
	
	// Overloaded withdraw method with passcode
	void withdraw(double amount ,String passcode){
		 if (amount <= balance && amount > 0 && passcode.equals("2204")){
            balance -= amount;
            System.out.println("Withdrawn: Rs" + amount);
        }else{
            System.out.println("Invalid passcode or Insufficient balance.");
        }
	}
	
	@Override
	public void displayBalance(){
	   System.out.println("Current Balance: " + balance);
	}
	
	 // Getter methods for account details
	 public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
	
	// Static method to display total accounts
    public static void displayTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }
	
}

// Method overriding
class SavingsAccount extends BankAccount{
    private double minimumBalance;

    public SavingsAccount(String accountHolderName, double balance, double minimumBalance) {
        super(accountHolderName, balance);
        this.minimumBalance = minimumBalance;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance requirement not met.");
        }
    }
}

public class BankAccountSimulation{
	public static void main(String args[]){
		BankAccount account1 = new BankAccount("John Doe",1000.00);
		account1.displayBalance();
		account1.deposit(300.00);
		account1.withdraw(200.00);
		account1.withdraw(100.00,"2204");
		account1.displayBalance();
		
		System.out.println("\n-----Saving Account----");
        SavingsAccount account2 = new SavingsAccount("Jane Doe", 2000, 1000);
        account2.displayBalance();
        account2.withdraw(500);
        account2.displayBalance();
		
		
		System.out.println("\n-----Copy Constructor----");
		BankAccount acc2 = new BankAccount(account1);
        acc2.displayBalance();
		
		BankAccount.displayTotalAccounts();
	}
	
	
}

