
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



class Calculator implements ActionListener {
    private JFrame frame;
    private JButton[] digitBtns;
    private JButton addBtn, subBtn, mulBtn, divBtn, modBtn, equalBtn;
    private JTextField tf;
    
    private String input = "";
    private double n1=0, n2=0;
    private char op;
    
    Calculator1() {
        frame = new JFrame("Calculatoer App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        tf = new JTextField();
        tf.setEditable(false);
        frame.add(tf, BorderLayout.NORTH);
        
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(4, 4));
        
        JButton[] digitBtn = new JButton[10];
        for(int i=0; i<10; i++) {
            digitBtn[i] = new JButton(String.valueOf(i));
            digitBtn[i].addActionListener(this);
            btnPanel.add(digitBtn[i]);
        }
        
        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("x");
        divBtn = new JButton("/");
        modBtn = new JButton("%");
        equalBtn = new JButton("=");
        
        JButton[] opBtns = {addBtn, subBtn, mulBtn, divBtn, modBtn, equalBtn};
        for(JButton x:opBtns) {
            x.addActionListener(this);
            btnPanel.add(x);
        }
        
        frame.add(btnPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        
        if(Character.isDigit(cmd.charAt(0))) {
            input += cmd;
            tf.setText(input);
        } else if(cmd.charAt(0) == '+' || cmd.charAt(0) == '-' || cmd.charAt(0) == 'x' ||
        cmd.charAt(0) == '/' || cmd.charAt(0) == '%') {
            n1 = Double.parseDouble(input);    
            op = cmd.charAt(0);
            input = "";
        } else if(cmd.equals("=")) {
            n2 = Double.parseDouble(input);
            double result = performOperation(n1, n2, op);
            tf.setText(String.valueOf(result));
            input = "";
        }
    }
    
    public double performOperation(double n1, double n2, char op) {
        switch(op) {
            case '+': return n1+n2;
            case '-': return n1-n2;
            case 'x': return n1*n2;
            case '/': return n1/n2;
            case '%': return n1%n2;
            default: return 0;
        }
    } 
}
public class Slip12Q2 {
    public static void main(String[] args) {
       new Calculator();
    }
}
