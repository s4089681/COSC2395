/** class Bank to run application
  */

public class Bank{
  public static void main(String[] args){
    //create superclass Account
    Account acc1 = new Account("a12", 10000.0);
    //print it
    System.out.println(acc1.toString());
    //deposit
    acc1.deposit(100);
    //display
    System.out.println("After depositing 100 balance is " + acc1.getBalance());
    //withdraw
    acc1.withdraw(11000);
    System.out.println("After withdrawing 11000 balance is " + acc1.getBalance());
    //create subclass SAccount instance
    Account sacc1 = new SAccount("s123", 3000, 10, 2.5);
    //display
    System.out.println(sacc1);
    //deposit
    sacc1.deposit(300);
    System.out.println("After depositing 300 balance is " + sacc1.getBalance());
    //withdraw
    sacc1.withdraw(600);
    System.out.println("After withdrawing 600 balance is " + sacc1.getBalance());
    //illegal withdraw
    sacc1.withdraw(2800);
    
        
  }
}