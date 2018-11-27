import javax.swing.*;

class Client
{
    int clNo, aId;
    double balance;
    String name;
    Essentials e = new Essentials();

    void set()
    {
        clNo = Integer.parseInt(e.guiInp("Enter client number"));
        name = e.guiInp("Enter full name");
        aId = Integer.parseInt(e.guiInp("Enter ID"));
        balance = Double.parseDouble(e.guiInp("Enter balance owed to firm"));
    }

    void get()
    {
        e.guiMsg("Client number : " + clNo +
              "\nName                 : " + name + 
              "\nAttorney ID       : " + aId + 
              "\nBalance owed : $" + balance);
    }
}

class Attorney
{
    int id;
    double salary;
    String name;
    Essentials e = new Essentials();

    void setAtt(){
        id = Integer.parseInt(e.guiInp("Enter ID"));
        name = e.guiInp("Enter name");
        salary = Double.parseDouble(e.guiInp("Enter salary"));
    }
    void getAtt(){
        e.guiMsg("Attorney ID : " + id +
              "\nName           : " + name + 
              "\nSalary          : $" + salary);
    }
}

class LawFirm
{
    public static void main(String[] arg){
        Client c = new Client();
        Attorney a = new Attorney();
        c.set(); c.get();
        a.setAtt(); a.getAtt();
    }
}

class Essentials
{
    void guiMsg(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    String guiInp(String message){
        return JOptionPane.showInputDialog(null, message);
    }
}