package log4jexamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Sample {

	static Logger log = Logger.getLogger(Sample.class);


	public static void main (String args[] ) {
		BasicConfigurator.configure();		

			log.info("Hello");
			log.warn("Don't");
			log.error("Error");
			log.fatal("Fatal");
			log.debug("Debugged");

	}
	
}
