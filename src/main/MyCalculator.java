package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Objects;

class WindowClosingEventListener extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class Calculator implements ActionListener {

    // Buttons
    Button btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6,
            btnNum7, btnNum8, btnNum9, btnNum0, btnPlus, btnMinus, btnDivide,
            btnMultiply, btnEqual, btnDot, btnClearAll, btnClear, btnPercentage, btnSqrt,
            btnMc, btnMr, btnMs, btnMPlus, btnMMinus, btnPlusOrMinus, btnBlank1,
            btnBlank2, btnBlank3, btnBlank4;

    // Text Field
    TextField display;

    // Variables
    String firstValue, secondValue, operator;
    Double firstValueDouble = 0.0, secondValueDouble = 0.0, result = 0.0;

    public Calculator() {

        // Colors
        Color colorGreen = new Color(0, 255, 202);
        Color colorBlue = new Color(10, 77, 104);

        // Create frame sourceect
        Frame frame = new Frame();
        frame.setBackground(Color.white);
        frame.setBounds(500, 250, 330, 450);
        frame.setTitle("My Calculator");
        frame.addWindowListener(new WindowClosingEventListener());

        // Menu Bar && Menu Items
        MenuBar menuBar = new MenuBar();
        MenuItem standardMenuItem = new MenuItem("Standard");
        MenuItem scientificMenuItem = new MenuItem("Scientific");
        MenuItem copyMenuItem = new MenuItem("Copy");
        MenuItem pasteMenuItem = new MenuItem("Paste");
        MenuItem helpMenuItem = new MenuItem("View Help");
        MenuItem aboutMenuItem = new MenuItem("About Calculator");

        Menu viewMenu = new Menu("View");
        viewMenu.add(standardMenuItem);
        viewMenu.add(scientificMenuItem);
        Menu editMenu = new Menu("Edit");
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        Menu helpMenu = new Menu("Help");
        helpMenu.add(helpMenuItem);
        helpMenu.add(aboutMenuItem);

        menuBar.add(viewMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        frame.setMenuBar(menuBar);

        // Panels
        Panel panelInput = new Panel();
        panelInput.setLayout(new GridLayout());

        Panel panelButtons = new Panel();

        // Grid Layout
        GridLayout gridLayout = new GridLayout(6, 5);
        panelButtons.setLayout(gridLayout);
        panelButtons.setBackground(Color.WHITE);

        // Create Text Field
        display = new TextField();
        Font font = new Font("Calibri", Font.BOLD, 30);
        display.setFont(font);
        display.setForeground(colorBlue);

        // Add display field to panelInput panel
        panelInput.add(display);

        // Create Buttons
        btnMc = new Button("MC");
        btnMr = new Button("MR");
        btnMs = new Button("MS");
        btnMPlus = new Button("M+");
        btnMMinus = new Button("M-");
        btnBlank1 = new Button("<--");
        btnClearAll = new Button("CE");
        btnClear = new Button("C");
        btnPlusOrMinus = new Button("+/-");
        btnSqrt = new Button("SQRT");
        btnNum7 = new Button("7");
        btnNum8 = new Button("8");
        btnNum9 = new Button("9");
        btnDivide = new Button("/");
        btnPercentage = new Button("%");

        btnNum4 = new Button("4");
        btnNum5 = new Button("5");
        btnNum6 = new Button("6");
        btnMultiply = new Button("*");
        btnBlank2 = new Button("1/X");
        btnNum1 = new Button("1");
        btnNum2 = new Button("2");
        btnNum3 = new Button("3");
        btnMinus = new Button("-");
        btnEqual = new Button("=");
        btnNum0 = new Button("0");
        btnBlank3 = new Button("");
        btnDot = new Button(".");
        btnPlus = new Button("+");
        btnBlank4 = new Button("");

        // Set Fonts For Buttons
        Font font1 = new Font("Calibri", Font.BOLD, 18);
        Font font2 = new Font("Calibri", Font.BOLD, 15);

        btnNum0.setFont(font1);
        btnNum1.setFont(font1);
        btnNum2.setFont(font1);
        btnNum3.setFont(font1);
        btnNum4.setFont(font1);
        btnNum5.setFont(font1);

        btnNum6.setFont(font1);
        btnNum7.setFont(font1);
        btnNum8.setFont(font1);
        btnNum9.setFont(font1);

        btnMc.setFont(font2);
        btnMr.setFont(font2);
        btnMs.setFont(font2);
        btnMPlus.setFont(font2);
        btnMMinus.setFont(font2);
        btnClearAll.setFont(font2);
        btnClear.setFont(font2);
        btnPlus.setFont(font2);
        btnMinus.setFont(font2);
        btnPlusOrMinus.setFont(font2);
        btnSqrt.setFont(font2);
        btnDivide.setFont(font2);
        btnMultiply.setFont(font2);
        btnPercentage.setFont(font2);
        btnEqual.setFont(font2);
        btnDot.setFont(font2);

        // Change Button Colors
        btnNum0.setBackground(colorBlue);
        btnNum0.setForeground(colorGreen);
        btnNum1.setBackground(colorBlue);

        btnNum1.setForeground(colorGreen);
        btnNum2.setBackground(colorBlue);
        btnNum2.setForeground(colorGreen);
        btnNum3.setBackground(colorBlue);
        btnNum3.setForeground(colorGreen);
        btnNum4.setBackground(colorBlue);
        btnNum4.setForeground(colorGreen);
        btnNum5.setBackground(colorBlue);
        btnNum5.setForeground(colorGreen);
        btnNum6.setBackground(colorBlue);
        btnNum6.setForeground(colorGreen);
        btnNum7.setBackground(colorBlue);
        btnNum7.setForeground(colorGreen);
        btnNum8.setBackground(colorBlue);
        btnNum8.setForeground(colorGreen);
        btnNum9.setBackground(colorBlue);
        btnNum9.setForeground(colorGreen);

        btnMc.setBackground(colorGreen);
        btnMr.setBackground(colorGreen);
        btnMs.setBackground(colorGreen);
        btnMPlus.setBackground(colorGreen);
        btnMMinus.setBackground(colorGreen);
        btnClearAll.setBackground(colorGreen);
        btnClear.setBackground(colorGreen);
        btnPlus.setBackground(colorGreen);

        btnMinus.setBackground(colorGreen);
        btnPlusOrMinus.setBackground(colorGreen);
        btnSqrt.setBackground(colorGreen);
        btnDivide.setBackground(colorGreen);
        btnMultiply.setBackground(colorGreen);
        btnPercentage.setBackground(colorGreen);
        btnEqual.setBackground(colorGreen);
        btnDot.setBackground(colorGreen);

        btnBlank1.setBackground(colorGreen);
        btnBlank2.setBackground(colorGreen);
        btnBlank3.setBackground(colorBlue);
        btnBlank4.setBackground(colorBlue);

        // Add Action Listners to Buttons
        btnNum0.addActionListener(this);
        btnNum1.addActionListener(this);
        btnNum2.addActionListener(this);
        btnNum3.addActionListener(this);
        btnNum4.addActionListener(this);
        btnNum5.addActionListener(this);
        btnNum6.addActionListener(this);
        btnNum7.addActionListener(this);
        btnNum8.addActionListener(this);
        btnNum9.addActionListener(this);

        btnMc.addActionListener(this);
        btnMr.addActionListener(this);
        btnMs.addActionListener(this);
        btnMPlus.addActionListener(this);
        btnMMinus.addActionListener(this);
        btnClearAll.addActionListener(this);
        btnClear.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnPlusOrMinus.addActionListener(this);
        btnSqrt.addActionListener(this);
        btnDivide.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnPercentage.addActionListener(this);
        btnEqual.addActionListener(this);
        btnDot.addActionListener(this);

        // Add Buttons to the Panel
        panelButtons.add(btnMc);
        panelButtons.add(btnMr);
        panelButtons.add(btnMs);
        panelButtons.add(btnMPlus);
        panelButtons.add(btnMMinus);
        panelButtons.add(btnBlank1);
        panelButtons.add(btnClearAll);
        panelButtons.add(btnClear);

        panelButtons.add(btnPlusOrMinus);
        panelButtons.add(btnSqrt);
        panelButtons.add(btnNum7);
        panelButtons.add(btnNum8);
        panelButtons.add(btnNum9);
        panelButtons.add(btnDivide);
        panelButtons.add(btnPercentage);
        panelButtons.add(btnNum4);
        panelButtons.add(btnNum5);
        panelButtons.add(btnNum6);
        panelButtons.add(btnMultiply);
        panelButtons.add(btnBlank2);
        panelButtons.add(btnNum1);
        panelButtons.add(btnNum2);
        panelButtons.add(btnNum3);
        panelButtons.add(btnMinus);
        panelButtons.add(btnPlus);
        panelButtons.add(btnBlank3);
        panelButtons.add(btnNum0);
        panelButtons.add(btnBlank4);
        panelButtons.add(btnDot);
        panelButtons.add(btnEqual);

        // Add two panels to the frame
        frame.add(panelInput, BorderLayout.NORTH);
        frame.add(panelButtons, BorderLayout.CENTER);

        // Set frame visible
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source.equals(btnNum0)) { // 0
            display.setText(display.getText() + btnNum0.getLabel());
        } else if (source.equals(btnNum1)) { // 1
            display.setText(display.getText() + btnNum1.getLabel());
        } else if (source.equals(btnNum2)) { // 2
            display.setText(display.getText() + btnNum2.getLabel());
        } else if (source.equals(btnNum3)) { // 3
            display.setText(display.getText() + btnNum3.getLabel());
        } else if (source.equals(btnNum4)) { // 4
            display.setText(display.getText() + btnNum4.getLabel());
        } else if (source.equals(btnNum5)) { // 5
            display.setText(display.getText() + btnNum5.getLabel());
        } else if (source.equals(btnNum6)) { // 6
            display.setText(display.getText() + btnNum6.getLabel());
        } else if (source.equals(btnNum7)) { // 7
            display.setText(display.getText() + btnNum7.getLabel());
        } else if (source.equals(btnNum8)) { // 8
            display.setText(display.getText() + btnNum8.getLabel());

        } else if (source.equals(btnNum9)) { // 9
            display.setText(display.getText() + btnNum9.getLabel());
        } else if (!Objects.equals(operator, btnPlus.getLabel()) && source.equals(btnPlus)) { // +
            firstValue = display.getText();
            display.setText("");
            operator = btnPlus.getLabel();
        } else if (!Objects.equals(operator, btnMinus.getLabel()) && source.equals(btnMinus)) { // -
            firstValue = display.getText();
            display.setText("");
            operator = btnMinus.getLabel();
        } else if (!Objects.equals(operator, btnMultiply.getLabel()) && source.equals(btnMultiply)) { // -
            firstValue = display.getText();
            display.setText("");
            operator = btnMultiply.getLabel();
        } else if (operator != btnDivide.getLabel() && source.equals(btnDivide)) { // -
            firstValue = display.getText();
            display.setText("");
            operator = btnDivide.getLabel();
        } else if (source.equals(btnPercentage)) { // %
            if (!display.getText().equals("")) {
                firstValue = display.getText();
                firstValueDouble = Double.parseDouble(firstValue);
                result = firstValueDouble / 100;
                display.setText(result.toString());
            } else {
                display.setText("ERROR");

            }
        } else if (source.equals(btnSqrt)) { // SQRT
            if (!display.getText().equals("")) {
                firstValue = display.getText();
                firstValueDouble = Double.parseDouble(firstValue);
                result = Math.sqrt(firstValueDouble);
                display.setText(result.toString());
            } else {
                display.setText("ERROR");
            }
        } else if (source.equals(btnDot)) { // .
            display.setText(display.getText() + btnDot.getLabel());
        } else if (source.equals(btnEqual)) { // =
            if (!display.getText().equals("")) {
                secondValue = display.getText();
                firstValueDouble = Double.parseDouble(firstValue);
                secondValueDouble = Double.parseDouble(secondValue);
                if (operator.equals(btnPlus.getLabel())) { // Addition
                    result = firstValueDouble + secondValueDouble;
                    display.setText(result.toString());
                } else if (operator.equals(btnMinus.getLabel())) {
                    result = firstValueDouble - secondValueDouble;
                    display.setText(result.toString());
                } else if (operator.equals(btnMultiply.getLabel())) {
                    result = firstValueDouble * secondValueDouble;
                    display.setText(result.toString());

                } else if (operator.equals(btnDivide.getLabel())) {
                    result = firstValueDouble / secondValueDouble;
                    display.setText(result.toString());
                }
            }
        } else if (source.equals(btnClear)) { // C
            if (!display.getText().equals("")) {
                String current_txt = display.getText();
                int len = current_txt.length();
                String new_txt = current_txt.substring(0, len - 1);
                display.setText(new_txt);
            }
        } else if (source.equals(btnClearAll)) { // CE
            display.setText("");
            firstValue = "";
            secondValue = "";
            operator = "";
            firstValueDouble = 0.0;
            secondValueDouble = 0.0;
            result = 0.0;
        } else if (source.equals(btnPlusOrMinus)) { // +/-
            if (!display.getText().equals("")) {
                String current_txt = display.getText();
                int len = current_txt.length();
                String new_txt;
                if (current_txt.charAt(0) == '-') {

                    new_txt = current_txt.substring(1);
                    display.setText(new_txt);
                } else {
                    new_txt = "-" + current_txt;
                    display.setText(new_txt);
                }
            }
        }
    }
}

public class MyCalculator {

    public static void main(String[] args) {
        new Calculator();
    }

}
