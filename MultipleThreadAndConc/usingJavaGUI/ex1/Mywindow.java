import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.GridLayout;
public class Mywindow extends JFrame
{
    JLabel l1,l2;
    public Mywindow()
    {
        setTitle("MultiThreading Example");
        setLayout(new GridLayout(2,2));
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel("Neha Counter"));
        add(new JLabel("Kajal Counter"));
        l1=new JLabel();
        l2=new JLabel();
        add(l1);
        add(l2);
        Neha neha=new Neha();
        Kajal kajal=new Kajal();

        neha.start();
        kajal.start();

    }

    class Neha extends Thread{
        @Override
        public void run()
        {
            int i;
            for(i=0;i<100;i++)
            {
                l1.setText(i+"");
                try
                {
                    sleep(1000);
                }
                catch(Exception ex)
                {

                }
            }
        }
    }

    class Kajal extends Thread
    {
        @Override
        public void run()
        {
            int i;
            for(i=100;i>0;i--)
            {
                l2.setText(i+"");
                try
                {
                    sleep(1000);
                }catch(Exception ex)
                {

                }
            }
        }
    }
}