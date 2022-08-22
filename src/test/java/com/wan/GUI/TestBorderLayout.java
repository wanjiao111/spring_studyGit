package com.wan.GUI;

import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestBorderLayout {
    public static void main(String[] args) {
        Button button1 = new Button("east");
        Button button2 = new Button("west");
        Button button3 = new Button("south");
        Frame frame = new Frame();
        frame.setBounds(50, 50, 200, 200);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.add(button1, BorderLayout.EAST);
        frame.add(button2, BorderLayout.WEST);
        frame.add(button3, BorderLayout.SOUTH);
    }
}
