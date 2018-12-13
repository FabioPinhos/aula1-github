/**
 * 
 */
package course;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author pinho
 *
 */
public class ExemploconstructorGarantee extends Exemplo2{
	{
		System.out.println("blz");		
	}	
	
	public void toObject(final File file) {
		try(InputStream in = new FileInputStream(file)){
			in.read();
		}catch (final IOException e) {
			// TODO: handle exception
		}
	}
}
