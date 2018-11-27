import javax.swing.*;

public class OddityGUI
{
	public static void main (String[] args)
	{
		String ans = "";
		for(int i = 1; i < 20; i+=2)
			ans += i + "\n";
		JOptionPane.showMessageDialog(null,ans);
		System.exit(0);
	}
}