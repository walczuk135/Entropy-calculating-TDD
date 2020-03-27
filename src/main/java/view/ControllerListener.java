package view;


import service.algorithm.AlgorithmService;
import service.formatter.FormatterTextService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerListener implements ActionListener {
    private AlgorithmService algorithmService;
    private FormatterTextService formatterTextService;
    private final JTextArea textArea;
    private final JEditorPane editorPane;

    private final JRadioButton ignoreUpperCaseRadioButton;
    private final JRadioButton ignoreWhiteCharRadioButton;
    private final JRadioButton defaultCase;


    public ControllerListener(JTextArea textArea, JEditorPane editorPane, JRadioButton ignoreUpperCaseRadioButton,
                              JRadioButton ignoreWhiteCharRadioButton, JRadioButton defaultCase) {
        this.textArea = textArea;
        this.editorPane = editorPane;
        this.ignoreUpperCaseRadioButton = ignoreUpperCaseRadioButton;
        this.ignoreWhiteCharRadioButton = ignoreWhiteCharRadioButton;
        this.defaultCase = defaultCase;

        this.algorithmService=new AlgorithmService();
        this.formatterTextService=new FormatterTextService();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        SwingUtilities.invokeLater(() -> {
//            String text = textArea.getText();
//            String result="";
//
//             if(polishAlphabet.isSelected()&&defaultCase.isSelected()){
//                textArea.setText(text);
//                result=shannonAlgorithm.calculateShannonEntropy(text,1);
//            }
//            else if(polishAlphabet.isSelected()&&ignoreUpperCaseRadioButton.isSelected()){
//                textArea.setText(text.toLowerCase());
//                result=shannonAlgorithm.calculateShannonEntropy(text.toLowerCase(),1);
//            }
//            else if(polishAlphabet.isSelected()&&ignoreWhiteCharRadioButton.isSelected()){
//                textArea.setText(text.replace(" ",""));
//                result=shannonAlgorithm.calculateShannonEntropy(text.replace(" ",""),1);
//            }
//
//            else if(englishAlphabet.isSelected()&&defaultCase.isSelected()){
//                textArea.setText(text);
//                result=shannonAlgorithm.calculateShannonEntropy(text,2);
//            }
//            else if(englishAlphabet.isSelected()&&ignoreUpperCaseRadioButton.isSelected()){
//                textArea.setText(text.toLowerCase());
//                result=shannonAlgorithm.calculateShannonEntropy(text.toLowerCase(),2);
//            }
//            else if(englishAlphabet.isSelected()&&ignoreWhiteCharRadioButton.isSelected()){
//                textArea.setText(text.replace(" ",""));
//                result=shannonAlgorithm.calculateShannonEntropy(text.replace(" ",""),2);
//            }
//
//            else if(defaultAlphabet.isSelected()&&defaultCase.isSelected()){
//                textArea.setText(text);
//                result=shannonAlgorithm.calculateShannonEntropy(text);
//            }
//            else if(defaultAlphabet.isSelected()&&ignoreUpperCaseRadioButton.isSelected()){
//                textArea.setText(text.toLowerCase());
//                result=shannonAlgorithm.calculateShannonEntropy(text.toLowerCase());
//            }
//            else if(defaultAlphabet.isSelected()&&ignoreWhiteCharRadioButton.isSelected()){
//                textArea.setText(text.replace(" ",""));
//                result=shannonAlgorithm.calculateShannonEntropy(text.replace(" ",""));
//            }
//
//            else{
//                result= "Musisz zaznaczyć dwa przyciski";
//            }
//            if(result.equals("0.0")){
//                editorPane.setText("Błędny Alfabet !!!!!!!!!! W zaznaczonym alfabecie nie ma takiego znaku.");
//            }
//            else editorPane.setText(result);
//            editorPane.revalidate();
//        });
    }
}

