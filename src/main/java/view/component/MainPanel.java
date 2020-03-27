package view.component;

import javax.swing.*;
import java.awt.*;

class MainPanel extends JPanel {
    private final JTextArea textArea;
    private final JEditorPane editorPane;

    public MainPanel() {
        super();
        this.textArea = new JTextArea();
        this.editorPane = new JEditorPane();
        createMainPanel();
    }

    private void createMainPanel(){
        editorPane.setEditable(false);
        this.setLayout(new GridLayout(1, 2));
        textArea.setBackground(Color.lightGray);
        this.add(textArea);
        this.add(editorPane);
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public JEditorPane getEditorPane() {
        return editorPane;
    }
}
