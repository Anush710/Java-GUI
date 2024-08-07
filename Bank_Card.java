
/**
 * Write a description of class Bank_Card here.
 *
 * @author (Anush Shrestha)
 * @version (2023-01-27)
 */
public class Bank_Card
{
   private String client_name;
   private String issuer_bank;
   private String bank_account;
   private double balance_amount;
   private int Card_id;
   
   //Constructors
   
   public Bank_Card(String issuer_bank,String bank_account,int Card_id,
   double balance_amount)
   
   {
       this.client_name="";
       this.issuer_bank = issuer_bank;
       this.bank_account = bank_account;
       this.Card_id = Card_id;
       this.balance_amount = balance_amount;
   }
   
   //Getters method --> instance variable:client_name
   
   public String getclient_name()
   {
       return this.client_name;
   }
   
//Getters Method --> Instance variable:issuer_bank

public String getissuer_bank()
{
    return this.issuer_bank;
}

//Getters Method --> Instance variable:bank_account
public String getbank_account()
{
    return this.bank_account;
}

//Getters Method --> Instance variable:balance_amount
public double getbalance_amount()
{
    return this.balance_amount;
}

//Getters Method --> Instance variable:Card_id
public int getCard_id()
{
    return this.Card_id;
}

//Setter Method --> Instance variable: client_name
public void setclient_name(String newclient_name)
{
    this.client_name=newclient_name;
    
}

//Setter Method --> Instance variable: balance_amount

public void setbalance_amount(double newbalance_amount)
{
    this.balance_amount=newbalance_amount;
}

//Display method
public void display()
{
     System.out.println("Your bank card is issued by" + this.issuer_bank);
       System.out.println("Your bank account is" + this.bank_account);
       System.out.println("You have "+this.balance_amount +" in your account");
         System.out.println("Your card id is" + this.Card_id);
    if (this.client_name=="")
    {
        System.out.println("Client  name is wrong");
    }
    
    else
    {
        System.out.println("The Client name is"+ this.client_name);
    }
    
}
}

   

