package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class OwnMadeInterface extends JFrame {
    Graphics g;
    OwnMadeInterface(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        JButton button = new JButton("Press");
        JPanel panel = new JPanel();
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();


        this.getContentPane().add(panel); // Adds Button to content pane of frame
        this.setVisible(true);
    }
    public void drawPort(Port begin, Port end, int height){
        g.drawLine(begin.x,begin.y,begin.x,height);
        g.drawLine(begin.x,height,end.x,height);
        g.drawLine(begin.y,height,end.x,begin.y);
        drawArrow(end);
    }
    public void drawArrow(Port end){}
    @Override
    public void paint(Graphics g) {
        this.g =  g;
    }

}
