// use Finder.java to get the list of all the valid ticket numbers

import javax.swing.JOptionPane;
 
class TicketValidate
{
	public static void main (String[] args)
	{
		JOptionPane.showMessageDialog(null,"Welcome user!");
		input();
		System.exit(0);
	}
 
	private static void input()
	{
		String ticket = JOptionPane.showInputDialog(null,"Enter the ticket number (0 to exit):\n\n Input format should be like XXXXXX (all integers)");
		if (ticket.equals("0"))
			JOptionPane.showMessageDialog(null,"Goodbye user!");
		else
			validate(ticket);
	}
 
	private static void validate(String tkt)
	{
		int ticket = Integer.parseInt(tkt);
		if(tkt.length() != 6)
			JOptionPane.showMessageDialog(null,"Length of ticket number should be 6 characters only.");
		else
		{
			boolean isValid = (ticket%10 == (ticket/=10)%7);
			if(isValid)
				JOptionPane.showMessageDialog(null,"Ticket is valid");
			else
			{
				JOptionPane.showMessageDialog(null,"Ticket is invalid");
			}
		}
		input();
	}
}