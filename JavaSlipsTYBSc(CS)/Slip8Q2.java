import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Slip8Q2 {
    public static void main(String[] args) {
        //it initialize component frist and
        //after that invoke listeners 
        SwingUtilities.invokeLater(() -> {
        JFrame frame  = new JFrame("Mouse Events");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        Label l = new Label("Mouse Event.");
        TextField t = new TextField(20);
        
        panel.add(l);
        panel.add(t);
        
        frame.add(panel);
        
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateText("Mouse Clicked ", e, t);
            }
        });
        
        frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                updateText("Mouse Moved ", e, t);
            }
        });
        frame.setVisible(true);
        });
    }
    
    static void updateText(String event, MouseEvent e, TextField t) { 
            int xPos = e.getX();
            int yPos = e.getY();
            t.setText(event + " at(x=" + xPos + ",y=" + yPos + ")");
    }
}
