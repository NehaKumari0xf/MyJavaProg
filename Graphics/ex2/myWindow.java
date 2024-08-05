import javax.swing.JFrame;
import java.awt.GridLayout;

public class myWindow extends JFrame{
    public myWindow(){
        setTitle("Shapes");
        setSize(800,800);
        setLayout(new GridLayout(1,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyCanva canva=new MyCanva();
        add(canva);
    }
}
