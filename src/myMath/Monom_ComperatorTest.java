package myMath;

import static org.junit.Assert.*;

import org.junit.Test;

public class Monom_ComperatorTest {

	@Test
	public void testCompare() {
		//test                            ////i didnt do so much tests because i used a lot if this compartor in add and etc
		Monom m1=new Monom(3,4);            //the comparator use to sort
		Monom m2=new Monom(-35,66);
		Monom m3=new Monom(53,6);
		Monom m4=new Monom(53,8);
		Polynom_able p1=new Polynom();
		p1.add(m1);
		p1.add(m2);                             //p1
		p1.add(m3);
		p1.add(m4);
		
		Monom m5=new Monom(-35,66);
		Monom m6=new Monom(48,3);                //p1 after the sort=p2
		Monom m7=new Monom(53,8);
		Monom m8=new Monom(3,4);
		Polynom_able p2=new Polynom();
		p2.add(m5);
		p2.add(m6);
		p2.add(m7);
		p2.add(m8);
		if(p2.equals(p1)) {
			fail();
		}
	}

}
