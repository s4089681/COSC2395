/**subclass of Account class
 *it will inherit protected instance variables and public methods
 *constructors are not inherited, must be created
*/

public class SAccount extends Account{
  //specific variables
  private double minAmount;
  private double interestRate;
  
  //constructors
  public SAccount(){
    super(); //optional, provided by default
  }
  public SAccount(String accID, double balance, double minAmount,
                  double interestRate){
    super(accID, balance); //call to superclass constructor
    //assignments for specific variables
    this.minAmount = minAmount;
    this.interestRate = interestRate;
  }
  //get methods (accessors)
  public double getMinAmount(){
    return minAmount;
  }
  public double getInterestRate(){
    return interestRate;
  }
  //set methods(mutators)
  public void setMinAmount(double minAmount){
    this.minAmount = minAmount;
  }
  public void setInterestRate(double interestRate){
    this.interestRate = interestRate;
  }
  //custom methods
  //deposit is inherited
  @Override
  public void withdraw(double amount){
    if(balance - amount >= minAmount)
      balance -= amount;
    else
      System.out.println("You cannot withdraw this amount");
  }
  @Override
  public String toString(){
    return super.toString() + ". Min amount: " + minAmount + 
      ". Interest rate: " + interestRate;
  }
}
  