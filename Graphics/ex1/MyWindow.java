import javax.swing.JFrame;
import java.awt.GridLayout;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Graphics Example");
        setSize(400, 400);
        setLayout(new GridLayout(1, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyCanvas canvas = new MyCanvas();
        add(canvas);

    }
}