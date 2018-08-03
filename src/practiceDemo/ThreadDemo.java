package practiceDemo;

public class ThreadDemo extends Thread{
        public void run() {
        	System.out.println("我先执行");
        	
        }
        public static void main(String[] args) throws InterruptedException {
			ThreadDemo2 b=new ThreadDemo2();
			b.start();
			
}
}

class ThreadDemo2 extends Thread{
	public void run() {
		ThreadDemo a=new ThreadDemo();
		a.start();
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("我想等ThreadDemo先执行完毕再执行，我做到了");
	}
}