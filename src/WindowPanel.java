import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class WindowPanel extends JPanel implements MouseListener {

    public WindowPanel(){
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        WindowManager.drawWindows(g);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(SwingUtilities.isLeftMouseButton(e)){
            System.out.println("clicked");
            if(WindowManager.getWindowOnTop(e.getX(), e.getY()) != null){
                WindowManager.zPosition.add(WindowManager.getWindowOnTop(e.getX(), e.getY()));

            }else{
                Window window = new Window(e.getX(), e.getY());
                WindowManager.zPosition.add(window);
            }
            WindowManager.panel.repaint();
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {


    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
