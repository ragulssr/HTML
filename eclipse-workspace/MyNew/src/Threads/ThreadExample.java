package Threads;

public class ThreadExample {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName()); // show thread name
		DoTask task = new DoTask();
		task.start();  // start the thread
		try {
			Thread.sleep(1000 * 10); // Thread Sleep time
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class DoTask extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		performTask();
	}

	public void performTask() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000 * 3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

class Fruit {

}

class Apple extends Fruit implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
