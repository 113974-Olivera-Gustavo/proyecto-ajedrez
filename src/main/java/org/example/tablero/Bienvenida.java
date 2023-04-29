package org.example.tablero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bienvenida extends JFrame
{
    public Bienvenida()
    {
        JFrame b = new JFrame("Bienvenida");
        b.setSize(900, 575);

        setResizable(false);
        setLocationRelativeTo(null);

        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Darwoft\\Desktop\\Info Curso C#\\proyecto-ajedrez/Foto_Ajedrez.jpg");
        JLabel fondo = new JLabel(imageIcon);
        fondo.setBounds(0, 0, 400, 300);
        fondo.setOpaque(true);
        fondo.setBackground(Color.WHITE);

        JPanel panel = new JPanel();
        JButton bJugar = new JButton("Jugar");
        JButton bSalir = new JButton("Salir");

        panel.add(fondo);
        panel.add(bJugar);
        panel.add(bSalir);

        b.add(panel);
        b.setVisible(true);

        bJugar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Tablero T = new Tablero();
                T.setVisible(true);
                dispose();
            }
        });

        bSalir.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });
    }
}