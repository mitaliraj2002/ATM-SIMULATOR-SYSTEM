package bank.management.system;

import java.awt.color.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
        
        
public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField aadhar,pan;
    JButton next;
    JRadioButton yesSeniorCetizen,noSeniorCetizen,yesExistingAccount,noExistingAccount;   
    JComboBox religion,category,occupation,education,income;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION -PAGE 2");
        
     
        
        JLabel additionalDetails = new JLabel("page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE );
        add(religion);
        
        
        
        
        JLabel cname = new JLabel("Category:");
        cname.setFont(new Font("Raleway",Font.BOLD, 20));
        cname.setBounds(100,190,200,30);
        add(cname);
        
        String valCategory[] ={"General","OBC","SC","ST","OTHER"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        //personal income
        
        JLabel pincome = new JLabel("Income:");
        pincome.setFont(new Font("Raleway",Font.BOLD, 20));
        pincome.setBounds(100,240,200,30);
        add(pincome);
        
        String incomeCategory[] ={"Null","<2,50,000","< 5,00,000","<8,00,000",">8,00,000"};
         income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        

        
        //person Education
        
        JLabel peducation = new JLabel("Educational:");
        peducation.setFont(new Font("Raleway",Font.BOLD, 20));
        peducation.setBounds(100,290,200,30);
        add(peducation);
        

        JLabel qualification = new JLabel("Qualifications:");
        qualification.setFont(new Font("Raleway",Font.BOLD, 20));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        
        String educationValues[] ={"Non-Graduate","Graduate","Post Graduate","Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
   
        // person Occupation
        
        JLabel pOccupation = new JLabel("Occupation:");
        pOccupation.setFont(new Font("Raleway",Font.BOLD, 20));
        pOccupation.setBounds(100,390,200,30);
        add(pOccupation);
        
        
         String occupationValues[] ={"Government","Self-Employed","Business Man","House-Wife","Student","Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);        
        
        
        // PAN Number
        
         JLabel pNumber = new JLabel("PAN Number:");
        pNumber.setFont(new Font("Raleway",Font.BOLD, 20));
        pNumber.setBounds(100,440,200,30);
        add(pNumber);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        // Aadhar Number
        
         JLabel aadharNumber = new JLabel("Aadhar Number:");
        aadharNumber .setFont(new Font("Raleway",Font.BOLD, 20));
        aadharNumber.setBounds(100,490,200,30);
        add(aadharNumber );
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        // Senior Cetizen
        
        JLabel sCetizen = new JLabel("Senior Cetizen:");
        sCetizen.setFont(new Font("Raleway",Font.BOLD, 20));
        sCetizen.setBounds(100,540,200,30);
        add(sCetizen);
        
        
        yesSeniorCetizen = new JRadioButton("Yes");
        yesSeniorCetizen.setBounds(300,540,100,30);
        yesSeniorCetizen.setBackground(Color.WHITE);
        add(yesSeniorCetizen);
        
        noSeniorCetizen = new JRadioButton("No");
        noSeniorCetizen.setBounds(450,540,100,30);
        noSeniorCetizen.setBackground(Color.WHITE);
        add(noSeniorCetizen);
        
        
        
        ButtonGroup seniorCetizen = new ButtonGroup();
        seniorCetizen.add(yesSeniorCetizen);
        seniorCetizen.add(noSeniorCetizen);
        

        // Existing Account
        
        JLabel eAccount = new JLabel("Existing Account:");
        eAccount .setFont(new Font("Raleway",Font.BOLD, 20));
        eAccount .setBounds(100,590,200,30);
        add(eAccount);
        
        yesExistingAccount = new JRadioButton("Yes");
        yesExistingAccount.setBounds(300,590,100,30);
        yesExistingAccount.setBackground(Color.WHITE);
        add(yesExistingAccount);
        
        noExistingAccount = new JRadioButton("No");
        noExistingAccount.setBounds(450,590,100,30);
        noExistingAccount.setBackground(Color.WHITE);
        add(noExistingAccount);
                
        
        ButtonGroup existingAccount = new ButtonGroup();
        existingAccount.add(yesExistingAccount);
        existingAccount.add(noExistingAccount);
        
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
    getContentPane().setBackground(Color.WHITE);
    setSize(850,800);
    setLocation(350 , 10);
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       
       String sreligion = (String)religion.getSelectedItem();  // Typecast to string 
       String scategory = (String) category.getSelectedItem();
       String sincome =  (String) income.getSelectedItem();
       String seducation = (String) education.getSelectedItem();
       String soccupation = (String) occupation.getSelectedItem();
       
       String seniorcitizen = null;
       if(yesSeniorCetizen.isSelected()) {
           seniorcitizen ="Yes" ;
       }else if(noSeniorCetizen.isSelected()){
            seniorcitizen= "No";
       }
       
       
        String existingaccount = null;
       if(yesExistingAccount.isSelected()) {
           existingaccount ="Yes" ;
       }else if(noExistingAccount.isSelected()){
            existingaccount= "NO";
       }
       
       String span = pan.getText();
       String saadhar = aadhar.getText();
      
       
       
       try{ 
           
                Conn c = new Conn();
                String query = "insert into signupTwo values('"+formno+"', '"+sreligion+"','"+scategory+"' , '"+sincome+"' , '"+seducation+"' , '"+soccupation+"' ,'"+span+"' , '"+saadhar+"' , '"+existingaccount+"' , '"+seniorcitizen+"')";
                c.s.executeUpdate(query);
          
                // Signup3 Object
                
       }catch (Exception e){
              System.out.println(e);
          }
    }
    
public static void main(String args[]){
       new SignupTwo("");


}
}
