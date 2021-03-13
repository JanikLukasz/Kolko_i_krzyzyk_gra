package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {
    JPanel panel_XO;
    JPanel panel_top;
    JLabel label;
    JButton[] button = new JButton[9];
    JButton resetButton;
    Font font = new Font("Kristen ITC",Font.HANGING_BASELINE,50);
    Boolean turnO = true;
    int count = 0;

    GameFrame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);

            // top panel
            panel_top = new JPanel();
            panel_top.setPreferredSize(new Dimension(500, 150));
            panel_top.setBackground(new Color(110, 194, 212));
            panel_top.setBorder(BorderFactory.createLineBorder(new Color(105, 149, 233), 15));

            label = new JLabel();
            label.setPreferredSize(new Dimension(350, 100));
            label.setFont(font);
            label.setText("Turn: O");
            panel_top.add(label);

            // panel with buttons
            panel_XO = new JPanel();
            panel_XO.setLayout(new GridLayout(3, 3, 10, 10));
            panel_XO.setPreferredSize(new Dimension(500, 400));
            panel_XO.setBackground(new Color(105, 149, 233, 50));

            for (int i = 0; i <= 8; i++) {
                button[i] = new JButton();
                button[i].setFocusable(false);
                button[i].addActionListener(this);
                button[i].setFont(font);
                button[i].setBackground(new Color(105, 149, 233));
                panel_XO.add(button[i]);
            }

            // reset button
            resetButton = new JButton("Reset");
            resetButton.setFont(new Font("Kristen ITC", Font.HANGING_BASELINE, 30));
            resetButton.setFocusable(false);
            resetButton.setPreferredSize(new Dimension(500, 50));
            resetButton.addActionListener(this);

            // frame
            this.add(resetButton, BorderLayout.SOUTH);
            this.add(panel_XO, BorderLayout.CENTER);
            this.add(panel_top, BorderLayout.NORTH);
            this.pack();
            this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i=0;i<=8;i++) {

            // Rows - check winner
            if (button[0].getText() == "X" && button[1].getText() == "X" && button[2].getText() == "X"){

                button[0].setBackground(Color.GREEN);
                button[1].setBackground(Color.GREEN);
                button[2].setBackground(Color.GREEN);

                label.setText(button[0].getText() + " wins :D !!");
                label.setForeground(Color.red);
                break;
            }
            // Switch turn player
            if (turnO) {
                if (e.getSource() == button[i]) {
                    button[i].setText("O");
                    label.setText("Turn: X");
                    turnO = false;
                    count++;
                }
            }
            if (!turnO) {
                if (e.getSource() == button[i]) {
                    if (button[i].getText().length() > 0) {
                        break;
                    }
                    button[i].setText("X");
                    label.setText("Turn: O");
                    turnO = true;
                    count++;
                }
            }
        }
        // End game
        if (count == 9){
            label.setText("Nobody wins");
            label.setForeground(Color.red);
        }
        if (e.getSource()==resetButton){
            for (int i=0;i<=8;i++) {
                button[i].setText("");
                button[i].setBackground(new Color(105, 149, 233));
            }
            label.setText("Turn: O");
            label.setForeground(Color.black);
            turnO = true;
            count=0;
        }
    }
}


