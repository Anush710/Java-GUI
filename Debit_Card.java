
/**
 * Write a description of class Debit_Card here.
 *
 * @author (Anush Shrestha)
 * @version (2023-01-27)
 */
public class Debit_Card extends Bank_Card
{
    private int PIN_number;
    private int Withdrawal_Amount;
    private String date_of_Withdrawal;
    private boolean hasWithdrawn;
//Constructor
    public Debit_Card(String issuer_bank, String bank_account, int Card_id, 
    double balance_amount, int PIN_number, String client_name)
    {
        super(issuer_bank, bank_account, Card_id, balance_amount);
        super.setclient_name(client_name);
        super.setbalance_amount(balance_amount);
        this.PIN_number=PIN_number;
        this.hasWithdrawn = false;
    }
    

//getters Method --> instance variable:PIN_number
public int getPIN_number()
{
return this.PIN_number;
}
//getters Method --> instance variable:Withdrawal_Amount
public int getWithdrawal_Amount()
{
return this.Withdrawal_Amount;
}
//getters Method --> instance Variable:date_Of_Withdrawal
public String getdate_of_Withdrawal()
{
return this.date_of_Withdrawal;
}
//getters Method --> instance Variable:hasWithdrawn
public boolean gethasWithdrawn()
{
return this.hasWithdrawn;
}
// setters Method -->new instance Variable:Withdrawal_Amount
public void setWithdrawal_Amount(int Withdrawal_Amount)
{
this.Withdrawal_Amount = Withdrawal_Amount;
}


public void Withdraw(int PIN_number, String date_of_Withdrawal, int Withdrawal_Amount)
{
    if(PIN_number==this.PIN_number && Withdrawal_Amount<=super.getbalance_amount())
    {
        this.Withdrawal_Amount=Withdrawal_Amount;
        this.date_of_Withdrawal=date_of_Withdrawal;
        this.hasWithdrawn = true;
        setbalance_amount(getbalance_amount()- Withdrawal_Amount);
        System.out.print("Your Withdrawal has been succesful! Your New Balance Amount ="+getbalance_amount());
    }
    else if(Withdrawal_Amount>getbalance_amount())
    
    {
        System.out.print("Insufficient balance in your account");
    }
    else
    {
        System.out.print("Wrong PIN number, please try again.");
    }
}
//Display method
public void display()
{
    super.display();
    System.out.println("PIN= "+PIN_number);
    if(hasWithdrawn = false)
    {
        System.out.println("Transaction hasn't been carried out yet");
        System.out.println("\n Balance Amount = "+ getbalance_amount());
    } 
    else
    {
        System.out.println("Withdrawal Amount = " + Withdrawal_Amount);
        System.out.println("Date of Withdrawal ="+date_of_Withdrawal);
    }
}
}

