import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {
	
	static final Logger LOG = LogManager.getLogger(HelloWorld.class);
//	//final make a variable behave as a constant
//	final double pi = 3.14; //this value can no longer be changed
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!!");
		
		LOG.trace("trace logged");
		LOG.info("info logged"); //used while entering and exiting a method PRODUCTION MODE
		LOG.debug("debug logged"); //DEVELOPMENT MODE
		LOG.warn("warn logged");
		LOG.error("error logged"); // used in the catch block
		LOG.fatal("fatal logged");

	}

}
