package javaSE.guiSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 Open project DemoGuiSwing (from 1.4.2 labs).
 Add a GUI-application following controls:
 JLabel – "Run a Program", JComboBox - a list of standard programs (example, calc.exe,
 notepad.exe, etc), JButton - clicking on button «Run» causes execute the selected
 program from the list.
 */
public class Lab143 extends MyApplication {

    public static final String NOTEPAD = "Notepad";
    public static final String CALCULATOR = "Calc";
    private JPanel panel;
    private JLabel label;
    private JComboBox jComboBox;
    JButton button ;
    String currentVAlue = CALCULATOR;

    public Lab143(String name, int width, int heigth, boolean isVsbl) throws HeadlessException {
        super(name, width, heigth, isVsbl);
        panel = new JPanel();
        label = new JLabel("Run a Program");
        JComboBox comboBox = new JComboBox();
        comboBox.addItem(CALCULATOR);
        comboBox.addItem(NOTEPAD);
        comboBox.addActionListener(e -> {


        });
        comboBox.addItemListener(e->{
            currentVAlue = comboBox.getSelectedItem().toString();
        });
        button = new JButton("Run");
        button.addActionListener(e -> {
            try {
                //System.out.println(currentVAlue);
                Runtime.getRuntime().exec(currentVAlue);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        this.add(panel);
        panel.setLayout(new FlowLayout( ));
        panel.add(button);
        panel.add(comboBox);
        panel.add(label);
        panel.setLayout(new FlowLayout( ));


    }

    public static void main(String[] args) {
        new Lab143("My Other Frame ", 500,400, true).validate();

    }
}
