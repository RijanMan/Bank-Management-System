import javax.swing.*;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class BankGUI implements ActionListener
{
    //ArrayList to store BankCard objects
    ArrayList<BankCard> Objects = new ArrayList<BankCard>();
    
    //Jframe and fonts
    private JFrame form;
    private Font fontT,font,fontPT,fontGT;
    
    //JPanels 
    private JPanel Bank, Debit, Credit;
    private JComboBox<String> WithdrawalDate,ExpirationDate;
    //JLabel
    private JLabel Title,Card_ID, Client_name, Client_bank, Issuer_bank, Bank_account, Balance_amount, PIN_number, Withdrawal_amount,CVC_number,Credit_limit,Interest_rate,Grace_period,Withdrawal_Date,Expiration_Date,Main_title,Debit_title,Credit_title;
    //JButton
    private JButton AddDebit, AddCredit, WithdrawnDebit,SetCreditlimit,Cancelcredit,Display,Display1,Display3,Clear;
    //JTextFields
    private JTextField Card_IDT, Client_nameT,Client_bankT, Issuer_bankT, Bank_accountT, Balance_amountT, PIN_numberT, Withdrawal_amountT,CVC_numberT,Credit_limitT,Interest_rateT,Grace_periodT;
    public BankGUI()
    {
        // Set up the JFrame and fonts
        form = new JFrame("form");
        font = new Font("Dialog",Font.PLAIN,20); 
        fontT = new Font("Dialog",Font.BOLD,35);
        fontPT = new Font("Dialog",Font.BOLD,25);
        fontGT = new Font("Dialog",Font.BOLD,28);
        
        //set up the JPanels
        Bank = new JPanel();
        Debit = new JPanel();
        Credit = new JPanel();
        
        //Set up JLabels for Tiltle
        Title = new JLabel("Bank GUI");
        Title.setFont(fontT);
        
        //Bank Panel Labels
        Card_ID = new JLabel("Card ID :");
        Client_name = new JLabel("Client Name :");
        Issuer_bank = new JLabel("Issuer Bank :");
        Bank_account = new JLabel("Bank Account :");
        Balance_amount = new JLabel("Balance Amount :");
        Main_title = new JLabel("Bank");
        
        //Debit Panel labels
        PIN_number = new JLabel("PIN Number :");
        Withdrawal_amount = new JLabel("Withdrawal Amount :");
        Withdrawal_Date = new JLabel("Withdrawal Date :");
        Debit_title = new JLabel("Debit Card");
        
        //Credit Panel labels
        CVC_number = new JLabel("CVC Number :");
        Credit_limit = new JLabel("Credit Limit :");
        Interest_rate = new JLabel("Interest Rate :");
        Grace_period = new JLabel("Grace Period :");
        Expiration_Date = new JLabel("Expiration Date :");        
        Credit_title = new JLabel("Credit Card");
        
        //set up the JButtons
        AddDebit = new JButton("Add Debit");
        AddCredit = new JButton("Add Credit");
        WithdrawnDebit = new JButton("Withdraw");
        SetCreditlimit = new JButton("Set Credit limit");
        Cancelcredit = new JButton("Cancel Credit");
        Display = new JButton("Display");
        Display1 = new JButton("Display");
        Display3 = new JButton("Display");
        Clear = new JButton("Clear");
        
        //textfields
        Card_IDT = new JTextField();
        Client_nameT = new JTextField();
        Client_bankT = new JTextField();
        Issuer_bankT = new JTextField();
        Bank_accountT = new JTextField();
        Balance_amountT = new JTextField();
        PIN_numberT = new JTextField();
        Withdrawal_amountT = new JTextField();
        CVC_numberT = new JTextField();
        Credit_limitT = new JTextField();
        Interest_rateT = new JTextField();
        Grace_periodT = new JTextField();
        
        form.add(Title);
        
        //Add the components to bank panel
        Bank.add(Card_ID);
        Bank.add(Client_name);
        Bank.add(Issuer_bank);
        Bank.add(Bank_account);
        Bank.add(Balance_amount);
        Bank.add(Main_title);
        Bank.add(Display3);
        
        //adding the compoients to Debit Panel
        Debit.add(PIN_number);
        Debit.add(Withdrawal_amount);
        Debit.add(Withdrawal_Date);
        Debit.add(Debit_title);
        
        //Adding the components to Credit Panel
        Credit.add(CVC_number);
        Credit.add(Credit_limit);
        Credit.add(Interest_rate);
        Credit.add(Grace_period);
        Credit.add(Expiration_Date);
        Credit.add(Credit_title);
        
        //Adding the components to Bank Panel
        Bank.add(Card_IDT);
        Bank.add(Client_nameT);
        Bank.add(Issuer_bankT);
        Bank.add(Bank_accountT);
        Bank.add(Balance_amountT);
        
        //Adding the components to Debti panel
        Debit.add(PIN_numberT);
        Debit.add(Withdrawal_amountT);
        
        //adding the textfield to Credit panel
        Credit.add(CVC_numberT);
        Credit.add(Credit_limitT);
        Credit.add(Interest_rateT);
        Credit.add(Grace_periodT);
        
        //adding the buttons to Debit panel
        Debit.add(AddDebit);
        Debit.add(Display);
        Debit.add(WithdrawnDebit);
        
        //adding the buttons to credit panels
        Credit.add(AddCredit);
        Credit.add(SetCreditlimit);
        Credit.add(Display1);
        Credit.add(Cancelcredit);
        
        form.add(Clear);
        
        //creating the combobox for the withdrawal date
        String WithdrawnDate[]={"Jan 2023","Feb 2023","Mar 2023","Apr 2023","May 2023","Jun 2023","Jul 2023","Aug 2023","Sep 2023","Oct 2023","Nov 2023","Dec 2023"};
        WithdrawalDate = new JComboBox<String>(WithdrawnDate);
        Debit.add(WithdrawalDate);
        
        //creating the combobox for the expiration date
        String ExpireDate[]={"Jan 2024","Feb 2024","Mar 2024","Apr 2024","May 2024","Jun 2024","Jul 2024","Aug 2024","Sep 2024","Oct 2024","Nov 2024","Dec 2024"};
        ExpirationDate = new JComboBox<String>(ExpireDate);
        Credit.add(ExpirationDate);
        
        //adding fonts to all the components
        Card_ID.setFont(font);
        Client_name.setFont(font);
        Issuer_bank.setFont(font);
        Bank_account.setFont(font);
        Balance_amount.setFont(font);
        PIN_number.setFont(font);
        Withdrawal_amount.setFont(font);
        CVC_number.setFont(font);
        Credit_limit.setFont(font);
        Interest_rate.setFont(font);
        Grace_period.setFont(font);
        Withdrawal_Date.setFont(font);
        AddDebit.setFont(font);
        AddCredit.setFont(font);
        WithdrawnDebit.setFont(font);
        SetCreditlimit.setFont(font);
        Cancelcredit.setFont(font);
        Display.setFont(font);
        Display1.setFont(font);
        Display3.setFont(font);
        Clear.setFont(font);
        Expiration_Date.setFont(font);
        
        //adding fonts for all the textfields
        Card_IDT.setFont(font);
        Client_nameT.setFont(font);
        Issuer_bankT.setFont(font);
        Bank_accountT.setFont(font);
        Balance_amountT.setFont(font);
        PIN_numberT.setFont(font);
        Withdrawal_amountT.setFont(font);
        CVC_numberT.setFont(font);
        Credit_limitT.setFont(font);
        Interest_rateT.setFont(font);
        Grace_periodT.setFont(font);
        WithdrawalDate.setFont(font);
        ExpirationDate.setFont(font);
        
        //adding fonts for the titles of panels
        Main_title.setFont(fontGT);
        Debit_title.setFont(fontPT);
        Credit_title.setFont(fontPT);
        
        //setBounds fro title in the main form
        Title.setBounds(425,10,160,42);
        
        //set bounds for compinents in the Bank Panel
        Main_title.setBounds(210,27,100,30);
        Card_ID.setBounds(40,170,85,30);
        Client_name.setBounds(40,295,150,30);
        Issuer_bank.setBounds(40,421,130,30);
        Bank_account.setBounds(40,547,151,30);
        Balance_amount.setBounds(41,673,177,30);
        Display3.setBounds(182,750,120,30);
        
        Card_IDT.setBounds(260,170,196,35);
        Client_nameT.setBounds(260,295,204,35);
        Issuer_bankT.setBounds(260,421,204,35);
        Bank_accountT.setBounds(260,547,204,35);
        Balance_amountT.setBounds(260,673,204,35);
        
        //set bounds for components in the debit panel
        Debit_title.setBounds(180,28,215,30);
        Withdrawal_amount.setBounds(31,81,215,30);
        Withdrawal_Date.setBounds(31,152,181,30);
        PIN_number.setBounds(31,225,138,30);
        
        Withdrawal_amountT.setBounds(295,81,165,35);
        WithdrawalDate.setBounds(295,152,165,35);
        PIN_numberT.setBounds(295,225,165,35);
        
        AddDebit.setBounds(20,280,150,30);
        Display.setBounds(182,280,120,30);
        WithdrawnDebit.setBounds(317,280,150,30);
        
        //set bounds for components in the credit panel
        Credit_title.setBounds(180,18,145,30);
        CVC_number.setBounds(31,68,145,30);
        Credit_limit.setBounds(31,129,141,30);
        Interest_rate.setBounds(31,194,138,30);
        Grace_period.setBounds(31,259,150,30);
        Expiration_Date.setBounds(31,319,189,30);
        
        CVC_numberT.setBounds(275,68,185,35);
        Credit_limitT.setBounds(275,129,185,35);
        Interest_rateT.setBounds(275,194,185,35);
        Grace_periodT.setBounds(275,259,185,35);
        ExpirationDate.setBounds(275,319,185,35);
        
        SetCreditlimit.setBounds(166,370,175,31);
        AddCredit.setBounds(20,425,150,30);
        Display1.setBounds(179,425,120,30);
        Cancelcredit.setBounds(310,425,165,31);
        
        Clear.setBounds(428,882,140,35);
        
        // Bank panel
        Bank.setLayout(null);
        Bank.setVisible(true);
        Bank.setBounds(0,60,500,815);
        Bank.setBackground(Color.decode("#E3F2C1")); //adding color
        Bank.setBorder(BorderFactory.createLineBorder(Color.decode("#AAC8A7")));
        
        //Debit panel
        Debit.setLayout(null);
        Debit.setVisible(true);
        Debit.setBounds(500,60,500,340);
        Debit.setBackground(Color.decode("#E3F2C1")); //adding color
        Debit.setBorder(BorderFactory.createLineBorder(Color.decode("#AAC8A7")));
        
        //credit panel
        Credit.setLayout(null);
        Credit.setVisible(true);
        Credit.setBounds(500,400,500,475);
        Credit.setBackground(Color.decode("#E3F2C1"));
        Credit.setBorder(BorderFactory.createLineBorder(Color.decode("#AAC8A7")));
        form.getContentPane().setBackground(Color.decode("#AAC8A7")); //adding color
        
        //adding the panels to the main form
        form.add(Bank);
        form.add(Debit);
        form.add(Credit);
        
        //setting the action listener for the buttons
        Display.addActionListener(this);
        Display1.addActionListener(this);
        Display3.addActionListener(this);
        Clear.addActionListener(this);
        AddDebit.addActionListener(this);
        WithdrawnDebit.addActionListener(this);
        SetCreditlimit.addActionListener(this);
        AddCredit.addActionListener(this);
        Cancelcredit.addActionListener(this);
        
        
        form.setLayout(null);
        
        
        form.setVisible(true);
        form.setSize(1000,965);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource() == AddDebit)
        {
            try
            {
                //storing inpute values from text fields
                int balanceAmount = Integer.parseInt(Balance_amountT.getText());
                int cardId = Integer.parseInt(Card_IDT.getText());
                String bankAccount = Bank_accountT.getText();
                String issuerBank = Issuer_bankT.getText();
                String clientName = Client_nameT.getText();
                int pinNumber = Integer.parseInt(PIN_numberT.getText());
                
                //Creatinig a new DebitCard object
                DebitCard debitcard= new DebitCard(balanceAmount,cardId,bankAccount,issuerBank,clientName,pinNumber);
                /* Checking if the objects collection is empty and adding the new DebitCard objects if it is*/
                if(Objects.isEmpty()) 
                {
                    Objects.add(debitcard);
                    JOptionPane.showMessageDialog(form,"Added Successfully to the Debit");
                }
                /*Checking if a DebitCard with the same cardID already exitst, 
                 * if not adding the new DebitCard object*/
                else
                {
                    boolean CardExist=false;
                    for(BankCard obj:Objects)
                    {
                        if( obj instanceof DebitCard && obj.getcardId() == cardId)
                        {
                            JOptionPane.showMessageDialog(form,"THE CARD ID ALREADY EXISTS");
                            CardExist = true;
                            break;
                        }
                    }
                    if(CardExist == false)
                    {
                        Objects.add(debitcard);
                        JOptionPane.showMessageDialog(form," Added Successfully to the Debit");
                    }
                }
            }
            catch(NumberFormatException ab)
            {
                JOptionPane.showMessageDialog(form,"ERROR Encountered, wrong variable or empty textfield found");
            } 
        }
        else if(a.getSource() == WithdrawnDebit)
        {
            try
            {
                //Storing input values from text fields
                int cardId = Integer.parseInt(Card_IDT.getText());
                int withdrawalAmount = Integer.parseInt(Withdrawal_amountT.getText());
                int pinNumber = Integer.parseInt(PIN_numberT.getText());
                String dateofWithdrawal = String.valueOf(WithdrawalDate.getSelectedItem());
                
                /*checking if the Objects collection is empty and showing an error message if it is*/
                if(Objects.isEmpty())
                {
                    JOptionPane.showMessageDialog(form,"No DebitCard found");
                }
                /*Checking if a DebitCard with teh same cardId exits*/
                else
                {
                    boolean CardExist= false;
                    for (BankCard obj:Objects)
                    {
                        if(obj instanceof DebitCard && obj.getcardId() == cardId)
                        {
                            DebitCard debitcard = (DebitCard) obj;
                            //Checking if the provided pinNumber matches the DebitCard object's pinNumber
                            if(debitcard .getPINNumber() == pinNumber)
                            {
                                /*Checking if the DebitCard object's balanceAmount is emough for the withdrawal
                                   withdrawing the amount from the DebitCard objects and showing a success message*/
                                if(debitcard.getBalanceAmount() >= withdrawalAmount)
                                {
                                    debitcard.withdraw(withdrawalAmount,dateofWithdrawal,pinNumber);
                                    JOptionPane.showMessageDialog(form,"Withdrawal Successful"+"\nWithdrawal Amount: "+String.valueOf(withdrawalAmount)+
                                    "\nCard_ID: "+String.valueOf(cardId)+"\nDate Of Withdrawal: "+dateofWithdrawal+"\nPIN number: "+ String.valueOf(pinNumber) );
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(form,"Insufficient balance in the DebitCard");
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(form,"Incorrect PIN Number");
                            }
                            CardExist = true;
                            break;
                        }
                    }
                    if (!CardExist)
                    {
                        JOptionPane.showMessageDialog(form,"No DebitCard found with the given Card ID");
                     }
                }
            }
            catch(NumberFormatException Exception)
            {
                JOptionPane.showMessageDialog(form,"Please Enter Card ID or withdrawal amount or balance amount");
            }
        }
        else if(a.getSource() == Display3)
        {
            try
            {
                //storing input values from text fields
                int balanceAmount = Integer.parseInt(Balance_amountT.getText());
                int cardId = Integer.parseInt(Card_IDT.getText());
                String bankAccount = Bank_accountT.getText();
                String issuerBank = Issuer_bankT.getText();
                String clientName = Client_nameT.getText();
                //creting a new BankCard object and settig its clientName
                BankCard obj = new BankCard(balanceAmount,cardId,bankAccount,issuerBank);
                obj.setClientName(clientName);
                //Displaying the details of the BankCard object
                obj.display();
            }
            catch(NumberFormatException ac)
            {
                JOptionPane.showMessageDialog(form,"ERROR Detected, wrong variable or empty TextField Found.");
            }
        }
        else if(a.getSource() == Display)
        {
             try
            {
                //storing input values from text fields
                int cardId = Integer.parseInt(Card_IDT.getText());
                //checking if a DebitCard with the same cardId exists
                boolean play = false;
                for (BankCard dis: Objects)
                {
                    //displaying the details of the DebitCard objects
                    if (dis instanceof DebitCard && dis.getcardId() == cardId)
                    {
                        DebitCard debitcard = (DebitCard) dis;
                        debitcard.displaydetails();
                        play = true;
                        break;
                    }
                }
                //show an error message if the Debitcard object deos not exist
                if (play == false)
                {
                    JOptionPane.showMessageDialog(form,"Debit Card not found.");
                }
            }
            catch(NumberFormatException ac)
            {
                JOptionPane.showMessageDialog(form,"ERROR Detected, wrong variable or empty TestField Found.");
            }
        }
        else if(a.getSource() == AddCredit)
        {
            try
            {
                //storing input values from text fields
                double balanceAmount = Double.parseDouble(Balance_amountT.getText());
                int cardId = Integer.parseInt(Card_IDT.getText());
                String bankAccount = Bank_accountT.getText();
                String issuerBank = Issuer_bankT.getText();
                String clientName = Client_nameT.getText();
                int CVCnumber = Integer.parseInt(CVC_numberT.getText());
                double creditLimit = Double.parseDouble(Credit_limitT.getText());
                double interestRate = Double.parseDouble(Interest_rateT.getText());
                int gracePeriod = Integer.parseInt(Grace_periodT.getText());
                String expirationDate = String.valueOf(ExpirationDate.getSelectedItem());
                //creating a new CreditCard object
                CreditCard creditcard= new CreditCard(cardId,clientName,issuerBank,bankAccount,balanceAmount,CVCnumber,interestRate,expirationDate);
                /*checking if the objects collection is empty 
                 * and adding the new CreditCard objects if it is*/
                if(Objects.isEmpty())
                {
                    Objects.add(creditcard);
                    JOptionPane.showMessageDialog(form,"Added Successfully to the Credit");
                }
                //checking if a CreditCard with the same cardId already exists, if not adding the new Creditcard object
                else
                {
                    boolean CardExist =false;
                    for(BankCard obj:Objects)
                    {
                        if(obj instanceof CreditCard && obj.getcardId() == cardId)
                        {
                            JOptionPane.showMessageDialog(form,"The Card ID already Exists");
                            CardExist = true;
                            break;
                        }
                    }
                    if(CardExist==false)
                    {
                        Objects.add(creditcard);
                        JOptionPane.showMessageDialog(form,"Added Successfully to the credit");
                    }
                }
            }
            catch(NumberFormatException ac)
            {
                JOptionPane.showMessageDialog(form,"ERROR Detected, wrong variable or empty TestField Found.");
            }
        }
        //check if the source of the event is the Display1 button
        else if(a.getSource() == Display1)
        {
             try
            {
                // getting the card ID from the text field
                int cardId = Integer.parseInt(Card_IDT.getText());
                boolean ab = false;
                // searching for a CreditCard object in the Objecits list with the matching card ID
                for (BankCard abc: Objects)
                {
                    if (abc instanceof CreditCard && abc.getcardId() == cardId)
                    {
                        CreditCard creditcard = (CreditCard) abc;
                        //Displaying the details of the credit card
                        creditcard.displaydetails();
                        ab = true;
                        break;
                    }
                }
                //display an error message if no matching credit card was found
                if (ab == false)
                {
                    JOptionPane.showMessageDialog(form,"ERROR Detected, wrong variable or empty TestField Found.");
                }
            }
            /*display an error message if the card ID text field is empty
             * or contains non-numberic characters*/
            catch(NumberFormatException ac)
            {
                JOptionPane.showMessageDialog(form,"ERROR Detected, wrong variable or empty TestField Found.");
            }
        }
        //checking ig the source of the event is the SetCreditlimit button
        else if(a.getSource() == SetCreditlimit)
        {
            try
            {
                // Get the card ID, credit limit, and grace eperiod from the respective text fields
                int cardId = Integer.parseInt(Card_IDT.getText());
                double creditLimit = Double.parseDouble(Credit_limitT.getText());
                int gracePeriod = Integer.parseInt(Grace_periodT.getText());
                
                // Display an error message if the Objects list is empty
                if(Objects.isEmpty())
                {
                    JOptionPane.showMessageDialog(form,"ERROR: There are no bank cards in the system.");
                }
                else
                {
                    boolean b = false;
                    // Search for a CreditCard object in the Objects list with the matching card ID
                    for(BankCard obj: Objects)
                    {
                        if(obj instanceof CreditCard && obj.getcardId() == cardId)
                        {
                            CreditCard creditCard = (CreditCard) obj;
                            //set the credit limit and grace period of the credit card
                            creditCard.setCreditlimit(creditLimit, gracePeriod); 
                            //Display a success messgagee
                            JOptionPane.showMessageDialog(form,"The credit limit has been set successfully.");
                            b = true;
                            break;
                        }
                    }
                    if(!b)
                    {
                        //Display an error message if no matching credit card was found
                        JOptionPane.showMessageDialog(form,"ERROR: The card ID does not exist or does not belong to a credit card.");  
                    }
                }
            }
            catch(NumberFormatException b)
            {
                // Display an error message if any of the text fields contain invalid data
                JOptionPane.showMessageDialog(form,"ERROR: Invalid input. Please enter valid numbers.");
            }
        }
        // Check if the source of the event is the Cancelcredit button
        else if(a.getSource() == Cancelcredit)
        {
            try
            {
                // Get the card ID from the text field
                int cardId = Integer.parseInt(Card_IDT.getText());
                boolean cardFound=false;
                if (Objects.isEmpty())
                {
                    // Display an error message if the Objects list is empty
                    JOptionPane.showMessageDialog(form,"ERROR: There are no bank cards in the system.");
                }
                else
                {
                    
                     // Search for a CreditCard object in the Objects list with the matching card ID
                    for(BankCard obj:Objects)
                    {
                        if(obj instanceof CreditCard && obj.getcardId() == cardId)
                        {
                            CreditCard creditcard = (CreditCard)obj;
                            // Cancel the credit card
                            creditcard.cancelCreditCard();
                            // Display a success message
                            JOptionPane.showMessageDialog(form,"The credit card has been cancelled");
                            cardFound = true;
                            break;
                        }
                    }
                    // If no credit card with the given card ID was found, show an error message
                    if(cardFound == false)
                    {
                        JOptionPane.showMessageDialog(form,"The Card ID does not exist or does not belong to a credit card","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException ac)
            {
                JOptionPane.showMessageDialog(form, "ERROR Detected, wrong variable or empty TextField Found.");
            }
        }
        else if(a.getSource()== Clear)
        {
            Card_IDT.setText("");
            Client_nameT.setText("");
            Client_bankT.setText("");
            Issuer_bankT.setText("");
            Bank_accountT.setText("");
            Balance_amountT.setText("");
            PIN_numberT.setText("");
            Withdrawal_amountT.setText("");
            CVC_numberT.setText("");
            Credit_limitT.setText("");
            Interest_rateT.setText("");
            Grace_periodT.setText("");
            //display a message dialog to inform that the form has been cleard
            JOptionPane.showMessageDialog(form,"Your form has been cleared");   
        }
    }   
    //This is the main method that creates a new instance of the BankGUI class
    public static void main(String[]args)
    {
        new BankGUI();
    }
    
}