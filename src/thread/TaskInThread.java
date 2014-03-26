package thread;

import java.util.concurrent.BlockingQueue;

public class TaskInThread extends Thread {

	BlockingQueue<Task> bq;
	
	public void run(){
		while(true){
			try {
				Task t = bq.take();
				t.run();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}