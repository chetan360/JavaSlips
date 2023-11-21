
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class TYBCS extends JFrame {
    TYBCS() {
        JFrame frame = new JFrame("TYBCS Subjects");
        frame.setSize(300, 200);
        
//        JPanel panel = new JPanel();
        frame.setLayout(new GridLayout(2,1, 50, 50));
        
        JComboBox<String> comboBox = new JComboBox<>(new String[] {
           "OS",
            "Python",
            "Web",
            "FDS",
            "Java"
        });
        
        frame.add(comboBox);
        
        JTextField tf = new JTextField(20);
        frame.add(tf);
        
        comboBox.addActionListener((ActionEvent e) -> {
            String str = (String) comboBox.getSelectedItem();
            tf.setText(str);
        });
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class Slip19Q2 {
    public static void main(String[] args) {
        new TYBCS();
    }
}
