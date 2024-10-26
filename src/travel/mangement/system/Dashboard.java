
package travel.mangement.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Dashboard extends JFrame implements ActionListener{
    String username;
    JButton addPersonalDetails,deletepersonalDetails,about,payments,calculator, notepad,viewbookedhotels, bookhotels, checkpackages,viewpersonalDetails,updatepersonaldetail,bookpackages,viewpackages,viewhotels,destinations;
    Dashboard(String username){
        super("TOUR AND TRAVEL");
        this.username = username;
       // setBounds(0, 0, 1600, 1200);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0, 0 ,0, 60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatepersonaldetail = new JButton("Update Personal Details");
        updatepersonaldetail.setBounds(0, 50, 300, 50);
        updatepersonaldetail.setBackground(new Color(0, 0, 102));
        updatepersonaldetail.setForeground(Color.WHITE);
        updatepersonaldetail.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatepersonaldetail.setMargin(new Insets(0, 0 ,0, 30));
        updatepersonaldetail.addActionListener(this);
        p2.add(updatepersonaldetail);
        
        
        viewpersonalDetails = new JButton("View Details");
        viewpersonalDetails.setBounds(0, 100, 300, 50);
        viewpersonalDetails.setBackground(new Color(0, 0, 102));
        viewpersonalDetails.setForeground(Color.WHITE);
        viewpersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpersonalDetails.setMargin(new Insets(0, 0 ,0, 130));
        viewpersonalDetails.addActionListener(this);
        p2.add(viewpersonalDetails);
        
        deletepersonalDetails = new JButton("Delete Personal Details");
        deletepersonalDetails.setBounds(0, 150, 300, 50);
        deletepersonalDetails.setBackground(new Color(0, 0, 102));
        deletepersonalDetails.setForeground(Color.WHITE);
        deletepersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletepersonalDetails.setMargin(new Insets(0, 0 ,0, 40));
        deletepersonalDetails.addActionListener(this);
        p2.add(deletepersonalDetails);
        
        checkpackages = new JButton("Check Packages");
        checkpackages.setBounds(0, 200, 300, 50);
        checkpackages.setBackground(new Color(0, 0, 102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setMargin(new Insets(0, 0 ,0, 110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        
        bookpackages = new JButton("Book Packages");
        bookpackages.setBounds(0, 250, 300, 50);
        bookpackages.setBackground(new Color(0, 0, 102));
        bookpackages.setForeground(Color.WHITE);
        bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackages.setMargin(new Insets(0, 0 ,0, 120));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);
        
        
        viewpackages = new JButton("View Packages");
        viewpackages.setBounds(0, 300, 300, 50);
        viewpackages.setBackground(new Color(0, 0, 102));
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackages.setMargin(new Insets(0, 0 ,0, 120));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 350, 300, 50);
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0, 0 ,0, 140));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        
        bookhotels = new JButton("Book Hotels");
        bookhotels.setBounds(0, 400, 300, 50);
        bookhotels.setBackground(new Color(0, 0, 102));
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotels.setMargin(new Insets(0, 0 ,0, 140));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);
        
        
        
        viewbookedhotels = new JButton("View Booked Hotels");
        viewbookedhotels.setBounds(0, 450, 300, 50);
        viewbookedhotels.setBackground(new Color(0, 0, 102));
        viewbookedhotels.setForeground(Color.WHITE);
        viewbookedhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewbookedhotels.setMargin(new Insets(0, 0 ,0, 70));
        viewbookedhotels.addActionListener(this);
        p2.add(viewbookedhotels);
        
        
        destinations = new JButton("Destinations");
        destinations.setBounds(0, 500, 300, 50);
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0, 0 ,0, 135));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        payments = new JButton("Payment");
        payments.setBounds(0, 550, 300, 50);
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0, 0 ,0, 165));
        payments.addActionListener(this);
        p2.add(payments);
        
        
        calculator = new JButton("Calculator");
        calculator.setBounds(0, 600, 300, 50);
        calculator.setBackground(new Color(0, 0, 102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculator.setMargin(new Insets(0, 0 ,0, 160));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        
        notepad = new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0 ,0, 170));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        
        about = new JButton("About");
        about.setBounds(0, 700, 300, 50);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0 ,0, 190));
        about.addActionListener(this);
        p2.add(about);
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);
        
        JLabel text = new JLabel("Travel And Tourism Mangement System");
        text.setBounds(400, 70, 1000, 70);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway", Font.PLAIN,55));
        image.add(text);
        
        
        
        
        
        
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource() == viewpersonalDetails ){
            new ViewCustomer(username);
            
        }else if(ae.getSource()==deletepersonalDetails){
            new DeleteDetails(username);
        }
        else if(ae.getSource() == updatepersonaldetail){
            new UpdateCustomer(username);
        }
        else if(ae.getSource() == checkpackages){
            new CheckPackage();
        }else if(ae.getSource() == bookpackages){
            new BookPackage(username);
        }else if(ae.getSource() == viewpackages){
            new ViewPackage(username);
        }else if(ae.getSource() == viewhotels){
            new CheckHotels();
        }else if(ae.getSource() == destinations){
            new Destinations();
        }else if(ae.getSource() == bookhotels){
            new BookHotel(username);
        }else if(ae.getSource() == viewbookedhotels){
            new ViewBookedHotel(username);
        }else if(ae.getSource() == payments){
            new Payment();
        }else if(ae.getSource() == calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == about){
            new About();
            
        }
    }
    
    public static void main(String[] args){
        new Dashboard("");
        
    }
    
}
