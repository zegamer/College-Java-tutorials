import javax.swing.JOptionPane;
import java.text.*;
import java.util.*;

public class Swimming
{
  public static void main(String[] a)
  {
    JOptionPane.showMessageDialog(null,"Welcome to Pool Associates\n");
    run();
  }
  
  public static void run(){
    String ans = JOptionPane.showInputDialog(null,"Enter length, breadth and depth of pool as:\n\'l, b, h\'");
    if(ans == null) exit(1);
        
    try{
	PoolAssociates p = new PoolAssociates(ans);
	SimpleDateFormat dateFormatter = new SimpleDateFormat("E, d/m/yy");
	String invoice  = dateFormatter.format(new Date()) + "\n\n Number of hours : " + p.getHours() + "\n Cost : " + p.getCharge();
        int toContinue = JOptionPane.showConfirmDialog(null, invoice + "\n\nContinue (yes/no)?",
						  "Summary",
						  JOptionPane.YES_NO_OPTION);
	
	if(toContinue == JOptionPane.YES_OPTION)  run();
	else System.exit(0);
   } catch(Exception e)
   {
	JOptionPane.showMessageDialog(null, "Incorrect values entered");
	run();
   }    
  }

  private static void exit(int status){
  	JOptionPane.showMessageDialog(null, "Thanks for using!");
	System.exit(status);
  }
}

class Pool
{
  private double[] dim;
  Pool(String[] dms){
    dim = new double[3];
    for(int i = 0; i < 3; i++)
	dim[i] = Double.parseDouble(dms[i]);
    if (getVolume() < 1000 || getVolume() > 50000)
    {
	JOptionPane.showMessageDialog(null, "These dimensions are not supported");
	Swimming.run();
    }
  }
  
  public double getVolume() { return dim[0] * dim[1] * dim[2]; }
}

class PoolAssociates extends Pool
{
    private final double GallonsPerCubicFeet = 7.5;
    private final int RateOfFlow = 50;
    private final int CleaningFee = 75;
    private final int HourlyFillCharges = 8;
    
    PoolAssociates(String ans) {super(ans.split(", "));}
    
    public double getCharge()
    {
      return Math.round((CleaningFee + HourlyFillCharges * getHours()) * 100)/ 100.0;
    }

    public double getHours()
    {
	return Math.round(getVolume() * GallonsPerCubicFeet *100/(RateOfFlow * 60))/ 100.0 ;
    }
}