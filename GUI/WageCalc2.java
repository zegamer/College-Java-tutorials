public class WageCalc2
{
	public static void main(String[] args)
	{
		double wage;
		int hrs = Integer.parseInt(JOptionPane.showInputPane(null,"Enter #hrs worked."));
		
		if(hrs <= 40)
			wage = 8.25*hrs;
		else
			wage = 8.25*(40*(1.5*(hrs-40)));
		
		JOptionPane.showMessageDialog(null,"Wages for " + hrs + " hrs worked is " + wage);
		System.exit(0);
	}
}