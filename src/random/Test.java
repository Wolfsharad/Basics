package random;

public class Test {

	private Test() {

	}

	static int num = 90;
	static String mystr = " sdf ";
	int num1 = 98;
	String mystr1 = "Static keyword in Java2";

	public static void main(String[] args) {
		System.out.println("Value of num: " + num);
		System.out.println("Value of mystr: " + mystr);
		Test s = new Test();
		s.print(9);

		Nested ns = new Nested();
		ns.print();

	}

	public void print(int a) {
		System.out.println(num);
		System.out.println(num1);
		System.out.println(mystr);

	}

	public static void print(String a) {

	}

	static class Nested {
		public void print() {
			System.out.println("Static Nested" + num);
		}
	}
}