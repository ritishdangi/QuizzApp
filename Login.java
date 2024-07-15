//package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfname;
    Login(){
        //getContentPane() pick whole file
        getContentPane().setBackground(Color.WHITE);

        //to create custom layout
        setLayout(null);

        //to take image from file directory
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        
        //to place the component upper side of the frame
        JLabel image = new JLabel(i1);

        //to place image custom
        image.setBounds(0,0,600,500);
        add(image);

        //to write anything upper the frame
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font(" Mongolian Baiti",Font.BOLD,40));
        //to change font color
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        //to change font color
        name.setForeground(new Color(30,144,254));
        add(name);

        //to create text box
        tfname = new JTextField();
        tfname.setBounds(750, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,15));
        add(tfname);

        //create button
        rules = new JButton("Rules");
        rules.setBounds(750,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(930,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);




        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);

        }else if(ae.getSource() == back){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}