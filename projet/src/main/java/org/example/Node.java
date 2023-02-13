package org.example;

public class Node {
    Port input;
    Port output;
    String content;

    public Node(String content, Port input, Port output) {
        this.input = input;
        this.output = output;
        this.content = content;
    }
}
