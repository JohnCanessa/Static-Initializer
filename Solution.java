import java.util.Scanner;


/*
 * 
 */
class MyClass {

	// **** ****
	static boolean firstPass	= true;
	
	// **** constructor ****
	public MyClass() {
	}
	
	// **** ****
	public int doSomething(int arg) {
		
//		// **** ****
//		static boolean firstPass = true;
		
		// **** initialization ****
		int retVal = 0;

		// **** ****
		if (firstPass) {
			
			// ???? ????
			System.out.println("\ndoSomething <<< do this ONCE! arg: " + arg);
			
			// **** ****
			firstPass = false;
		}
		
		// **** always do this ****
		System.out.println("doSomething <<< ALWAYS do this... arg: " + arg);
		
		// **** inform the caller what went on ****
		return retVal;
	}
}


/*
 * 
 */
public class Solution {

	/*
	 *  static blocks are executed before constructors
	 *  
	 *  in most situations static variables should be avoided
	 *  therefore static initialization blocks are generally not a great idea
	 */
	
	// **** open scanner ****
	static Scanner sc 	= new Scanner(System.in);
	
	// **** initial values ****
	static int B		= sc.nextInt();
	static int H		= sc.nextInt();
	static boolean flag	= false;

	/*
	 * static initializer
	 */
	static {
		
//		// ???? ????
//		System.out.println("static block <<< B: " + B + " H: " + H);

		// **** update flag or display message ****
		if ((B > 0) && (H > 0))
			flag = true;
		else
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		
//		// ???? ????
//		System.out.println("static block <<< flag: " + flag);
		
		// **** close scanner ****
		sc.close();
	}
	
	
	/*
	 * Test scaffolding.
	 */
	public static void main(String[] args) {

		// **** ****
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
	
//		// ???? ????
//		System.exit(0);
		
		
		// **** instantiate an object ****
		MyClass myClass = new MyClass();
		
		// **** ****
		myClass.doSomething(1);
		
		// **** :::: ****
		
		// **** ****
		myClass.doSomething(2);
		
		// **** instantiate a different object ****
		MyClass secondInstance = new MyClass();
		
		// **** ****
		secondInstance.doSomething(3);
	}

}
