package FirstGroupID.MavenProject;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import org.junit.Test;

public class TestSimpleClass {
	@Test
	public void TestGetInt(){
		int temp = 5;
		SimpleClass curr = new SimpleClass(temp);
		int forCompare = curr.GetInt();
		assertEquals(temp,forCompare);
	}
	
	@Test
	public void TestWithMock(){
		int sameResultAlways = 10;
		SimpleClass temp = mock(SimpleClass.class);
		when(temp.GetInt()).thenReturn(sameResultAlways);
		assertEquals(temp.GetInt(),sameResultAlways);
	}

}
