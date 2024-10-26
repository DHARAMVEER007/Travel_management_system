package travel.mangement.system; 

import javax.swing.*;
import java.awt.*;
import java .awt.event.*;

public class About extends JFrame implements ActionListener{
    
    About(){
        super("TOUR AND TRAVEL");
        setBounds(600, 200, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(200, 10, 100, 40);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Tahoma", Font.BOLD,20));
        add(l1);
        
        String s = "About Projects                \n"+
            "\n"+
            "The Objective of the Travel and Tourism Mangement System Project is to develop a system that automates the processes and activities of a travel and the purpose is to design a system using we can perform all operations related to travelling \n"+
            "\n"+
            "This application with the help of accessing the information related to the travel to the particular destination with great ease.The user can track the information related to their tours with great ease thourgh this application. The travel agency information can also be obtained through this application \n"+
            "\n"+
            "Advantages of this project \n"+
            "Gives accurate information\n"+
            "Simplifies the manual work\n"+
            "It minimize the documentation related work\n"+
            "Provides up to date information\n"+
            "Friendly environment by providing warning messages\n "+
            "Booking confirmation notification";    
        
        TextArea area = new TextArea(s,10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);
        
        JButton back = new JButton("Back");
        back.setBounds(200, 420, 100, 25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String[] args){
        new About();
    }
    
}
