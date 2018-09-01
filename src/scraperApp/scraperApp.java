/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scraperApp;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*;

/**
 *
 * @author bob
 */
public class scraperApp {
    
    JFrame myFrame = new JFrame();
    
    JButton okButton = new JButton();
    JButton button2 = new JButton("Cancel");
    JButton button3 = new JButton("Button 3");
    
    //Panels
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    
    public scraperApp(){};
    
    public void createGUI(){
    
    //Buttons
    okButton.setText("Okay");
    okButton.setToolTipText("This is the OkayButton!");
    button2.setToolTipText("This is button2");
    button3.setToolTipText("This is Button 3");
    button3.setForeground(Color.red);
    
    //Adding actionListeners
    GUIListener myListener = new GUIListener();
    okButton.addActionListener(myListener);
    button2.addActionListener(myListener);
    button3.addActionListener(myListener);
    
    //panels
    panel1.add(okButton);
    panel1.add(button2);
    panel1.setSize(100,50);
    panel2.setBorder(new TitledBorder("Panel 2 Border"));
    panel2.add(button3);
    
    //frames
    myFrame.add(panel1);
    myFrame.add(panel2);
    myFrame.setSize(600, 400);
    myFrame.setLocationRelativeTo(null);
    myFrame.setLayout(new GridLayout(2,5));
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.setVisible(true);
}
    
    public class GUIListener implements ActionListener{
        @Override
        
        public void actionPerformed(ActionEvent e) {
            
            if (e.getSource() == okButton){
                System.out.println("okButton was pushed!");
                
            }
            else if (e.getSource() == button2){
                System.out.println("button2 was pushed!");
            }
            else if (e.getSource() == button3){
                System.out.println("button3 was pusshed");
                
            }
        }
    }
}
