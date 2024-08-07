
/**
 * Write a description of class Credit_Card here.
 *
 * @author (Anush Shrestha)
 * @version (2023-01-27)
 */
public class Credit_Card extends Bank_Card
{
   private int CVC_number;
   private double Credit_limit;
   private double Interest_Rate;
   private String Expiration_date;
   private int Graceperiod;
   private boolean is_Granted;
   
   //Constructor
   public Credit_Card(String issuer_bank, String bank_account, int Card_id, double balance_amount, int CVC_number, double Interest_Rate, String Expiration_date,
    String client_name)
   {
       super(issuer_bank,bank_account,Card_id, balance_amount );
       super.setclient_name(client_name);
       super.setbalance_amount(balance_amount);
       this.CVC_number=CVC_number;
       this.Interest_Rate= Interest_Rate;
       this.Expiration_date=Expiration_date;
       this.is_Granted= false;
       
   }
   //Getters Method --> Instance variable:CVC_number
   public int getCVC_number()
   {
       return this.CVC_number;
   }
   public double getCredit_limit()
   {
       return this.Credit_limit;
   }
   
   public double getInterest_Rate()
   {
       return this.Interest_Rate;
   }
   
   public String getExpiration_date()
   {
       return this.Expiration_date;
   }
   
   public int getGraceperiod()
   {
       return this.Graceperiod;
   }
   
   public boolean getis_Granted()
   {
       return this.is_Granted;
   }
   
   //setter
   
   public void setCredit_limit(double Credit_limit, int Graceperiod)
   {
       if(Credit_limit <= 2.5*getbalance_amount())
       {
           this.Credit_limit = Credit_limit;
           this.Graceperiod = Graceperiod;
           this.is_Granted = true;
           
       }
       else
       {
           System.out.println("Credit cannot be issued");
       }
   }
   
   //method to cancel the Credit Card if client hasn't paid interests
   
   public void cancelCredit_Card()
   {
        if (super.getbalance_amount()== 0 && Interest_Rate == 0)
       {
       this.CVC_number = 0;
       this.Credit_limit= 0;
       this.Graceperiod= 0;
       this.is_Granted= false;
       
       {
           System.out.println("Credit Card is cancelled successfully");
       }
       
    }
    else
    {
        System.out.println("Cannot cancel Credit card");
    }

   }
   
    
   //display method
   
   public void display()
   {
       if(this.is_Granted= true)
       {
           super.display();
           System.out.println("CVC number= "+ CVC_number);
           System.out.println("Credit Limit= "+ Credit_limit);
           System.out.println("Interest Rate= "+ Interest_Rate);
           System.out.println("Expiration Date= "+ Expiration_date);
           System.out.println("Grace Period= "+ Graceperiod);
       }
       else
       {
           System.out.println("Credit hasn't been granted");
       }
   }
}

   
