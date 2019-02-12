package random;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PrimeNumber {
	public static void main(String arg[]) throws IOException {
		int ar[] = { 15, 16, 17, 18, 19 };
		 findPrime(ar);
		//findPrimeSingle(15);
		File f = new File("/Users/10614974/Desktop/new.txt");
		FileWriter fw = new FileWriter(f);
		String input = "My very educated mother just showed you nine planets \nPlanets of the Universe";
		fw.write(input);
		fw.close();
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		StringBuffer sb = new StringBuffer();
		String s;
		while((s = br.readLine()) != null) {
			sb.append(s);
		}
		System.out.println(sb);
		
		mul(4);
	}

	private static void mul(int n) {
		if(n <=1) {
			return;
		}
		System.out.println("1:"+n);
		mul(n-1);
		System.out.println("2:"+n);
		mul(n-1);
	}

	private static void findPrimeSingle(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}

	private static void findPrime(int[] ar) {
			for(int j = 0; j<ar.length; j++) {
				boolean flag = false;
				for (int i = 2; i <= ar[j] / 2; ++i) {
					// condition for nonprime number
					if (ar[j] % i == 0) {
						flag = true;
						break;
					}
				}

				if (!flag)
					System.out.println(ar[j] + " is a prime number.");
				else
					System.out.println(ar[j] + " is not a prime number.");
			}
	}
}
