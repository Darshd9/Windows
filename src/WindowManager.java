import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WindowManager {

    public static final int SIZE = 300;

    public static List<Window> zPosition;

    public static JPanel panel;

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Board");
        frame.pack();
        frame.setSize(2000, 2000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new WindowPanel();
        panel.setSize(2000, 2000);
        panel.setLayout(null);
        panel.setVisible(true);
        frame.add(panel);

        zPosition = new ArrayList<>();


        frame.setVisible(true);

        Graphics g = panel.getGraphics();

        Window window = new Window(60, 90);
        zPosition.add(window);
        zPosition.add(new Window(90, 120 ));
    }

    public static void drawWindows(Graphics g){
        for(Window w : zPosition){
            g.setColor(w.getColor());
            g.fillRect(w.getxPos(), w.getyPos(), w.getSize(), w.getSize());
        }
    }

    public static Window getWindowOnTop(int x, int y){
        for (int i = zPosition.size() - 1; i >= 0 ; i-- ){
            Window window = zPosition.get(i);
            if(x >= window.getxPos() && x<= window.getxPos() + SIZE && y >= window.getyPos() && y <= window.getyPos() + SIZE){
                zPosition.add(zPosition.remove(i));
                return window;
            }

        }
        return null;
    }
}
