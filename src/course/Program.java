/**
 * 
 */
package course;

/**
 * @author pinho
 *
 */
public class Program {


	
	public static void main(String[] args) {
		ExemploconstructorGarantee n = new ExemploconstructorGarantee();
	}
	
	public Program(String arg1, String arg2) {
		
	}
	
	public Program(String arg1) {
		this(arg1, "args2");
	}
	
}
