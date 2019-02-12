package random;

public class SubClassCheck {
	public static void main(String[] args) {
		MainClass a = new MainClass();
		a.print();
		SubClass b = new SubClass();
		b.print();
		
		MainClass c = new SubClass();
		c.print();
		
		MainClass d = (MainClass) new SubClass();
		d.print();
 	}
}

class SubClass extends MainClass {
	public void print() {
		System.out.println("Sub Class");
	}
}

class MainClass {
	public  void print() {
		System.out.println("Base Class");
	}
	
	public static void printer() {
		System.out.println("Base Class Printer");
	}
}