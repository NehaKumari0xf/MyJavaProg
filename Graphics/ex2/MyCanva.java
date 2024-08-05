import java.awt.Canvas;
import java.awt.Graphics;

public class MyCanva extends Canvas{
    @Override
    public void paint(Graphics g){
        //draw sqaure shape
        g.drawLine(300, 300, 600, 300);
        g.drawLine(300, 300, 300, 600);
        g.drawLine(600, 300, 600, 600);
        g.drawLine(300, 600, 600, 600);

        //rectangle shape
         g.drawLine(200, 200, 300, 200);
         g.drawLine(200, 200, 200, 300);
         g.drawLine(300, 200, 300, 300);
         g.drawLine(200, 300, 300, 300);

         g.drawLine(500, 500, 300, 500);
         g.drawLine(500, 500, 500, 300);
         g.drawLine(300, 500, 300, 300);
         g.drawLine(500, 300, 300, 300);

    }

    
}