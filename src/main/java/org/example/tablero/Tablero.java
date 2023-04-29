package org.example.tablero;

import javax.swing.*;
import java.awt.*;

public class Tablero extends JFrame {
    //Codigo tablero
    public Tablero()
    {
        setTitle("Tablero de Ajedrez");
        setSize(500,500);
        setResizable(false);
        setLocationRelativeTo(null);
        JPanel p = new JPanel(new GridLayout(8, 8));
        JButton[] botones = new JButton[64];
        for (int i = 0; i < 64; i++)
        {
            botones[i] = new JButton();
            if((i / 8) % 2 == 0)
            {
                botones[i].setBackground((i % 2 == 0 ? Color.white : Color.black));
            }
            else
            {
                botones[i].setBackground((i % 2 == 0 ? Color.black : Color.white));
            }
            p.add(botones[i]);
        }
        add(p);
        setVisible(true);
    }
}



