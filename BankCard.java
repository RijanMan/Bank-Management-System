/** Creating a BankCard
   and  declaring the variables**/
public class BankCard // creating a class
{
    // declaring the require 5 variable
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;
    // creating a constructor and four other parameters
    public BankCard(double balanceAmount, int cardId,String bankAccount,String issuerBank)
    {
        this.balanceAmount = balanceAmount;// initalizing the instance variable with parameters
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        clientName = "";
    }
    //creating accessor method
     public int getcardId() 
    {
        return this.cardId;
    }
  
    public String getClientName() 
    {
        return this.clientName;
    }
  
    public String getIssuerBank() 
    {
        return this.issuerBank;
    }
  
    public String getBankAccount() 
    {
        return this.bankAccount;
    }
  
    public double getBalanceAmount() 
    {
        return this.balanceAmount;
    }
    // creating mutator method
    public void setClientName(String clientName) 
    {
        this.clientName = clientName;
    }
  
    public void setBalanceAmount(double balanceAmount) 
    {
        this.balanceAmount = balanceAmount;
    }
    // creating a new method called display
    public void display() 
    {
        if (clientName.equals("")) {
            System.out.println("Client name not assigned.");
        } 
        else {
            System.out.println("Client name: " + clientName);
        }
        System.out.println("Card ID: " + cardId); 
        System.out.println("Issuer bank: " + issuerBank);
        System.out.println("Bank account: " + bankAccount);
        System.out.println("Balance amount: " + balanceAmount);
    }
}