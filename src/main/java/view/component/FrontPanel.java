package view.component;

import view.ControllerListener;

import javax.swing.*;
import java.awt.*;

public class FrontPanel extends JPanel {

    private final MainPanel mainPanel;
    private final RadioButton radioButton;
    private final MainButton mainButton;

    public FrontPanel() {
        super();
        mainPanel=new MainPanel();
        radioButton=new RadioButton();
        mainButton=new MainButton();
        mainButton.getButtonMain().addActionListener(new ControllerListener(mainButton,radioButton,mainPanel));
        createPanels();
    }

    private void createPanels() {
        setLayout(new BorderLayout());
        this.add(radioButton,BorderLayout.NORTH);
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(mainButton, BorderLayout.SOUTH);
    }

}

