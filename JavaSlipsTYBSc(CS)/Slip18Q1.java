
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class BLManager extends JFrame {
    private JFrame frame;
    JButton nBtn, sBtn, eBtn, wBtn, ctrBtn;
    
    BLManager() {
        frame = new JFrame("Border Layout Manager");
        frame.setSize(400, 400);
        
        nBtn = new JButton("North");
        sBtn = new JButton("South");
        eBtn = new JButton("East");
        wBtn = new JButton("West");
        ctrBtn = new JButton("Center");
        
        //border layout manager
        frame.setLayout(new BorderLayout());
        
        frame.add(nBtn, BorderLayout.NORTH);
        frame.add(sBtn, BorderLayout.SOUTH);
        frame.add(eBtn, BorderLayout.EAST);
        frame.add(wBtn, BorderLayout.WEST);
        frame.add(ctrBtn, BorderLayout.CENTER);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class Slip18Q1 {
    public static void main(String[] args) {
        new BLManager();
    }
}
