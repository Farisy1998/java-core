package interfaces;

public interface Car {
	// Internally the JVM will make every method in a interface as public and
	// abstract
	
	// In java, the interface can hold public, abstract, static and default methods
	// Also, the interface will hold public, static and final data members
	
	void go();

	void stop();
}
