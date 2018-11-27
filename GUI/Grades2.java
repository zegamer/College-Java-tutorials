import javax.swing.*;

public class Grades2
{
	public static void main (String[] args)
	{
		StudentStatus();
	}
	static void StudentStatus()
	{
		JOptionPane.showMessageDialog(null, " Welcome to Student Status System.");
		double marks = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the marks: "));
			
		String status = "Student ";
		if (marks > 100 && marks < 0)	
			status = "Invalid entry";
		else if(marks == 100)
			status += "has a perfect score.";
		else if(marks >= 90)
			status += "is excellent.";
		else if(marks >= 80)
			status += "is good.";
		else if(marks >= 70)
			status += "is above average.";
		else if(marks >= 60)
			status += "is average.";
		else if(marks >= 50)
			status += "is below average.";
		else if(marks < 50)
			status += "is failing.";
		
		int choice = Integer.parseInt(JOptionPane.showInputDialog(null,status + "\n\n 1. Continue\n 2.Exit"));
		
		if(choice == 1)
			StudentStatus();
		else
		{
			JOptionPane.showMessageDialog(null,"Thanks for using.");	
			System.exit(0);
		}
	}
}