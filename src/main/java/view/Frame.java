package view;

import view.component.FrontPanel;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        super("Entropy Paweł Walczuk");
        JPanel HtmlAPanel = new FrontPanel();
        add(HtmlAPanel);

        setPreferredSize(new Dimension(600, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
