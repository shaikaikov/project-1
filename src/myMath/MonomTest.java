package myMath;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonomTest {

	@Test
	void test() {
		Monom m=new Monom(3,4);
		//assert.assertArrayEquals(m.f(2), 48);
		if(m.f(2)!=48){
			fail("Not yet implemented");
			
		}
		
	}


}
