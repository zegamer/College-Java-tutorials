import javax.swing.*;
class Parking
{
void calculate()
	{
	double fee,hours;
	int wheeler=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the type of vehicle"));
	hours=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the hours the vehicle is parked"));
	String Vn=JOptionPane.showInputDialog(null,"enter the vehicle number");

	try
		{
		if(wheeler==2)
			{
			if(hours<=4)
				{
				JOptionPane.showMessageDialog(null,"The amount to be paid by"+Vn+"is Rs.10");
				}
			else if(hours>4 && hours<25)
				{
				JOptionPane.showMessageDialog(null,"The Amount to be paid by"+Vn+"is Rs.60");
				}
			else
				{
				hours=hours-24;
				fee=60+(5*hours);
				JOptionPane.showMessageDialog(null,"The mount to be paid by"+Vn+"is Rs. "+fee);
				}

			int flag=JOptionPane.showConfirmDialog(null,"Do you want to continue","confirm to exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if(flag==JOptionPane.YES_OPTION)
				{
				calculate();
				}
			else
				{
				System.exit(0);
				}
			}
		else
			{
			}
		}
	catch (Exception e)
	{ }
	}
}

class BillProcessing
{
public static void main(String []args)
	{
	Parking p=new Parking();
	p.calculate();
	}
}