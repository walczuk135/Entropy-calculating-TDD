package view;


import service.FormatterKey;
import service.algorithm.AlgorithmService;
import service.algorithm.ShannonAlgorithmEntropy;
import service.formatter.FormatterTextService;
import view.component.MainButton;
import view.component.MainPanel;
import view.component.RadioButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class ControllerListener implements ActionListener {
    private AlgorithmService algorithmService;
    private FormatterTextService formatterTextService;
    private final JTextArea textArea;
    private final JEditorPane editorPane;

    private final JRadioButton upperCaseRadioButton;
    private final JRadioButton lowerCaseRadioButton;
    private final JRadioButton defaultCase;
    private final JRadioButton withoutAlphabeticCharButton;
    private final JRadioButton withoutNumberButton;
    private final JRadioButton withoutSpecialCharButton;
    private final JRadioButton withoutWhiteCharButton;

    private final JButton button;

    public ControllerListener(MainButton mainButton, RadioButton radioButton, MainPanel mainPanel) {
        this.textArea = mainPanel.getTextArea();
        this.editorPane = mainPanel.getEditorPane();

        this.upperCaseRadioButton = radioButton.getUpperCaseButton();
        this.lowerCaseRadioButton = radioButton.getLowerCaseButton();
        this.defaultCase = radioButton.getDefaultCase();
        this.withoutAlphabeticCharButton = radioButton.getWithoutAlphabeticCharButton();
        this.withoutNumberButton = radioButton.getWithoutNumberButton();
        this.withoutSpecialCharButton = radioButton.getWithoutSpecialCharButton();
        this.withoutWhiteCharButton = radioButton.getWithoutWhiteCharButton();

        this.button = mainButton.getButtonMain();

        this.algorithmService = new AlgorithmService();
        this.formatterTextService = new FormatterTextService();
        this.algorithmService.setAlgorithmEntropy(new ShannonAlgorithmEntropy());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Map<JRadioButton, FormatterKey> mabJButton = getjRadioButtonFormatterMap();

        SwingUtilities.invokeLater(() -> {
            String text = textArea.getText();
            for (Map.Entry<JRadioButton, FormatterKey> entry : mabJButton.entrySet()) {
                if (entry.getKey().isSelected()){
                    text=formatterTextService.formatter(entry.getValue(),text);
                    textArea.setText(text);
                }
            }
            editorPane.setText(algorithmService.calculate(text));
        });
    }

    private Map<JRadioButton, FormatterKey> getjRadioButtonFormatterMap() {
        Map<JRadioButton,FormatterKey> mabJButton=new HashMap<>();
        mabJButton.put(upperCaseRadioButton,FormatterKey.UPPER_CASE);
        mabJButton.put(lowerCaseRadioButton,FormatterKey.LOWER_CASE);
        mabJButton.put(defaultCase,FormatterKey.DEFAULT_FORMAT);
        mabJButton.put(withoutAlphabeticCharButton,FormatterKey.WITHOUT_ALPHABETIC);
        mabJButton.put(withoutNumberButton,FormatterKey.WITHOUT_NUMBER);
        mabJButton.put(withoutSpecialCharButton,FormatterKey.WITHOUT_SPECIAL_CHAR);
        mabJButton.put(withoutWhiteCharButton,FormatterKey.WITHOUT_WHITE_CHAR);
        return mabJButton;
    }
}

