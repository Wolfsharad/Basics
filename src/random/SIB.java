package random;

public class SIB {

	static 
	{
		System.out.println("Static Initialized Block");
	}
	{
		System.out.println("Instance Initialized Block");
	}
	
	public static void main(String[] args) {
		SIB sib=new SIB();
		sib.show();
		dummyStatic();
		SIB sib2=new SIB();
		//sib2 = sib;
		sib2.show();

	}

	private static void dummyStatic() {
		System.out.println("inside static main");
	}

	private void show() {
		// TODO Auto-generated method stub
		System.out.println("inside main show");
	}
}
