package myMath;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class PolynomTest {
/*
	@Test
	public void testPolynom() {
		fail("Not yet implemented");
	}
	*/
    ///first i did tests for the copy and equal and add-monom in order to used them to the nexts functions.
	
	@Test
	
	public void testAddPolynom_able() {
		//test 1
		Monom m1=new Monom(-3.437,4);
		Monom m2=new Monom(2636,3);
		Monom m3=new Monom(-3.437,3);
		Monom m4=new Monom(-437,4);
		Polynom_able p1=new Polynom();
		p1.add(m1);
		p1.add(m2);
		Polynom_able p2=new Polynom();
		p2.add(m4);
		p2.add(m3);
		p1.add(p2);
		Monom mactual1=new Monom(-437-3.437,4);
		Monom mactual2=new Monom(2636-3.437,3);
		
		Polynom_able p3=new Polynom();   //p1+p2
		p3.add(mactual1);
		p3.add(mactual2);
		if(p1.equals(p3)!=true) {
			fail();
		}
		//test if p1!=p2
		Monom m5=new Monom(325,58);
		p1.add(m5);
		if(p1.equals(p2)==true) {
			fail();
		}
		
		//test 2
		Monom m6=new Monom(438,4);
		Monom m7=new Monom(236,8);
		Monom m8=new Monom(-3.437,2);
		Monom m9=new Monom(-437,4);
		Monom m10=new Monom(-163,24);
		Monom m11=new Monom(0,4);
		Monom m12=new Monom(0,7324);
		Monom m14=new Monom(3,0);
		Monom m15=new Monom(3,3273);
		Polynom_able p4=new Polynom();
		p4.add(m6);
		p4.add(m7);
	
	
		Polynom_able p5=new Polynom();
		p5.add(m8);
		p5.add(m9);
		p5.add(m10);
		p5.add(m11);
		p5.add(m12);
		p5.add(m14);
		p5.add(m15);
		
		p4.add(p5);
		
		Monom mactual3=new Monom(-437+438+0,4);
		Monom mactual4=new Monom(236,8);
		Monom mactual5=new Monom(-3.437,2);
		Monom mactual6=new Monom(-163,24);
		Monom mactual7=new Monom(0,7324);
		Monom mactual8=new Monom(3,0);
		Monom mactual9=new Monom(3,3273);
		Polynom_able p6=new Polynom();   //p1+p2
		p6.add(mactual3);
		p6.add(mactual4);
		p6.add(mactual5);
		p6.add(mactual6);
		p6.add(mactual7);
		p6.add(mactual8);
		p6.add(mactual9);
		
		if(p4.equals(p6)!=true) {
			fail();
		}
		//test 3
		
		Monom m16=new Monom(438,4);
		Monom m17=new Monom(236,8);
		Monom m18=new Monom(-3.437,2);
		Monom m19=new Monom(0,574);
		Polynom_able p7=new Polynom(); //polynom zero
		Polynom_able p8=new Polynom(); 
		Polynom_able p9=new Polynom();
		p8.add(m19);
		p9.add(m16);
		p9.add(m18);
		p9.add(m17);
		p9.add(p7);
		
		Monom m20=new Monom(438,4);
		Monom m21=new Monom(236,8);
		Monom m22=new Monom(-3.437,2);
		Polynom_able p10=new Polynom();    //end of polynom
		p10.add(m20);
		p10.add(m21);
		p10.add(m22);
		
		if(p10.equals(p9)!=true) {
			fail();
		}
		p9.add(p8);
		if(p10.equals(p9)!=true) {
			fail();
		}
		
		
		
	}
	
	
	@Test
	public void testAddMonom() {
		//test 1
		Monom m=new Monom(0,0);
		Monom m1=new Monom(438,4);
		Monom m2=new Monom(236,8);
		Monom m3=new Monom(-3.437,2);
		Monom m4=new Monom(-437,4);
		Monom m5=new Monom(-163,24);
		Monom m6=new Monom(0,4);
		Monom m7=new Monom(0,7324);
		Monom m8=new Monom(3,4);
		Monom m9=new Monom(3,4);
		Polynom_able p1=new Polynom();
		Monom m10=new Monom(3+3+0-437+438,4);
		Monom m11=new Monom(236,8);
		Monom m12=new Monom(0,7324);
		Monom m13=new Monom(-3.437,2);
		Monom m14=new Monom(-163,24);
		Monom m15=new Monom (0,0);
		p1.add(m10);                   //p2 after the adds need to be equal to p1
		p1.add(m11);
		p1.add(m12);
		p1.add(m13);
		p1.add(m14);                     //fix with zero in start
		
		Polynom_able p2=new Polynom();
		p2.add(m1);
		
		p2.add(m2);
		p2.add(m3);
		p2.add(m4);
		p2.add(m5);
		p2.add(m6);
		p2.add(m7);
		p2.add(m8);
		p2.add(m9);
	    if(p1.equals(p2)!=true) {
	    	fail();
	    }
		
		
		
	}
	
	

	@Test
	public void testSubstract() {
		
		//test 1
				Monom m1=new Monom(-734.437,4);
				Monom m2=new Monom(246.437,3);
				Monom m3=new Monom(-3.437,3);
				Monom m4=new Monom(-437,4);
				Polynom_able p1=new Polynom();
				p1.add(m1);
				p1.add(m2);
				Polynom_able p2=new Polynom();
				p2.add(m4);
				p2.add(m3);
				p1.substract(p2);
				Monom mactual1=new Monom(-734.437+437,4);
				Monom mactual2=new Monom(246.437+3.437,3);
				
				Polynom_able p3=new Polynom();   //p1-p2
				p3.add(mactual1);
				p3.add(mactual2);
				if(p1.equals(p3)!=true) {
					fail();
				}
				
				//test if p1!=p2
				Monom m5=new Monom(325,58);
				p1.add(m5);
				if(p1.equals(p2)==true) {
					fail();
				}
				
				
				//test 2
				Monom m6=new Monom(438,4);
				Monom m7=new Monom(236,8);
				Monom m8=new Monom(-3.437,2);
				Monom m9=new Monom(-437,4);
				Monom m10=new Monom(-163,24);
				Monom m11=new Monom(0,4);
				Monom m12=new Monom(0,7324);
				Monom m14=new Monom(3,0);
				Monom m15=new Monom(3,3273);
				Polynom_able p4=new Polynom();
				p4.add(m6);
				p4.add(m7);
			
			
				Polynom_able p5=new Polynom();
				p5.add(m8);
				p5.add(m9);
				p5.add(m10);
				p5.add(m11);
				p5.add(m12);
				p5.add(m14);
				p5.add(m15);
				
				p4.substract(p5);
				
				Monom mactual3=new Monom(+437+438-0,4);
				Monom mactual4=new Monom(236,8);
				Monom mactual5=new Monom(+3.437,2);
				Monom mactual6=new Monom(+163,24);
				Monom mactual7=new Monom(0,7324);
				Monom mactual8=new Monom(-3,0);
				Monom mactual9=new Monom(-3,3273);
				Polynom_able p6=new Polynom();   //p1-p2
				p6.add(mactual3);
				p6.add(mactual4);
				p6.add(mactual5);
				p6.add(mactual6);
				p6.add(mactual7);
				p6.add(mactual8);
				p6.add(mactual9);
				
				if(p4.equals(p6)!=true) {
					fail();
				}
				
				//test 3
				
				Monom m16=new Monom(438,4);
				Monom m17=new Monom(236,8);
				Monom m18=new Monom(-3.437,2);
				Monom m19=new Monom(0,574);
				Polynom_able p7=new Polynom(); //polynom zero
				Polynom_able p8=new Polynom(); 
				Polynom_able p9=new Polynom();
				p8.add(m19);
				p9.add(m16);
				p9.add(m18);
				p9.add(m17);
				p9.substract(p7);
				
				Monom m20=new Monom(438,4);
				Monom m21=new Monom(236,8);
				Monom m22=new Monom(-3.437,2);
				Polynom_able p10=new Polynom();    //end of polynom
				p10.add(m20);
				p10.add(m21);
				p10.add(m22);
				
				if(p10.equals(p9)!=true) {
					fail();
				}
				p9.substract(p8);
				if(p10.equals(p9)!=true) {
					fail();
				}
				
				
				
			}

	@Test
	public void testMultiply() {
	//test 1
		Monom m1=new Monom(0,0);
		Monom m2=new Monom();                 ///0*0 polynoms
		Polynom_able p1=new Polynom();
		Polynom_able p2=new Polynom();
		p1.add(m1);
		p1.multiply(p2);
		Polynom_able p3=new Polynom();
		if(p1.equals(p3)!=true) {
			fail();
		}
		//test 2
		Monom m3=new Monom(-548,37);
		Monom m4=new Monom(236,373);            //p2=0 p1!=0
		Monom m5=new Monom(125,3);
		p1.add(m3);
		p1.add(m4);
		p1.add(m5);
		p1.add(m2);
		p1.multiply(p2);
		if(p1.equals(p3)!=true) {
			fail();
		}
		
		//test 3
		Monom m6=new Monom(236,0);
		
		Monom m9=new Monom(-56,6);
		Monom m10=new Monom(53,7);          
		Polynom_able p4=new Polynom();
		p4.add(m6);
		                                                    ///polynom p4
		p4.add(m9);
		p4.add(m10);
		
		Monom m11=new Monom(-53,575);
		Monom m12=new Monom(24,2);                     ///polynom p4
		Polynom_able p5=new Polynom();
		p5.add(m11);
		p5.add(m12);
		
		p4.multiply(p5);                   ///p4*p5
		
		
		Monom m13=new Monom(-2809,582);
		Monom m14=new Monom(2968,581);          
		Monom m15=new Monom(-12508,575);
		Monom m16=new Monom(1272,9);
		Monom m17=new Monom(-1344,8);     
		Monom m18=new Monom(5664,2);             ////p4*p5=p6
		Polynom_able p6=new Polynom();
		p6.add(m13);
		p6.add(m14);
		p6.add(m15);
		p6.add(m16);
		p6.add(m17);
		p6.add(m18);
		if(p6.equals(p4)!=true) {
			fail();
		}
		
	}

	@Test
	public void testEqualsPolynom_able() {
		//test 1
		Polynom_able p1=new Polynom();
		Polynom_able p2=new Polynom();
		Monom m1=new Monom(3,4);
		Monom m2=new Monom(3,4);
		p1.add(m1);
		p2.add(m2);
		if(p1.equals(p2)!=true) {
			fail();
		}
		//test 2
		Polynom_able p3=new Polynom();
		Polynom_able p4=new Polynom();
		if(p3.equals(p4)!=true) {
			fail();
		}
		//test 3
		Monom m3=new Monom(3.437,4);
		Monom m7=new Monom(53,4);
		p3.add(m3);
		if(p3.equals(p4)==true) {
			fail();
		}
		//test 4
		
		Monom m4=new Monom(62.347,632);
		Monom m5=new Monom(125,63);
		Monom m6=new Monom(125,63);
		Polynom_able p5=new Polynom();
		Polynom_able p6=new Polynom();
		p5.add(m5);
		p6.add(m6);
		p6.add(m4);
		if(p5.equals(p6)==true) {
			fail();
		}
		
	}
	
	

	@Test
	public void testIsZero() {
		//test 1
		Polynom_able p1=new Polynom();
		if(p1.isZero()!=true) {
		fail();
		
		}
		//test 2
		Monom m1=new Monom();   //default monoms=0
		Monom m2=new Monom();
		p1.add(m1);
		p1.add(m2);
		if(p1.isZero()!=true) {
			fail();
		}
		//test 3
		Monom m3=new Monom(4,3);
		p1.add(m3);
		if(p1.isZero()==true) {
			fail();
		}
		
	}

	@Test
	public void testRoot() {
		//test 1
		Monom m1=new Monom(1,2);
		Monom m2=new Monom(-4,1);
		Monom m3=new Monom(-5,0);
		Polynom_able p1=new Polynom();
		p1.add(m1);
		p1.add(m2);                                    //Polynom p1
		p1.add(m3);
		
		double actual1=p1.root(0, 15, 20);
		double expected1=3.75;                         //root for |f(3.75)|<20
		if(expected1!=actual1) {
			fail();
		}
		double actual2=p1.root(0, 15, 3);
		double expected2=4.6875;                        //root for |f(4.6875)|<3
		if(expected2!=actual2) {
			fail();
		}
		double actual3=p1.root(0, 15, 20);              //unequal
		double unexpected3=4.6875;
		if(unexpected3==actual3) {
			fail();
		}
		double actual5=  p1.root(4, 10, 4);           
		double unexpected5=5.5;                        //root f(5.5)<4
		if(unexpected5!=actual5) {
			fail();
		}
		
		
		//test 2
		try {
			double actual4=p1.root(10, 15, 20);             ///f(10)*f(15)>0
			fail();
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		//test 3
		
		try {
			double actual6=p1.root(2, 3, 20);             ///f(2)*f(3)<0
			fail();
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		//test 4
		
		double actual7=  p1.root(-10, 3, 4);           
		double unexpected7=-0.25;                       
		if(unexpected7!=actual7) {
			fail();
		}
	
	}

	@Test
	public void testCopy() {
		
		Monom m1=new Monom(3,0);
		Monom m2=new Monom(-336,236);
		Monom m3=new Monom(-24,4);
		Monom m4=new Monom(5,8);
		Polynom_able p1=new Polynom();
		p1.add(m1);
		p1.add(m2);
		p1.add(m3);
		Polynom_able p2=p1.copy();
		if(p1.equals(p2)!=true) {
			fail();
		}
		//test if p2 and p1 do not go to the same memory.
		p1.add(m4);
		if(p1.equals(p2)==true) {
			fail();
		}
	}


	@Test
	public void testDerivative() {
	//test 1

    Monom m1=new Monom();                 ///cheak if Derivative is zero
    Polynom_able p1=new Polynom();
    Polynom_able p=p1.derivative();
    Polynom_able p2=new Polynom();
    if(p.equals(p2)!=true) {
    	fail();
    }
    p1.add(m1);
    Polynom_able p0=p1.derivative();
    if(p0.equals(p2)!=true) {
    	fail();
    }
    Monom m2=new Monom(3,4);
    p1.add(m2);
    if(p1.equals(p2)==true) {
    	fail();
    }
    
    //test 2
    Monom m3=new Monom(374.362,54);
    Monom m4=new Monom(24,78);
    Monom m5=new Monom(0,4);
    Monom m6=new Monom(0,0);                        //polynom p3
    Monom m7=new Monom(-57.865,7);
    Monom m8=new Monom(5,0);
    Polynom_able p3=new Polynom();
    
    p3.add(m3);
    p3.add(m4);
    p3.add(m5);
    p3.add(m6);
    p3.add(m7);
    p3.add(m8);
  
    
    
    Monom m9=new Monom(374.362*54,53);
    Monom m10=new Monom(24*78,77);
    Monom m11=new Monom(0*4,3);
    Monom m13=new Monom(-57.865*7,6);
    Monom m14=new Monom(5*0,0);
    Polynom_able p4=new Polynom();
    p4.add(m9);                                  //p3 after derivative=p4
    p4.add(m10);
    p4.add(m11);
    p4.add(m13);
    p4.add(m14);
    Polynom_able p5=  p3.derivative();            //p3 after derivative=p5
    if(p4.equals(p5)!=true) {                       //equal
    	fail();
      }
	}
	
	@Test
	public void testArea() {
		//test 1
		Monom m1=new Monom(3,1);
		Monom m2=new Monom(3,2);
		Monom m3=new Monom(-85.352,0);
		Polynom_able p1=new Polynom();
		p1.add(m1);
		p1.add(m2);
		p1.add(m3);
		int actual1=(int)p1.area(10, 15, 20);
		int expected1=2135;
		if(actual1!=expected1) {
			fail();
		}
		//test 2
	
		
		try {
			double actual2=p1.area(2, 3, 20);           //f(2) and f(3)<0
			fail();
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		try {
			double actual3=p1.area(2, 10, 20);           //f(2)<0 and f(10)>0
			fail();
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		//test 3
        Monom m4=new Monom(1,2);
        Polynom_able p2=new Polynom();
        p2.add(m4);
    	int actual4=(int)p2.area(4, 5, 5);     ///last test for x^2
		int expected4=20;
		if(actual4!=expected4) {
			fail();
		}
		//test 4
		
		int actual5=(int)p2.area(0, 0, 10);
		int expected5=0;                           //test for area zero
		if(actual5!=expected5) {
			fail();
		}
		
	}


	@Test
	public void testIteretor() {
		Monom m1=new Monom(3,1);
		Monom m2=new Monom(3,2);
		Monom m3=new Monom(-85.352,0);
		Polynom_able p1=new Polynom();
		p1.add(m1);
		p1.add(m2);
		p1.add(m3);
		
		Iterator<Monom> p2=p1.iteretor();
		Monom m4=new Monom(3,1);
		Monom m5=new Monom(3,2);
		Monom m6=new Monom(-85.352,0);
		Polynom_able p3=new Polynom();
		p3.add(m4);
		p3.add(m5);
		p3.add(m6);
		if(m4!=p2.next()||m5!=p2.next()||m6!=p2.next()) {
			fail();
		}
	}

	@Test
	public void testF() {
		//test 1

	    Monom m1=new Monom();                 ///cheak polynom zero if value zero
	    Polynom_able p1=new Polynom();
        double zero=0;
        if(zero!=p1.f(0)) {
        	fail();
        }
        p1.add(m1);
        if(zero!=p1.f(0)) {
        	fail();
        }
        
        //test 2
        Monom m2=new Monom(-437,0);
        Monom m3=new Monom(0,0);
        Monom m4=new Monom(0,764);
        Monom m5=new Monom(-532,67);
        Monom m6=new Monom(2,3);
        Polynom_able p2=new Polynom();
        p2.add(m2);                                       //x=-7
        p2.add(m3);
        p2.add(m4);
        p2.add(m5);
        p2.add(m6);
        double actual1=-437*(Math.pow(-7,0))+0*(Math.pow(0, 764))+-532*(Math.pow(-7, 67))+2*(Math.pow(-7, 3));
        if(actual1!=p2.f(-7)) {
        	fail();
        }
	}

	@Test
	public void testToString() {
		    //test 1
		    Monom m2=new Monom(-437,0);
	        Monom m3=new Monom(0,0);
	        Monom m4=new Monom(0,764);
	        Monom m5=new Monom(-532.45,67);
	        Monom m6=new Monom(2,3);
	        Polynom_able p1=new Polynom();
	        p1.add(m2);                                             ///cheak equal strings
	        p1.add(m3);
	        p1.add(m4);
	        p1.add(m5);
	        p1.add(m6);
	        String actual1=p1.toString();
	        
	        String expected1="f(x)=-532.45x^67+2.0x^3+-437.0x^0";
	        for(int i=0;i<expected1.length();i++) {
		    	if(expected1.charAt(i)!=actual1.charAt(i)) {
		    		fail();
		    	}
		    }
	        //test 2
	        boolean flag=true;
	        String expected2="f(x)=-532.45x^67+347.548x^3+-437.0x^0";             ///cheak unequal strings
	        for(int i=0;i<expected2.length();i++) {
		    	if(expected2.charAt(i)!=actual1.charAt(i)) {
		    		flag=true;
		    		
		    	}
		    	else {
		    		flag=false;
		    		break;
		    	}
		    	if(flag==false) {
		    		fail();
		    	}
	  
	}
	/*

	@Test
	public void testPolynomString() {
		fail("Not yet implemented");
	}
	*/

   }
}
