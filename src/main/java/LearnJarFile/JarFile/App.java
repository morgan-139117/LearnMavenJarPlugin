package LearnJarFile.JarFile;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger LOGGER = Logger.getLogger(App.class.getName());
	
    public static void main( String[] args )
    {
    	
    	LOGGER.log(Level.INFO, "haha");
    	LOGGER.log(Level.INFO,null,"here"+"asd");
    	LOGGER.log(Level.INFO, "abc  {0},{1},{2}",new String[]{"1","2","3"});
    	LOGGER.info("this is for your info");
    	LOGGER.config("config");
    	LOGGER.fine("fine");
    	LOGGER.severe("severe");
    	LOGGER.finer("finder");
    	LOGGER.warning("warning");
        System.out.println( "Hello World!" );
    }
}
