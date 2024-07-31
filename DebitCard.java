 /**DebitCard is a child class 
   BankCard is a parent class**/
public class DebitCard extends BankCard//creating class
{
    // declaring four attributes
    private int pinNumber;
    private int withdrawalAmount;
    private String dateofWithdrawal;
    private boolean hasWithdrawn;
    
    // creating constructor Debitcard with six parameters
    public DebitCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber) 
    {
        super(balanceAmount,cardId,bankAccount,issuerBank);//calling the instance variable of parant class BankCard Class
        setClientName(clientName);
        this.pinNumber = pinNumber;
        hasWithdrawn = false;
    }
    // creating the accessor methods
    public int getPINNumber() 
    {
         return this.pinNumber;
    }
    
    public int getWithdrawalamount() 
    {
        return this.withdrawalAmount;
    }
    
    public String getDateOfWithdrawal() 
    {
        return this.dateofWithdrawal;
    }
    
    public boolean getHasWithdrawn() 
    {
        return this.hasWithdrawn;
    }
    //creating the mutator method
    public void setWithdrawAlamount(int withdrawalAmount) 
    {
        this.withdrawalAmount = withdrawalAmount;
    }
    // creating new constructor called withdraw
    public void withdraw(int withdrawalAmount, String dateofWithdrawal, int pinNumber) 
    {
        if (this.pinNumber == pinNumber) 
        {
            if (withdrawalAmount <= getBalanceAmount()) {
                setBalanceAmount(getBalanceAmount() - withdrawalAmount);
                this.withdrawalAmount=withdrawalAmount;
                this.dateofWithdrawal=dateofWithdrawal;
                hasWithdrawn = true;
                System.out.println("Transaction was done successful. Amount withdrawn: " + withdrawalAmount);
            } 
            else {
                System.out.println("Insufficient balance.");
            }
        } 
        else {
            System.out.println("Invalid PIN number.");
        }
    }
    // creating new method calle displaydetails
    public void displaydetails()
    {
        super.display();
        System.out.println("Pin number: " + this.pinNumber);
        if (this.hasWithdrawn == true){
            System.out.println("Withdrawal Amount: " + withdrawalAmount);
            System.out.println("Date of Withdrawal: " + dateofWithdrawal);
        }
        else{
            System.out.println("Balance Amount: " + getBalanceAmount());
        }
    }
}