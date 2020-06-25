package bank;

class Account {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    
    public int getId() {
        return this.id;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public double ageAnnualInterestRate() {
        return this.annualInterestRate;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Successful. You withdrew " + amount + ".");
        } else {
            System.out.println("Not enough MONEY!");
        }
        
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successful. You deposited " + amount + ".");
        }
    }
}