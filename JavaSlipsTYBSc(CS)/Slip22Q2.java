
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MouseEvents {
    private JFrame frame;
    private JLabel el;
    
    MouseEvents() {
        frame = new JFrame("Mouse Events");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        el = new JLabel("No Event.");
        el.setHorizontalAlignment(JLabel.CENTER);
        el.setVerticalAlignment(JLabel.CENTER);
        el.setForeground(Color.black);
        
        JPanel panel = new JPanel(new GridLayout(1, 1));
        panel.add(el);
        
        frame.add(panel);
        frame.setVisible(true);
        
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                el.setText("Mouse Clicked.");
                el.setForeground(Color.red);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                el.setText("Mouse Pressed.");
                el.setForeground(Color.red);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                el.setText("Mouse Released.");
                el.setForeground(Color.red);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                el.setText("Mouse Entered.");
                el.setForeground(Color.red);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                el.setText("Mouse Exited.");
                el.setForeground(Color.red);
            }
        });
    }
}

public class Slip22Q2 {
    public static void main(String[] args) {
        new MouseEvents();
    }
}
