package junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1Test {

	@Test
	public void testStringconcat() {
	Demo1 d=new Demo1();
	assertEquals("HelloWorld",d.stringconcat("Hello", "World"));
	}

}
