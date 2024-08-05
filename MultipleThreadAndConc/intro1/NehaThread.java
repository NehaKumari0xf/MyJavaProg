public class NehaThread extends Thread {
    public void run()
    {
        int i;
        for(i=1;i<=100;i++)
        {
            System.out.println(i+". Neha");
            try{
                sleep(200);
            }catch(Exception ex)
            {

            }
        }
    }
    
}
