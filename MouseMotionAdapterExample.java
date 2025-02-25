import java.awt.*;
import java.awt.event.*;

public class MouseMotionAdapterExample extends MouseMotionAdapter {
    Frame f;

    MouseMotionAdapterExample() {
        f = new Frame("Mouse Motion Adapter");
        f.addMouseMotionListener(this);
        
        // Handle window closing
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose(); // Close the frame
            }
        });

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.orange);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }

    public static void main(String[] args) {
        new MouseMotionAdapterExample();
    }
}
