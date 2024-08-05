import java.awt.Canvas;
import java.awt.Graphics;

public class MyCanvas extends Canvas {
    @Override
    public void paint(Graphics g) {
        g.drawString("Jai sri ganesh", 100, 100);
        g.drawString("Jai Hanuman", 150, 100);
        g.drawLine(70, 270, 370, 270);
        g.drawLine(70, 270, 370, 100);
        g.drawLine(370, 270, 370,100);


    }
}
