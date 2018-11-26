/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9 - Singleton Problems
 * Date: 2017-11-11
 * 
 * @author Navya Inampudi
 * 
 */
package HW9.edu.fsu.csc7400.patterns.singleton;

/**
 * Subclassed singleton. Will set the state to different value
 * 
 * @author orlando
 * @author ninampudi
 */
public class SubClassSingleton extends BaseSingleton {

	/**
	 * Simple function that sets state
	 * 
	 * When we override the parent method, we shall match the method name, as they are case-sensitive. 
	 * Hence producing the error. Corrected the same.
	 */
	@Override
	public void doSomething() {
		setSomeState(2);
	}

	/**
	 * This is a new function which will print a message
	 * 
	 * @returns 100
	 */
	public int newFunction() {
		System.out.println("NewFunction printout");
		return 100;
	}

	/**
	 * Single constructor must be private
	 * 
	 * Since the constructors in the singleton is private, the super constructor is not visible. Hence the code will not compile.
	 * To fix this make the Parent constructor to Protected from Private.
	 */
	public SubClassSingleton() {
	}
	
	/**
	 *  Holds singleton instance of type SubClassSingleton
	 */
	private static SubClassSingleton instance;
	
	/**
	 * Singleton instance creation. Use the getInstance to create instance for SubClassSingleton
	 * @return singleton instance
	 */
	public static synchronized BaseSingleton getInstance() {
			if (instance == null)
				instance = new SubClassSingleton();
			return instance;
	}
	
}
