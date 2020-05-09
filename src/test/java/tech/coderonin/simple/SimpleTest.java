package tech.coderonin.simple;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleTest{

	@Test
	public void defaultTest(){
		System.out.println( "Default Test" );

		String version = "1.0";
		Simple s = new Simple(version);
		assertNotNull("Should instantiate a non-null Simple object", s );
		assertEquals( "Should instantiate a Simple object with the expected Version", version, s.getVersion() );
	}
}
