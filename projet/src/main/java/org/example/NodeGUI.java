package org.example;

import javax.swing.*;
import java.awt.*;

public class NodeGUI extends JTextField {
    Node node;
    int height;
    /**
     * Constructs a new <code>TextField</code> initialized with the
     * specified text. A default model is created and the number of
     * columns is 0.
     *
     * @param text the text to be displayed, or <code>null</code>
     */
    public NodeGUI(Node node, int height) {
        super(node.content);
        this.node = node;
        this.height = height;
    }
}
