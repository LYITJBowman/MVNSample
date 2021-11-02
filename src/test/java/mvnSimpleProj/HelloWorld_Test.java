/**
 * 
 */
package mvnSimpleProj;

import static org.junit.Assert.*;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


/**
 * @author james
 *
 */
public class HelloWorld_Test {

	/**
	 * Test method for {@link mvnSimpleProj.App#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		App.main(null);
		assertEquals("Hello LYIT!" + System.getProperty("line.separator"),outContent.toString());
	}

}
