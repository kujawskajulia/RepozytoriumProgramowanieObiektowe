public class BankAccount {
    private String owner;
    private double balance;
    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount){
        if (balance>0){
            this.balance += amount;
        }
    }
    public boolean withdraw(double amount) {
        if (amount < 0 || amount > this.balance) {
            return false;
        }
        this.balance -= amount;
        return true;
    }
    public String getOwner(){
        return this.owner;
    }
    public double getBalance(){
        return this.balance;
    }
}
