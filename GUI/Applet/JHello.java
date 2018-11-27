import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHello extends JApplet implements ActionListener
{
    JLabel greet = new JLabel("Hi!, What's your name?");
    JTextField ans = new JTextField(10);
    JButton b = new JButton("Press me!");
    JLabel pg = new JLabel("");
    Container c = new Container();

    public void init(){
        greet.setFont(new Font("Serif", Font.BOLD, 48));
        pg.setFont(new Font("Serif", Font.BOLD, 48));
        c.add(greet); c.add(ans);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        pg.setText(ans.getText());
        c.add(pg);
        validate();
    }
}