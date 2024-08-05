/*
 Write a Java program (Windows) that will accept 5 names from user and print  all names.
 To enter name 10 seconds will be allowed . after completing 10 seconds next name should be accepted. 
 If user doesn't enter any thing in 10 seconds that name should be empty string.  
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NameInput extends JFrame {

    private String names[];
    JTextField t1;
    JLabel l1, timer;
    int currentNameNo;

    public NameInput() {
        setTitle("Input Names");
        setSize(400, 200);//
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel inputPanel = new JPanel( new GridLayout(2,1));
        currentNameNo=1;
        l1=new JLabel("Enter Name "+currentNameNo+":");
        inputPanel.add(l1);
        
        t1 = new JTextField();
        inputPanel.add(t1);
        names=new String[5];
        add(inputPanel,BorderLayout.CENTER);
        t1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
               //JOptionPane.showMessageDialog(NameInput.this, e.getKeyChar()+"");
                if(e.getKeyChar()=='\n')
                {
                    names[currentNameNo++]=t1.getText();
                    l1.setText("Enter Name "+currentNameNo+":");
                    t1.setText("");
               }
            }
            @Override
            public void keyPressed(KeyEvent e) {   
            }
            @Override
            public void keyReleased(KeyEvent e) {   
            } 
        });   
    }
    }        
