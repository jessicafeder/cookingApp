package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cookingAppGui extends JFrame {
    private JPanel mainPanel;
    private JTextField inputProtein;
    private JTextField inputCarb;
    private JButton generateRecipe;
    private JButton inputProteinBtn;
    private JButton inputCarbBtn;

    public cookingAppGui(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        generateRecipe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String input2 = (inputCarb.getText());

                //Take input twice
                //Generate recipe from list
            }
        });
        inputProteinBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = (inputProtein.getText());
                
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new cookingAppGui("My Cooking App");
        frame.setVisible(true);
    }
}
