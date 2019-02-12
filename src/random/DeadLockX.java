package random;

public class DeadLockX {
	// public static void main(String[] args) {
	//
	// Thread t1 = new Thread() {
	// public void run() {
	// synchronized (Integer.class) {
	// System.out.println("Thread 1: locked resource 1");
	//
	// try {
	// Thread.sleep(100);
	// } catch (Exception e) {
	// }
	//
	// synchronized (String.class) {
	// System.out.println("Thread 1: locked resource 2");
	// }
	// }
	// }
	// };
	//
	// // t2 tries to lock resource2 then resource1
	// Thread t2 = new Thread() {
	// public void run() {
	// synchronized (String.class) {
	// System.out.println("Thread 2: locked resource 2");
	//
	// try {
	// Thread.sleep(100);
	// } catch (Exception e) {
	// }
	//
	// synchronized (Integer.class) {
	// System.out.println("Thread 2: locked resource 1");
	// }
	// }
	// }
	// };
	//
	// t1.start();
	// t2.start();
	// }

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				synchronized (Integer.class) {
					System.out.println("Thread 1 - Resource 1");

					synchronized (String.class) {
						System.out.println("Thread 1 - Resource 2");
					}
				}

			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (String.class) {
					System.out.println("Thread 2 - Resource 2");

					synchronized (Integer.class) {
						System.out.println("Thread 2 - Resource 1");
					}
				}

			}
		};

		t1.start();
		t2.start();
		t2.setDaemon(true);
	}
}
