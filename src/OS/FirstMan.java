package OS;

public class FirstMan extends Thread {
    @Override
    public void run()
    {
        try{
            System.out.println("Я запустился!");
            sleep(1000);
        }catch(InterruptedException ignored){}
    }
}
