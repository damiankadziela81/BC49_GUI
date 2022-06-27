package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        JFrame frame = new JFrame(); // create a frame
//        frame.setTitle("Title goes here"); // sets a title
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // shuts down application when closing window with X
//                                                              // by default it's HIDE_ON_CLOSE
//                                                              // DO_NOTHING_ON_CLOSE will be annoying :)
//        frame.setResizable(false); // prevents resizing of the window
//        frame.setSize(640,480); // sets window dimensions
//        frame.setVisible(true); // make frame visible
//
//        ImageIcon image = new ImageIcon("icon.png"); // create ImageIcon
//        frame.setIconImage(image.getImage()); // change icon of frame
//        frame.getContentPane().setBackground(new Color(100,50,150)); // sets background color

        MyFrame myFrame = new MyFrame();
        // we can create the frame with "new MyFrame();" alone, but we wont be able to make changes within its class

    }
}