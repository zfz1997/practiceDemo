package practiceDemo;

public class ThreadDomain17 {
    public synchronized void testMethod()
    {
    	
        try
        {
            System.out.println("Enter ThreadDomain17.testMethod, currentThread = " + 
                    Thread.currentThread().getName());
            long l = Integer.MAX_VALUE;
            while (true)
            {
                long lo = 2 / l;
                l--;
            }
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        ThreadDomain17 td = new ThreadDomain17();
        MyThread17 mt0 = new MyThread17(td);
        MyThread17 mt1 = new MyThread17(td);
        mt0.start();
        mt1.start();
    }
}

class MyThread17 extends Thread
{
    private ThreadDomain17 td;
    
    
    public MyThread17(ThreadDomain17 td)
    {
        this.td = td;
    }
    
    public void run()
    {
        td.testMethod();
    }
}