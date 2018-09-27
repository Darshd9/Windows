import java.awt.*;
import java.util.Random;

public class Window {
    private int size;
    private Color color;
    private int xPos;
    private int yPos;

    public Window(int xPos, int yPos){
        this.size = 300;
        this.color = color;
        this.xPos = xPos;
        this.yPos = yPos;
        Random random = new Random();
        float r = random.nextFloat();
        float g = random.nextFloat();
        float b = random.nextFloat();
        this.color = Color.getHSBColor(r,g,b);
    }

    public Color getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
