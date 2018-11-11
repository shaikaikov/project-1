package myMath;

import static org.junit.Assert.*;


import org.junit.Test;

public class MonomTest {
/*
	@Test
	public void testMonomDoubleInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testMonom() {
		fail("Not yet implemented");
	}

	@Test
	public void testMonomMonom() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testGet_power() {
		//test 1
		Monom m1=new Monom(3,4);
		int acutal=4;
		assertEquals(acutal,m1.get_power());
		//test 2
		Monom m2=new Monom(5,0);
		int acutal1=4;
		assertEquals(acutal1,m1.get_power());
		//test 3
		
		Monom m3=new Monom(5,-2);
		int acutal2=-2;
		assertEquals(acutal1,m1.get_power());           ////fix it
	
	}



	@Test
	public void testGet_coefficient() {
		//test 1
		Monom m1=new Monom(0,4);
		double acutal=0;
		if(acutal!=m1.get_coefficient()) {
			fail();
		}
		//test 2
		Monom m2=new Monom(-3.3636,4);
		double acutal1=-3.3636;
		if(acutal1!=m2.get_coefficient()) {
			fail();                  
		}
         
         
				
	}
	

	@Test
	public void testF() {
		//test 1
		Monom m1=new Monom(0,4);
		double value=m1.f(0);
		double acutal=0;
		if(acutal!=value) {
			fail();
		}
		//test 2
		Monom m2=new Monom(-3.3636,4);
		double value1=m2.f(5.1);
		double acutal1=(-3.3636)*Math.pow(5.1, 4);
		if(acutal1!=value1) {
			fail();                  
		}
		
		
	}
	
	
	@Test
	public void testDerivative() {
	//test 1
		
	}
	

	@Test
	public void testAdd() {
		//test 1
		Monom m1=new Monom(3,4);
		Monom m2=new Monom(78.67,4);
		m1.add(m2);
		double coenficcent=78.67+3;
		if(coenficcent!=m1.get_coefficient()) {
		fail();
		}
		//test 2
		Monom m3=new Monom(-252,2);
		Monom m4=new Monom(3747,2);
		m3.add(m4);
		double coenficcent1=3747-252;
		if(coenficcent1!=m3.get_coefficient()) {
		fail();
		}
		
		//test 3
		Monom m5=new Monom(-252,3);
		Monom m6=new Monom(3747,2);  ////fix
		m5.add(m6);
	
		
	}




	
	@Test
	public void testMultiply() {
		//test 1
		
		Monom m1=new Monom(-3.135,4);
		Monom m2=new Monom(2.13,4);
		m1.multiply(m2);
		double coenficent=2.13*-3.135;
		int power=4+4;
		assertEquals(power,m1.get_power());
		if(m1.get_coefficient()!=coenficent) {
			fail();
		}
		
		//test 2
		
				Monom m3=new Monom(0,123);
				Monom m4=new Monom(2.13,4);
				m3.multiply(m4);
				double coenficent1=2.13*0;
				int power1=4+123;
				assertEquals(power1,m3.get_power());
				if(m3.get_coefficient()!=coenficent1) {
					fail();
				}
		
	}


	
	/*

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetminus() {
		fail("Not yet implemented");
	}

	@Test
	public void testMonomString() {
		fail("Not yet implemented");
	}

	@Test
	public void testStringToInt() {
		fail("Not yet implemented");
	}
	*/

}

















