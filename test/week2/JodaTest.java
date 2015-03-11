package week2;

import static org.junit.Assert.*;

import org.junit.Test;

public class JodaTest {
	
	@Test
	public void kuku() throws Exception {
		Joda joda = new Joda();
		String testVal = joda.convertGetDayOfWeek(joda.setDateTime(1998, 3, 9));
		assertEquals("월", testVal);
	}

}
