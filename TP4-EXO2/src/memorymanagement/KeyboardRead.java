package memorymanagement;

import java.util.Scanner;

public class KeyboardRead {

	// Method to read an int
	public static int readInt() {		
		int i;	
		Scanner si=new Scanner (System.in);	  
		i=si.nextInt();
		return i;	
	}
	
	// Method to read a double
	public static double readDbl() {		
		double d;	
		Scanner sd=new Scanner (System.in);	  
		d=sd.nextDouble();
		return d;
	}
	
	// Method to read a float
	public static float readFloat() {		
		float f;	
		Scanner sf=new Scanner (System.in);	  
		f=sf.nextFloat();
		return f;
	}
	
	
	
	// Method to read a String
	public static String readStr() {		
		String s;	
		Scanner ss=new Scanner (System.in);	  
		s=ss.nextLine();
		return s;
	
	}
	
	// Method to read a char
	public static char readChar() {
		char c;
		
		Scanner sc=new Scanner(System.in);
		c=sc.next().charAt(0);
		return c;		
	}
	
	
	
}