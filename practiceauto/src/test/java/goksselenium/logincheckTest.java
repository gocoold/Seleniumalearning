package goksselenium;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

public class logincheckTest extends Utilities {
	
	@Test
	public void usernamecheck() throws IOException
	{
		login();
		System.out.println("Username Test completed");
		
	}


}
