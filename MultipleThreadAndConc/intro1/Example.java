public class Example
{
    public static void main(String...args)
    {
       KajalThread kajal=new KajalThread();
       NehaThread neha=new NehaThread();
       kajal.start();
       neha.start();     
    }
}