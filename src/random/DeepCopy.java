package random;

public class DeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException  {
		Address adr = new Address(23, "North Block", "Amsterdam", 560392);
		Student sam = new Student(45, "Samson", adr);

		// Normal direct copy of object
		// Student ambrose = sam;
		
		// Using object.clone
		Student ambrose = sam.clone();
		
		printStudent(sam);
		printStudent(ambrose);

		System.out.println("-----------------------------------------------------");
		
		sam.name = "New Sam";
		sam.stdId = 9;
		adr.city = "London";
		adr.siteNum = 4;
		adr.street = "4th Block";
		adr.zipcode = 2103;
		
		printStudent(sam);
		printStudent(ambrose);
		
//		Student nan = new Student(sam.stdId, sam.name, sam.address);
//		
//		printStudent(nan);
//
//		System.out.println("-----------------------------------------------------");
//		
//		System.out.println("Equals Test : " + sam.equals(ambrose));
//		System.out.println("Double Equals Test : " + (sam == ambrose));
//		System.out.println("Name Equals Test : " + sam.name.equals(ambrose.name));
//		
//		
//		ambrose.name = "Ambrose";
//		ambrose.stdId = 46;
//		ambrose.address = new Address(3,"South Block", "New Hamspire", 3220);
//		
//		System.out.println("-----------------------------------------------------");
//
//		printStudent(sam);
//		printStudent(ambrose);
//		
//		System.out.println("-----------------------------------------------------");
//		System.out.println("Equals Test : " + sam.equals(ambrose));
//		System.out.println("Double Equals Test : " + (sam == ambrose));
	}

	static void printStudent(Student s) {
		System.out.println("Name : " + s.name + "\nID : " + s.stdId + "\nAddress : " + s.address.siteNum + ", "
				+ s.address.street + ", " + s.address.city + ", " + s.address.zipcode);
	}
	
	
}

class Student implements Cloneable {

	int stdId;
	String name;
	Address address;

	public Student(int stdId, String name, Address adress) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.address = adress;
	}

	@Override
	protected Student clone() throws CloneNotSupportedException {
		return (Student) super.clone();
	}
}

class Address {

	int siteNum;
	String street;
	String city;
	int zipcode;

	public Address(int siteNum, String street, String city, int zipcode) {
		super();
		this.siteNum = siteNum;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}

}