package myMath;

import static org.junit.Assert.*;


import org.junit.Test;

public class MonomTest {


	//test for get double and int for constructor
	@Test
	public void testMonomDoubleInt() {                             //fix exception
		//test 1
		double a1=3;
		int b1=4;
		Monom m1=new Monom(3,4);
		if(a1!=m1.get_coefficient()) {
			fail();
		}
		if(b1!=m1.get_power()) {
			fail();
		}
		//test 2
		double a2=-346.436;
		int b2=35;
		Monom m2=new Monom(-346.436,35);
		if(a2!=m2.get_coefficient()) {
			fail();
		}
		if(b2!=m2.get_power()) {
			fail();
		}
	}

	@Test//-test default constructor
	public void testMonom() {
		double a=0;
		int b=0;
		Monom m1=new Monom();
		if(m1.get_coefficient()!=a) {
			fail();
		}
		if(m1.get_power()!=b) {
			fail();
		}
	}
	// copy constructor of monom
	@Test
	public void testMonomMonom() {
		//test 1                                                   //fix the exception
		Monom m1=new Monom(3,4);
		Monom m2=new Monom(m1);
		if(m1.get_coefficient()!=m2.get_coefficient()) {
			fail();
		}
		if(m1.get_power()!=m2.get_power()) {
			fail();
		}
		//test 2
		Monom m3=new Monom(-2363,0);
		System.out.println(m3.get_power());                           
		Monom m4=new Monom(m3);
		if(m3.get_coefficient()!=m4.get_coefficient()) {
			fail();
		}
		if(m3.get_power()!=m4.get_power()) {
			fail();
		}
		
		
		try {
			Monom m5 = new Monom(1,-1);
			fail();
		} catch (Exception e) {
			// TODO: handle exception
			
		}

/*
		//test 3
		try {
			Monom m5=new Monom(252,36);
			
		}
		catch(Exception E) {
			System.err.println("the power can not be negetive number");
		}
*/



	}
	@Test
	public void testGet_power() {                       //fix exception
		//test 1
		Monom m1=new Monom(35,+1);
		int acutalpower1=+1;

		if(m1.get_power()!=acutalpower1) {
			fail();
		}
		//test 2

		Monom m2=new Monom(35,47);
		int acutalpower2=47;

		if(m2.get_power()!=acutalpower2) {
			fail();
		}

	}



	@Test
	public void testGet_coefficient() {
		//test 1
		Monom m1=new Monom(0,4);
		double acutal1=0;
		if(acutal1!=m1.get_coefficient()) {
			fail();
		}
		//test 2
		Monom m2=new Monom(-3.3636,4);
		double acutal2=-3.3636;
		if(acutal2!=m2.get_coefficient()) {
			fail();                  
		}



	}


	@Test
	public void testF() {                           //fix exception
		//test 1
		Monom m1=new Monom(0,4);
		double value1=m1.f(0);
		double acutal1=0;
		if(acutal1!=value1) {
			fail();
		}
		//test 2
		Monom m2=new Monom(-3.3636,4);
		double value2=m2.f(5.1);
		double acutal2=(-3.3636)*Math.pow(5.1, 4);
		if(acutal2!=value2) {
			fail();                  
		}


	}


	@Test
	public void testDerivative() {
		//test 1
		Monom m1=new Monom(3,4);                 //fix exception
		m1.derivative();
		//after derivative// 
		double a1coe=12;
		int b1power=3;
		if(m1.get_coefficient()!=a1coe) {
			fail();
		}

		if(m1.get_power()!=b1power) {
			fail();
		}

		//test 2
		Monom m2=new Monom(-634.26,0);
		m2.derivative();
		//after derivative// 
		double a2coe=0;
		int b2power=0;
		if(m2.get_coefficient()!=a2coe) {
			fail();
		}

		if(m2.get_power()!=b2power) {
			fail();
		}

		//test 3
		Monom m3=new Monom(0,56);
		m3.derivative();
		//after derivative// 
		double a3coe=0;
		int b3power=55;
		if(m3.get_coefficient()!=a3coe) {
			fail();
		}

		if(m3.get_power()!=b3power) {
			fail();
		}
	}


	@Test
	public void testAdd() {
		//test 1
		Monom m1=new Monom(3,4);                          //fix exception
		Monom m2=new Monom(78.67,4);
		m1.add(m2);
		double coefficient1=78.67+3;
		if(coefficient1!=m1.get_coefficient()) {
			fail();
		}
		//test 2
		Monom m3=new Monom(-252,2);
		Monom m4=new Monom(3747,2);
		m3.add(m4);
		double coefficient2=3747-252;
		if(coefficient2!=m3.get_coefficient()) {
			fail();
		}

		//test 3
		Monom m5=new Monom(-252,3);
		Monom m6=new Monom(3747,2);  ////fix                    ///fix exception
		m5.add(m6);


	}





	@Test
	public void testMultiply() {
		//test 1
		Monom m1=new Monom(-4.335,4);
		Monom m2=new Monom(3,4);
		m1.multiply(m2);
		double multcoe1=3*(-4.335);
		int pluspower1=4+4;
		if(multcoe1!=m1.get_coefficient()) {
			fail();
		}
		if(pluspower1!=m1.get_power()) {
			fail();
		}

		//test 2
		Monom m3=new Monom(0,5);
		Monom m4=new Monom(7.8,0);
		m3.multiply(m4);
		double multcoe2=0*7.8;
		int pluspower2=5+0;
		if(multcoe2!=m3.get_coefficient()) {
			fail();
		}
		if(pluspower2!=m3.get_power()) {
			fail();
		}

	}



	/////return after this

	@Test
	public void testToString() {
		//test 1
		//default constructor
		Monom m1=new Monom();

		String expected1="f(x)= 0.0x^0";
		String actual1=m1.toString();
		System.out.println(expected1);
		System.out.println(actual1);
	    for(int i=0;i<expected1.length();i++) {
	    	if(expected1.charAt(i)!=actual1.charAt(i)) {
	    		fail();
	    	}
	    }
		//test 2
		Monom m2=new Monom(-3.474,15);
		String expected2="f(x)= -3.474x^15";
		String actual2=m2.toString();
		 for(int i=0;i<expected2.length();i++) {
		    	if(expected2.charAt(i)!=actual2.charAt(i)) {
		    		fail();
		    	}
		 }
	}
		
	@Test
	public void testSetminus() {
		//test 1
		Monom m1=new Monom(-34.43,4);
		m1.setminus();
		double expected1=+34.43;
		if(expected1!=m1.get_coefficient()) {
			fail();
		}
		
		//test 2
		Monom m2=new Monom(0,4);
		double expected2=0.00;
		m2.setminus();
		if(expected2!=m2.get_coefficient()) {
			fail();
		}
		//test 3
		Monom m3=new Monom(-23.63,0);
		double expected3=23.63;
		m3.setminus();
		if(expected3!=m3.get_coefficient()) {
			fail();
		}
		
	}
	/*
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


















