import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends Frame implements MouseListener {
    Label l;

    MouseListenerExample() {
        addMouseListener(this);

        l = new Label();
        l.setBounds(20, 50, 120, 20);
        add(l);

        setTitle("Mouse Event");
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        // Add window closing event to exit the application
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Close the frame properly
            }
        });
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
