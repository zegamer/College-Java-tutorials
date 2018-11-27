import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;

class BankApplication
{
	public static void main (String[] args)
	{
        JOptionPane.showMessageDialog(null, "Welcome to the system!");
		Account ac1 = new Account(2001.0);
		Account ac2 = new Account(10000.0);
		while(true)
		{
		    String options = "1. Deposit\n2. Withdraw\n3. Balance\n4. Money Transfer\n5. Exit";
		    int opt = Integer.parseInt(JOptionPane.showInputDialog(null, options));
		    double tempAmount = 0;
		    switch(opt)
		    {
		        case 1 : tempAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter amount")); 
		                 ac1.deposit(tempAmount);
		                 break;
		        case 2 : tempAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter amount")); 
		                 ac1.withdraw(tempAmount);
		                 break;
		        case 3 : JOptionPane.showMessageDialog(null,ac1.balanceCheck());
		                 break;
                case 4 : tempAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter amount")); 
                         ac1.moneyTransfer(ac2,tempAmount);
                         break;
                case 5 : JOptionPane.showMessageDialog(null, "Thank You!");
                         System.exit(0);
                default : JOptionPane.showMessageDialog(null, "Error : Choose again");
            }
		}
	}
}

class Account
{
    private long acNum;
    private double balance;
    private final double minBalance = 2000.0;
    SimpleDateFormat date = new SimpleDateFormat("E, d/m/yy hh:mm");

    Account(double initVal)
    {
        acNum = Long.parseLong(JOptionPane.showInputDialog(null, "Enter account number"));
        balance = initVal;
        System.out.println(date.format(new Date()) + " : Account created with number, " + acNum);
    }
    public void withdraw(double amount)
    {
        if (balance - amount < 0)
        {
            JOptionPane.showMessageDialog(null, balanceCheck() + "\nInsufficient funds to withdraw", "Insufficient Funds", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            balance -= amount; 
            if (balance < minBalance)
                JOptionPane.showMessageDialog(null, balanceCheck() + "\nBalance is less than minimum balance", "Low Balance", JOptionPane.WARNING_MESSAGE);
            System.out.println(date.format(new Date()) + " : Withdrawn in " + this.acNum + " - Rs." + amount);
        }
        
    }
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println(date.format(new Date()) + " : Deposit in " + this.acNum + " - Rs." + amount);
    }
    public String balanceCheck()
    {
        return "Balance for " + this.acNum + " is : Rs." + balance;
    }
    public void moneyTransfer(Account acc2, double amount){
        this.withdraw(amount);
        acc2.deposit(amount);
        JOptionPane.showMessageDialog(null, acc2.balanceCheck());
    }
}