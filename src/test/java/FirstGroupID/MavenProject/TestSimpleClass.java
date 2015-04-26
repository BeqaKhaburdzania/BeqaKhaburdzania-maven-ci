package FirstGroupID.MavenProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSimpleClass {
	@Test
	public void TestGetInt(){
		int temp = 5;
		SimpleClass curr = new SimpleClass(temp);
		int forCompare = curr.GetInt();
		assertEquals(temp,forCompare);
	}
}
