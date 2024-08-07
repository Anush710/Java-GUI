import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * Write a description of class BankGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class BankGUI implements ActionListener
{
private JFrame frame;
private JPanel panel;
private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20;
private JTextField f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16;
private JComboBox<String> c1, c2, c3, c4, c5, c6;
private JButton b1,b2, b3, b4, b5, b6, b7;
    ArrayList<Bank_Card> list  = new ArrayList<Bank_Card>();


    public BankGUI()
    {
        
     frame = new JFrame("Bank GUI");
     panel = new JPanel();
     l1 = new JLabel("Debit Card");
     l2 = new JLabel("Card_id");
     f1 = new JTextField(); 
     l3 = new JLabel("client_name");
     f2 = new JTextField();
     l4 = new JLabel("balance_amount");
     f3 = new JTextField();
     l5 = new JLabel("PIN_number");
     f4 = new JTextField();
     l6 = new JLabel("issuer_bank");
     f5 = new JTextField();
     l7 = new JLabel("bank_account");
     f6 = new JTextField();
     l8= new JLabel("Withdrawal_Amount");
     f7 = new JTextField();
     l9 = new JLabel("date_of_Withdrawal");
     String[] Year = {"year","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
     String[] Day = {"day","1","2","3","4","5","7","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","29","30"};
     String[] Month ={"month","Jan","Feb","Mar","apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
     c1 =new JComboBox<>(Year);
     c2 =new JComboBox<>(Day);
     c3 =new JComboBox<>(Month);
     b1 =new JButton("Add Debit Card"); 
     b2 =new JButton("Clear");
     b3 =new JButton("Display");
     b4 =new JButton("Withdraw");
     b5 =new JButton("Add Credit Card");
     b6 =new JButton("Cancel Credit Card"); 
     b7 =new JButton("Set Credit Limit");

     l10 = new JLabel("Credit Card");
     l11 = new JLabel("Card_id");
     f8 = new JTextField(); 
     l12 = new JLabel("client_name");
     f9 = new JTextField();
     l13= new JLabel("balance_amount");
     f10 = new JTextField();
     l14= new JLabel("CVC_number");
     f11 = new JTextField(); 
     l15 = new JLabel("issuer_bank"); 
     f12 = new JTextField();
     l16= new JLabel("bank_account");
     f13 = new JTextField();
     l17= new JLabel("Interest_Rate");
     f14 = new JTextField();
     l18= new JLabel("Credit_limit");
     f15 = new JTextField();
     l19= new JLabel("Graceperiod");
     f16 = new JTextField();
     l20 = new JLabel("Expiration_date");
     String[] year = {"year","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
     String[] day = {"day","1","2","3","4","5","7","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","29","30"};
     String[] month ={"month","Jan","Feb","Mar","apr","May","Jun","July","Aug","Sep","Oct","Nov"};
     c4 =new JComboBox<>(Year);
     c5 =new JComboBox<>(Day);
     c6 =new JComboBox<>(Month);

    
     frame.add(l1);  
     frame.add(l2);
     frame.add(l3);
     frame.add(l4);
     frame.add(l5);
     frame.add(l6);
     frame.add(l7);
     frame.add(l8);
     frame.add(l9);
     frame.add(l10);  
     frame.add(l11);
     frame.add(l12);
     frame.add(l13);
     frame.add(l14);
     frame.add(l15);
     frame.add(l16);
     frame.add(l17);
     frame.add(l18);
     frame.add(l19);
     frame.add(l20);
     frame.add(f1);
     frame.add(f2);
     frame.add(f3);
     frame.add(f4);
     frame.add(f5);
     frame.add(f6);
     frame.add(f7);
     frame.add(f8);
     frame.add(f9);
     frame.add(f10);
     frame.add(f11);
     frame.add(f12);
     frame.add(f13);
     frame.add(f14);
     frame.add(f15);
     frame.add(f16);

     frame.add(c1);
     frame.add(c2);
     frame.add(c3);
     frame.add(c4);
     frame.add(c5);
     frame.add(c6);
     frame.add(b1);
     frame.add(b2);
     frame.add(b3);
     frame.add(b4);
     frame.add(b5);
     frame.add(b6);
     frame.add(b7);
    
     l1.setBounds(360,15,200,40);
     l2.setBounds(20,70,100,20);
     f1.setBounds(120,70,150,30);
     l3.setBounds(600,70,200,40);
     f2.setBounds(680,75,150,30);
     l4.setBounds(20,120,100,20);
     f3.setBounds(120,120,150,30);
     l5.setBounds(600,170,200,40);
     f4.setBounds(680,175,150,30);
     l6.setBounds(600,120,200,40);
     f5.setBounds(680,125,150,30);
     l7.setBounds(20,170,200,40);
     f6.setBounds(120,180,150,30);
     l8.setBounds(20,280,200,40);
     f7.setBounds(135,290,150,30);
     l9.setBounds(20,330,200,40);
     l10.setBounds(360,400,200,40);
     l11.setBounds(20,450,100,20);
     f8.setBounds(120,450,150,30);
     l13.setBounds(20,500,100,20);
     f10.setBounds(120,500,150,30);
     l16.setBounds(20,540,200,40);
     f13.setBounds(120,550,150,30);
     l15.setBounds(600,450,200,40);
     f12.setBounds(680,455,150,30);
     l12.setBounds(600,500,200,40);
     f9.setBounds(680,505,150,30);
     l14.setBounds(600,550,200,40);
     f11.setBounds(680,555,150,30);
     l17.setBounds(20,635,200,40);
     f14.setBounds(120,635,150,30);
     l18.setBounds(20,670,200,40);
     f15.setBounds(120,670,150,30);
     l19.setBounds(600,640,200,40);
     f16.setBounds(680,640,150,30);
     l20.setBounds(20,700,200,40);;
     c1.setBounds(140,340,80,25);
     c2.setBounds(240,340,50,25);
     c3.setBounds(305,340,70,25);
     c4.setBounds(120,705,80,25);
     c5.setBounds(230,705,50,25);
     c6.setBounds(300,705,70,25);
     b1.setBounds(60,230,150,40);
     b2.setBounds(800,700,150,40);
     b3.setBounds(450,700,150,40);
     b4.setBounds(600,230,150,40);
     b5.setBounds(800,590,150,40);
     b6.setBounds(600,590,150,40);
     b7.setBounds(620,700,150,40);
  
         
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
     b6.addActionListener(this);
     b7.addActionListener(this);
  
     frame.add(panel);
     frame.add(panel);
     frame.setLayout(null);
     frame.setVisible(true);
     frame.setSize(1280,1080);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
 }
 @Override
 public void actionPerformed(ActionEvent a)
 
    {
        // Check if the event source is the "Add Debit Card" nbutton
    if(a.getSource()==b1)
     {
         //Check if any of the required text fields are empty
            if (f1.getText().isEmpty() || f2.getText().isEmpty() || f3.getText().isEmpty() || f4.getText().isEmpty() || f5.getText().isEmpty() || f6.getText().isEmpty() )
              {
                  //Display an error message if any of the text field are empty
               JOptionPane.showMessageDialog(frame,"Please dont leave any text field","Error",JOptionPane.ERROR_MESSAGE);
              }
               else
                 {
                  try
                    {
                        //Parse the values from the text fields
                   int Card_id = Integer.parseInt(f1.getText());
                   String bank_account = f6.getText();
                   String client_name = f2.getText();
                   int PIN_number = Integer.parseInt(f4.getText()); 
                   String issuer_bank = f5.getText();
                   int balance_amount = Integer.parseInt(f3.getText());
                   
                   // Check if the Card_id already exists in the list
                   boolean anush = true;
                   for(Bank_Card x : list)
                     {
                       if(x instanceof Debit_Card)
                       {
                           Debit_Card object= (Debit_Card) x;
                           if( Card_id== object.getCard_id())
                           {
                                anush= false;
                           }
                       }
                    }
                    // If the Card_id doesnt exist, create a new Debit_Card object
                   if(anush== true)
                     {
                        Debit_Card drake= new Debit_Card(issuer_bank, bank_account, Card_id, balance_amount, PIN_number, client_name);
                        list.add( drake);
                        // Display a success message if the card was created
                        JOptionPane.showMessageDialog(frame,"Debit card has been created","Success",JOptionPane.INFORMATION_MESSAGE);
                      }
                        else
                          {
                              //Display an error message if the Card_id already exists
                           JOptionPane.showMessageDialog(frame,"Card ID exits","Error",JOptionPane.ERROR_MESSAGE);
                          }
                   }  catch(NumberFormatException n) 
                      {
                          //Display an error message if the Card_id or balance amount is invalid 
                        JOptionPane.showMessageDialog(frame,"Enter valid Card id","Error",JOptionPane.ERROR_MESSAGE);
                      }
                 }
                 // Check if the event source is the "Display" button
    }
                  else if(a.getSource()==b3)
                  {
                      // Loop through  all bank cards in the list and display information
                    for(Bank_Card x : list)
                      {
                       if(x instanceof Debit_Card)
                       {
                           Debit_Card object= (Debit_Card) x;
                           object.display();
                       }
                        else if(x instanceof Credit_Card)
                       {
                           Credit_Card object= (Credit_Card) x;
                           object.display();
                       }
                      }
                  }
        else if(a.getSource()==b2)
        {
            // Clear all text fields
            f1.setText(" ");
            f2.setText(" ");
            f3.setText(" ");
            f4.setText("");
            f5.setText("");
            f6.setText("");
            f7.setText("");
            f8.setText("");
            f9.setText("");
            f10.setText("");
            f11.setText("");
            f12.setText("");
            f13.setText("");
            f14.setText("");
            f15.setText("");
            f16.setText("");
        }
          else if(a.getSource()==b5)
       {
            if (f8.getText().isEmpty() || f9.getText().isEmpty()  || f12.getText().isEmpty() || f10.getText().isEmpty() || f13.getText().isEmpty() || f14.getText().isEmpty())
               { 
                   // DIsplay an error message if any of the required text fields is empty
                JOptionPane.showMessageDialog(frame,"Please dont leave any text field","Error",JOptionPane.ERROR_MESSAGE);
               }
             else
               {
                try
                {
                   int Card_id = Integer.parseInt(f8.getText());
                   String client_name = f9.getText();
                   int balance_amount = Integer.parseInt(f10.getText()); 
                   String bank_account = f13.getText();
                   String issuer_bank = f12.getText();
                   int CVC_number = Integer.parseInt(f11.getText()); 
                   double Intrest_Rate = Double.parseDouble(f14.getText()); 
                   
                   String year =(String)c4.getSelectedItem();
                   String day =(String)c5.getSelectedItem();
                   String month =(String)c6.getSelectedItem();
                   String Expiration_date= year+" "+day+ " "+month;
                   
                   boolean anush = true;
                   
                   for(Bank_Card x : list)
                   {
                       if(x instanceof Credit_Card)
                       {
                           Credit_Card object= (Credit_Card) x;
                           if( Card_id== object.getCard_id())
                           {
                                anush= false;
                           }
                       }
                   }
                   if(anush== true)
                    {
                        // Create a new Credit_Card object and add it to the list
                        Credit_Card drake= new Credit_Card(issuer_bank, bank_account, Card_id,balance_amount, CVC_number, Intrest_Rate, Expiration_date, client_name);
                        list.add( drake);
                        JOptionPane.showMessageDialog(frame,"Credit card created","Success",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame,"Card ID exits","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }catch(NumberFormatException n) 
                {
                    // Display an error message if any of the values enetered is wrong
                    JOptionPane.showMessageDialog(frame,"Wrong input","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }  
          else if(a.getSource()==b4)
        {
            // Check if any of the required text fields are empty
            if (f1.getText().isEmpty() || f4.getText().isEmpty()|| f7.getText().isEmpty())
            {
                // DIsplay an error message if any text field is empty
                JOptionPane.showMessageDialog(frame,"Please dont leave any text field","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    // Parse the enetered text in the required fields to integers
                 int Card_id = Integer.parseInt(f1.getText());
                 int PIN_number = Integer.parseInt(f4.getText());
                 int Withdrawal_Amount = Integer.parseInt(f7.getText());
                 
                 // Get the selected values from the Combobox and concatenate them into a data string
                 String year =(String)c1.getSelectedItem();
                 String day =(String)c2.getSelectedItem();
                 String month =(String)c3.getSelectedItem();
                 String date_of_Withdrawal= year+" "+day+" "+month;
                 boolean drake= false;
                 
                 //loop through the list of Bank_Card to find a match for the entered Card_id
                for(Bank_Card x : list)
                    {
                       if(x instanceof Debit_Card)
                        {
                           Debit_Card object= (Debit_Card) x;
                           if (Card_id==object.getCard_id())
                           {
                               // if a matching card is found, set the flag to true
                               drake=true;
                               if(PIN_number==object.getPIN_number())
                                {
                                   if (Withdrawal_Amount<=object.getbalance_amount())
                                   {
                                       // withdraw the entered amount from the Card if the balance is sufficient
                                       object.Withdraw(PIN_number, date_of_Withdrawal, Withdrawal_Amount);
                                       //display a success message
                                       JOptionPane.showMessageDialog(frame,"Withdrawal successful","Success",JOptionPane.INFORMATION_MESSAGE);
                                    }
                                      else{
                                          //display an error message if the balance is insufficient
                                           JOptionPane.showMessageDialog(frame,"Balance is not sufficient","Alert",JOptionPane.ERROR_MESSAGE);
                                          }
                                 }
                             else{
                                 //display an error message if the enetred PIN is incorrect
                                 JOptionPane.showMessageDialog(frame,"PIN number is incorrect","Alert",JOptionPane.ERROR_MESSAGE);
                                 }
                            }
                                   else
                                      {
                                          //set the flag to false if the Card_id doesnt exist
                                       drake = false;
                                      }
                           }
                     }
                if (drake==false)
                    {
                        //display an error message if the Card_id is not found
                     JOptionPane.showMessageDialog(frame,"Card id not found","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }catch(NumberFormatException n) 
                    {
                        //display an error message if parsing of the entered text to integer fails
                     JOptionPane.showMessageDialog(frame,"Wrong input","Error",JOptionPane.ERROR_MESSAGE);
                    }
            }
        }
        //This if-else block is executed when the action source is b7
        else if(a.getSource()==b7)
        {
            // Check if any of the text fields are empty
          if (f8.getText().isEmpty() ||f15.getText().isEmpty() ||f16.getText().isEmpty() ) 
            {
                // Show an error message if any of the text fields are empty
                JOptionPane.showMessageDialog(frame,"Please dont leave any text field","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
               {   
                try
                  {
                      // Parse the integer and double values from the text fields
                    int Card_id = Integer.parseInt(f8.getText());
                    double Credit_limit = Double.parseDouble(f15.getText());
                    int Graceperiod = Integer.parseInt(f16.getText());
                    
                    // Create a flag variable to check if the Credit_Card exists in the list
                    boolean baka= false;
                    
                    // Iterate through the list of Bank_Card objects
                    for(Bank_Card x : list)
                   {
                       // Check if the Bank_Card is an instance of Credit_Card
                       if(x instanceof Credit_Card)
                       {
                           //Cast the Bank_Card object to Credit_Card
                           Credit_Card object= (Credit_Card) x;
                           
                           // Check if the Card_id matches the Credit_Card's id
                           if( Card_id==object.getCard_id())
                           {
                               // Check if the new credit limit is less than or equal to balance amount
                               if(Credit_limit <= 2.5*object.getbalance_amount())
                                {
                                    //Set the Credit_limit and Graceperiod for the Credit_Card
                                 object.setCredit_limit(Credit_limit,  Graceperiod);
                                 //Show a success message if the credit limit is set
                                JOptionPane.showMessageDialog(frame,"Credit limit has been set","Success",JOptionPane.INFORMATION_MESSAGE);
                                }
                                else
                                {
                                   // Show an error message if the credit limit is too high
                                   JOptionPane.showMessageDialog(frame,"The credit limit is high","Error",JOptionPane.ERROR_MESSAGE);
                                }
                           }        
                       }   
                   }
                   }catch(NumberFormatException n) 
                        {
                            //Show an error message if there is an input former error
                        JOptionPane.showMessageDialog(frame,"Wrong input","Error",JOptionPane.ERROR_MESSAGE);
                        }
                }
        }
        // This if-else blobk is executed when the action source is b6
        else if(a.getSource()==b6)
        {
            //CHeck if the text field for the Card_id is empty
            if (f8.getText().isEmpty()) 
               {
                   //Show an error message if the Card_id text field is empty
                JOptionPane.showMessageDialog(frame,"Please dont leave any text field","Error",JOptionPane.ERROR_MESSAGE);
               }
            else
            {
                try
                {
                    //Parse the ineteger value from the Card_id text field
                    int Card_id = Integer.parseInt(f8.getText());
                    
                    //Create a flag variable to check if the credit card exists in the list 
                    boolean apple= false;
                    
                    // Iterate through the list of Bank_Card objects
                    for(Bank_Card x : list)
                   { 
                       // CHeck if the Bank_Card object is an instance of Credit_Card
                       if(x instanceof Credit_Card)
                       {
                           // Cast the Bank_Card object to Credit_Card
                           Credit_Card object= (Credit_Card) x;
                           
                           //Check if the Card_id matches the credit card's id
                           if( Card_id== object.getCard_id())
                           {
                               //Set the flag variable to true to indicate
                                apple= true;
                                object.cancelCredit_Card();
                                JOptionPane.showMessageDialog(frame,"Credit card canclled","Success",JOptionPane.INFORMATION_MESSAGE);
                           }
                           else
                           {
                               apple= false;
                           }
                       }
                   }
                   if ( apple= false)
                   {
                       JOptionPane.showMessageDialog(frame,"Card Id not found","Error",JOptionPane.ERROR_MESSAGE);
                   }
                }catch(NumberFormatException n) 
                {
                    JOptionPane.showMessageDialog(frame,"Wrong input","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }   
}
public static void main(String [] args)
{
     new BankGUI();
}
}

