package view.component;

import javax.swing.*;
import java.awt.*;

public class RadioButton extends JPanel {
    private final JRadioButton upperCaseButton;
    private final JRadioButton lowerCaseButton;
    private final JRadioButton defaultCase;
    private final JRadioButton withoutAlphabeticCharButton;
    private final JRadioButton withoutNumberButton;
    private final JRadioButton withoutSpecialCharButton;
    private final JRadioButton withoutWhiteCharButton;

    public RadioButton() {
        super();
        this.upperCaseButton = new JRadioButton("To upper case");
        this.lowerCaseButton = new JRadioButton("To lower case");
        this.defaultCase = new JRadioButton("To default case");
        this.withoutAlphabeticCharButton=new JRadioButton("To without alphabetic char");
        this.withoutNumberButton=new JRadioButton("To without number");
        this.withoutSpecialCharButton=new JRadioButton("To without special char");
        this.withoutWhiteCharButton=new JRadioButton("To without white char");
        createRadioButtonsAlphabet();
    }

    private void createRadioButtonsAlphabet() {
        ButtonGroup groupCase = new ButtonGroup();
        groupCase.add(defaultCase);
        groupCase.add(upperCaseButton);
        groupCase.add(lowerCaseButton);
        groupCase.add(withoutAlphabeticCharButton);
        groupCase.add(withoutNumberButton);
        groupCase.add(withoutSpecialCharButton);
        groupCase.add(withoutWhiteCharButton);
        this.setLayout(new GridLayout(2, 3));
        this.add(defaultCase);
        this.add(upperCaseButton);
        this.add(lowerCaseButton);
        this.add(withoutAlphabeticCharButton);
        this.add(withoutNumberButton);
        this.add(withoutSpecialCharButton);
        this.add(withoutWhiteCharButton);
    }

    public JRadioButton getUpperCaseButton() {
        return upperCaseButton;
    }

    public JRadioButton getLowerCaseButton() {
        return lowerCaseButton;
    }

    public JRadioButton getDefaultCase() {
        return defaultCase;
    }

    public JRadioButton getWithoutAlphabeticCharButton() {
        return withoutAlphabeticCharButton;
    }

    public JRadioButton getWithoutNumberButton() {
        return withoutNumberButton;
    }

    public JRadioButton getWithoutSpecialCharButton() {
        return withoutSpecialCharButton;
    }

    public JRadioButton getWithoutWhiteCharButton() {
        return withoutWhiteCharButton;
    }
}
