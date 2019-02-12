package random;

public class EagerInitializedSingleton {

	int a;
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
	
	public void print() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		EagerInitializedSingleton es = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton es1 = EagerInitializedSingleton.getInstance();

		System.out.println(es);
		System.out.println(es1);
	}
}