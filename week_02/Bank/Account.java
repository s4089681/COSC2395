public  class Account {
    protected String accID;
    protected double balance;

    public Account() {
    }
    public Account(String accID, double balance) {
        this.accID = accID;
        this.balance = balance;
    }
    public String getAccID() {
        return accID;
    }
     public void setAccID(String accID) {
        this.accID = accID;
    }
    public double getBalance() {
        return balance;
    }
     public void setBalance(double balance) {
        this.balance = balance;
    }
     //custom methods
     public void deposit(double amount){
       balance += amount;
     }
     public void withdraw(double amount){
       balance -= amount;
     }
    @Override
     public String toString(){
         return "Account:" + accID + ". Balance: " + balance;
     }
}
