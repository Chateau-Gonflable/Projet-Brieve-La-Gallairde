package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class OwnMadeInterface extends JFrame {
    Graphics g;
    OwnMadeInterface(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(2500,2500);
        JButton button = new JButton("Press");
        JPanel panel = new JPanel();
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        NodeGUI ng1 = new NodeGUI(n1,1);
        NodeGUI ng2 = new NodeGUI(n1,2);
        NodeGUI ng3 = new NodeGUI(n1,3);
        NodeGUI ng4 = new NodeGUI(n1,4);
        NodeGUI ng5 = new NodeGUI(n1,5);
        panel.add(ng1);
        panel.add(ng2);
        panel.add(ng3);
        panel.add(ng4);
        panel.add(ng5);


        this.getContentPane().add(panel);
        this.setVisible(true);
    }
    public void drawPort(Port begin, Port end, int height){
        g.drawLine(begin.x,begin.y,begin.x,height);
        g.drawLine(begin.x,height,end.x,height);
        g.drawLine(begin.y,height,end.x,begin.y);
        drawArrow(end);
    }
    //TO DO
    public void drawArrow(Port end){

    }
    @Override
    public void paint(Graphics g) {
        this.g =  g;
    }

}
