public class CreditCard extends BankCard /**Creating a class CreditCard which is 
child class of the super class BankCard**/
{
    //creating the attributes
    private int CVCnumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    // creating a constructor CreditCard and adding eight parameters
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, double balanceAmount, int CVCnumber, double interestRate, String expirationDate) 
    {
        super(balanceAmount,cardId,bankAccount,issuerBank);// calling balanceAmount, cardId, bankAccount and issuerBank from parant clss BankCard
        setClientName(clientName);
        this.CVCnumber = CVCnumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        isGranted = false;
    }
    // accessor methods
    public int getCVCNumber() 
    {
        return this.CVCnumber;
    }
    
    public double getCreditLimit() 
    {
        return this.creditLimit;
    }
    
    public double getInterestRate() 
    {
        return this.interestRate;
    }
    
    public String getExpirationDate() 
    {
        return this.expirationDate;
    }
    
    public int getGracePeriod() 
    {
        return this.gracePeriod;
    }
    
    public boolean getIsGranted() 
    {
        return this.isGranted;
    }
    // mutator method
    public void setCreditlimit(double newCreditLimit, int newGracePeriod) 
    {
        if (newCreditLimit <= (getBalanceAmount() * 2.5)) {
            creditLimit = newCreditLimit;
            gracePeriod = newGracePeriod;
            isGranted = true;
            System.out.println("Credit limit accessed. New credit limit: " + newCreditLimit + " and grace period: " + newGracePeriod);
        } 
        else {
            System.out.println("Credit limit cannot be granted as the limit exceeds 2.5 times the account balance.");
        }
    }
    // creating a new constructor called cancelCreditCard
    public void cancelCreditCard() 
    {
        CVCnumber = 0;
        creditLimit = 0;
        gracePeriod = 0;
        isGranted = false;
    }
    // creating method called displaydetails
    public void displaydetails() 
    {
        super.display();
        System.out.println("CVC number: " + CVCnumber);
        System.out.println("Interest rate: " + interestRate);
        System.out.println("Expiration date: " + expirationDate);
        if (isGranted) {
            System.out.println("Credit limit: " + creditLimit);
            System.out.println("Grace period: " + gracePeriod);
        } 
        else {
            System.out.println("Credit limit and grace period not available as credit has not been granted to the client.");
        }
    } 
}