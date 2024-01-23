package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oberflaeche extends JFrame implements ActionListener {

    Oberflaeche(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
