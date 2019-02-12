package random;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9054334060746125401L;
	
	
	private static Employee object = new Employee();
	int num;
	String Name;
	
	private Employee() {}
	

	public static Employee getInstance() {
		return object;
	}
}
public class Test1{
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		Employee e = Employee.getInstance();
		System.out.println(e);
		e.Name = "Sharad";
		e.num =  45;
		System.out.println(e.Name + e.num);
		
		Employee e1 = Employee.getInstance();
		System.out.println(e1);
		e1.Name = "Sara";
		e1.num =  36;
		System.out.println(e.Name + e.num);
		System.out.println(e1.Name + e1.num);
		
		FileOutputStream fos = new FileOutputStream("SerializedFile.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.writeObject(e1);
		oos.close();
		
		//Employee obj = null;
		FileInputStream fis = new FileInputStream("SerializedFile.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee obj = (Employee)ois.readObject();
		ois.close();
		fis.close();
		
		System.out.println(obj.Name);
		System.out.println(obj.num);
	}
}