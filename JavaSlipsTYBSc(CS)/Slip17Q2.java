
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class StrOperations extends JFrame {
    private JFrame frame;
    private JTextField t1, t2, t3;
    private JButton concatBtn, revBtn; 
    
    StrOperations() {
        frame = new JFrame("String Operations");
        frame.setLayout(new GridLayout(4, 2, 10, 10));
        
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        
        concatBtn = new JButton("Concate");
        revBtn = new JButton("Reverse");
        
        concatBtn.addActionListener((ActionEvent e) -> {
            if(e.getSource() == concatBtn) {
                String res = t1.getText() + t2.getText();
                t3.setText(res);
            }
        });
        
        revBtn.addActionListener((ActionEvent e) -> {
            if(e.getSource() == revBtn) {
                String rev = new StringBuilder(t1.getText() + t2.getText()).reverse().toString();
                t3.setText(rev);
            }
        });
        
        frame.add(new JLabel("String 1 :"));
        frame.add(t1);
        frame.add(new JLabel("String 2 :"));
        frame.add(t2);
        frame.add(new JLabel("Result :"));
        frame.add(t3);
        frame.add(concatBtn);
        frame.add(revBtn);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class Slip17Q2 {
    public static void main(String[] args) {
        new StrOperations();
    }
}
