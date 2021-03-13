package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {
    JPanel panel_XO;
    JPanel panel_top;
    JLabel label;
    JButton button1,button2, button3, button4,
            button5, button6, button7,button8, button9;
    Font font = new Font("Kristen ITC",Font.HANGING_BASELINE,50);
    Boolean turnO = true;

    GameFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        panel_top = new JPanel();
        panel_top.setPreferredSize(new Dimension(500,150));
        panel_top.setBackground(new Color(105, 149, 233,50));
        panel_top.setBorder(BorderFactory.createLineBorder(new Color(105, 149, 233),15));

        panel_XO = new JPanel();
        panel_XO.setLayout(new GridLayout(3,3));
        panel_XO.setPreferredSize(new Dimension(500,400));
        panel_XO.setBackground(Color.red);

        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);
        button5.setFocusable(false);
        button6.setFocusable(false);
        button7.setFocusable(false);
        button8.setFocusable(false);
        button9.setFocusable(false);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);
        button4.setFont(font);
        button5.setFont(font);
        button6.setFont(font);
        button7.setFont(font);
        button8.setFont(font);
        button9.setFont(font);

        panel_XO.add(button1);
        panel_XO.add(button2);
        panel_XO.add(button3);
        panel_XO.add(button4);
        panel_XO.add(button5);
        panel_XO.add(button6);
        panel_XO.add(button7);
        panel_XO.add(button8);
        panel_XO.add(button9);

        label = new JLabel();
        label.setPreferredSize(new Dimension(230,100));
        label.setFont(font);
        label.setText("Turn: O");
        panel_top.add(label);

        this.add(panel_XO,BorderLayout.SOUTH);
        this.add(panel_top,BorderLayout.NORTH);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (turnO){
            if(e.getSource()==button1){
                button1.setText("O");
                turnO = false;
            }
            if(e.getSource()==button2){
                button1.setText("O");
                turnO = false;
            }
            if(e.getSource()==button3){
                button1.setText("O");
                turnO = false;
            }
            if(e.getSource()==button4){
                button1.setText("O");
                turnO = false;
            }
            if(e.getSource()==button5){
                button1.setText("O");
                turnO = false;
            }
            if(e.getSource()==button6){
                button1.setText("O");
                turnO = false;
            }
            if(e.getSource()==button1){
                button1.setText("O");
                turnO = false;
            }
            if(e.getSource()==button1){
                button1.setText("O");
                turnO = false;
            }
        }


    }
}

