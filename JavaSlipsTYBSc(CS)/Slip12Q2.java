import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Calculator extends JFrame implements ActionListener {
    //J Components
    private JTextField tField;
    private JButton[] digitBtn;
    private JButton addBtn, subBtn, mulBtn, divBtn, equalBtn, modBtn;

    private String input = "";
    private double n1 = 0, n2 = 0;
    private char operator;

    public Calculator() {
        setTitle("Simple Calculator.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        //text field
        tField = new JTextField();
        tField.setEditable(false);
        add(tField, BorderLayout.NORTH);

        //Panel for btns 4x4
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(4, 4));

        //adding digit btn to panel
        digitBtn = new JButton[10];
        for(int i=0; i<10; i++) {
            digitBtn[i] = new JButton(String.valueOf(i));
            digitBtn[i].addActionListener(this);
            btnPanel.add(digitBtn[i]);
        }

        //operation btns
        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");
        modBtn = new JButton("%");
        equalBtn = new JButton("=");

        JButton[] opButtons = {addBtn, subBtn, mulBtn, divBtn, modBtn, equalBtn};
        for(JButton btn: opButtons) {
            btn.addActionListener(this); //adding action to each btn
            btnPanel.add(btn); //adding all btns one by one
        }

        add(btnPanel, BorderLayout.CENTER); //adding panel of btns to frame

        pack(); //packs frame over all components
        setLocationRelativeTo(null); //center the frame
        setVisible(true); // make frame visible
    }

    @Override //override annotation actionPerformed
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if(Character.isDigit(cmd.charAt(0))) {
            input += cmd;
            tField.setText(input);
        } else if(cmd.charAt(0) == '+' || cmd.charAt(0) == '-' ||
        cmd.charAt(0) == '*' || cmd.charAt(0) == '/' || cmd.charAt(0) == '%') {
            n1 = Double.parseDouble(input);
            operator = cmd.charAt(0);
            input = "";
        } else if(cmd.equals("=")) {
            if(!input.isEmpty()) {
                n2 = Double.parseDouble(input);
                double res = perforOperation(n1, n2, operator);
                tField.setText(String.valueOf(res));
                input = "";
            }
        }
    }

    private double perforOperation(double n1, double n2, char operator) {
        // opertion bassed on operators
        switch (operator) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                return n1 / n2;
            case '%':
                return n1 % n2;
            default:
                return 0;
        }
    }
}

public class Slip12Q2 {
    public static void main(String[] args) {
       new Calculator();
    }
}
