package org.example;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){

        this.setTitle("Title goes here"); // sets a title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // shuts down application when closing window with X
        // by default it's HIDE_ON_CLOSE
        // DO_NOTHING_ON_CLOSE will be annoying :)
        this.setResizable(false); // prevents resizing of the window
        this.setSize(640,480); // sets window dimensions
        this.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("icon.png"); // create ImageIcon
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(100,50,150)); // sets background color

    }
}
