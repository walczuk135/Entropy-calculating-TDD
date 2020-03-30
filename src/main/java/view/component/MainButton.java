package view.component;

import javax.swing.*;
import java.awt.*;

public class MainButton extends JPanel {
    private final JButton buttonMain;

    public MainButton() {
        super();

        buttonMain=new JButton("Generate");

        createMainButton();
    }

    private void createMainButton() {
        setLayout(new BorderLayout());
        this.add(buttonMain);
    }

    public JButton getButtonMain() {
        return buttonMain;
    }


}
