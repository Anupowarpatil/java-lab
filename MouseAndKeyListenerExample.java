import java.awt.*;
import java.awt.event.*;

class MouseAndKeyListenerExample extends Frame implements MouseListener, KeyListener {
    Label label1, label2;

    MouseAndKeyListenerExample() {
        // Create labels
        label1 = new Label("Mouse and key events will appear here");
        label2 = new Label();

        // Set bounds for labels
        label1.setBounds(20, 50, 300, 20);
        label2.setBounds(20, 80, 300, 20);

        // Add mouse and key listeners
        addMouseListener(this);
        addKeyListener(this);
        setFocusable(true); // To ensure the Frame can receive key events

        // Add labels to the frame
        add(label1);
        add(label2);

        // Frame settings
        setSize(400, 200);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setBackground(Color.LIGHT_GRAY);

        // Close the frame on exit
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        label2.setText("Mouse Clicked at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {
        label2.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label2.setText("Mouse Exited");
    }

    // KeyListener methods
    @Override
    public void keyTyped(KeyEvent e) {
        label2.setText("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        label2.setText("Key Pressed: " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label2.setText("Key Released: " + e.getKeyCode());
    }

    public static void main(String[] args) {
        new MouseAndKeyListenerExample();
    }
}
