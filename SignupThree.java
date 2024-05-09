
package bank.management.system;
import javax.swing.*;
import java.awt.*;  //(FONT Class is in inside AWT Package so import it).
public class SignupThree extends JFrame{
    
    JRadioButton r1,r2,r3,r4;
    
    //Create A Constructor-we make constructor using same name of the class
    SignupThree(){
        
        setLayout(null);// to make SETBOUND working we havae to do setLayout - null.
        
        JLabel l1 = new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40); // TO set Frame we use setBound().
        add(l1);
        
         JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,400,30); // TO set Frame we use setBound().
        add(type);
        
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,150,20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        //TO make FRAME we use setSize() function.
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    
    };
    public static void main(String[]args){
        new SignupThree();  //we make object of the above class
    
    }
}
