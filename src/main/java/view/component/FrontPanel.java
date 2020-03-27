package view.component;

import javax.swing.*;
import java.awt.*;

public class FrontPanel extends JPanel {

    private final MainPanel mainPanel;
    private final RadioButton radioButton;
    private final MainButton mainButton;

   // private final ControllerListener controllerListener;

    public FrontPanel() {
        super();
        mainPanel=new MainPanel();
        radioButton=new RadioButton();
        mainButton=new MainButton();
        //controllerListener = new ControllerListener(textArea, editorPane, ignoreUpperCaseRadioButton, ignoreWhiteCharRadioButton, defaultCase);
        createPanels();
    }

    private void createPanels() {
        setLayout(new BorderLayout());
        this.add(radioButton,BorderLayout.NORTH);
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(mainButton, BorderLayout.SOUTH);

    }

}

