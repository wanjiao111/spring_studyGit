package wan.GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class lesson {
    public static void main(String[] args) {
        MyFrame myFrame1 = new MyFrame(200, 200, 300, 300, Color.blue);
        MyFrame myFrame2 = new MyFrame(500, 200, 300, 300, Color.black);
        MyFrame myFrame3 = new MyFrame(200, 500, 300, 300, Color.green);
        MyFrame myFrame4 = new MyFrame(500, 500, 300, 300, Color.red);
        Panel panel = new Panel();
        myFrame1.add(panel);
        panel.setBackground(Color.green);
        panel.setBounds(50,50,200,200);
        panel.setVisible(true);
        myFrame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }
    static int id=0;
    static class MyFrame extends Frame{
        public MyFrame(int x,int y,int w,int h,Color color){
            super ("myFrame:"+(id++));
            setBackground(color);
            setBounds(x,y,w,h);
            setVisible(true);
        }
    }

}
