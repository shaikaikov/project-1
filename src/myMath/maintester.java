package myMath;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
	 * 
	 * the main
	 * 
	 * @author shai
	 *
	 */
	public class maintester {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
			
	
			StringBuilder sb=new StringBuilder();
			PrintWriter wp=new PrintWriter(new File("C:\\a\\shai.txt"));
			sb.append("htxsh");
			wp.write("12345\n");
			wp.append("tsahi");
			wp.close();
			wp.write("12345\n");
			wp.close();
			File file=new File("C:\\a\\shai.txt");
			BufferedReader br=new BufferedReader(new FileReader(file));
			String s=br.readLine();
			
			System.out.println(s);
			s=br.readLine();
			
			System.out.println(s);
			
s=br.readLine();
			
			System.out.println(s);
			
			
			
			
			
			
			
			
			
/*
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			Monom m1=new Monom(3,4);
			System.out.println("print of m1:"+m1);
			System.out.println("print of m1 coe.."+m1.get_coefficient());
			System.out.println("print of m1 power.."+m1.get_power());
			Monom m2=new Monom(m1);                                             //cheak contructions of monom and getters
			System.out.println("print of m2:"+m2);
		
			
			
			
			
			Monom m4=new Monom(6,4);                    //add and mult
			m1.add(m4);                                ///change m1 to m2+m1
			m2.multiply(m4);                           ///change m2 to m2*m4
			System.out.println("print add:"+m1);
	        System.out.println("print multiply:"+m2);
	        
	        Monom m5=new Monom(7,3);
	        m5.derivative();                                     //derivtive
	        System.out.println("print the derivative:"+m5);         
	        
	        
	        Monom m6=new Monom(5,5);
	        System.out.println("print the Monom f(x)="+m6.f(2));          ///the value of f(x)
	        
	        
	        
	        
	        
	        
	        
	        
	        //tests of polynom
	        
	        	Monom m7=new Monom(1,1);
	        	Monom m8=new Monom(-2,1);
	        	Monom m9=new Monom(3,1);
	        	Monom m10=new Monom(-4,5);
	        	Monom m11=new Monom(7,6);
	        	Monom m12=new Monom(9,8);
	        	Monom m13=new Monom(5,333);
	        	Monom m14=new Monom(111,57);
	            Monom m15=new Monom(0,0);
	        
	            
	            
	        Polynom_able p4=new Polynom();
	        Polynom_able p3=new Polynom();    
	        Polynom_able p2=new Polynom();                             ////cheack add+zero
	        Polynom_able p1=new Polynom();
	        System.out.println("print polynom 0:"+p1);
	        p1.add(m7);
	        p3.add(m15);
	        p3.add(m14);
	        System.out.println("print p3:"+p3);
	        System.out.println("print monom in polynom:"+p1);
	        p1.add(m8);
	        p2.add(m9);
	        p2.add(m10);
	        p1.add(p2);
	        
	        
	        
	        System.out.println("print p1 after add:"+ p1);
	        System.out.println("print p2:"+p2);
	        
	        
	    	Monom m16=new Monom(1,1);
	    	Monom m17=new Monom(-2,1);
	    	Monom m18=new Monom(-3,15);
	    	Monom m19=new Monom(4,5);
	    	Monom m20=new Monom(-7,15);
	    	Monom m21=new Monom(9,8);
	    	Monom m22=new Monom(-5,333);
	    	Monom m23=new Monom(111,57);
	        Monom m24=new Monom(0,0);
	        
	        
	        p3.add(m24);
	        System.out.println("print after zero to p3:"+p3);
	        p3.add(m18);                                                  //cheack minus
	        p3.add(m19);
	        p3.add(m17);
	        p4.add(m20);
	        p4.add(m21);
	        p4.add(m16);
	        p4.substract(p3);
	        System.out.println("print sustract p4-p3:"+p4);
	        System.out.println("print p3 after sustract:"+p3);
	        
	        
	        Polynom_able p6=new Polynom();                             
	        Polynom_able p5=new Polynom();
	        Polynom_able p7=new Polynom();                            
	        Polynom_able p8=new Polynom();
	        
	        
	        System.out.println("print p6 zero:"+p6);
	        p6.multiply(p5);
	    	Monom m25=new Monom(-7,15);
	    	Monom m26=new Monom(9,8);
	    	Monom m27=new Monom(-5,333);
	    	Monom m28=new Monom(111,57);
	        Monom m29=new Monom(0,0);
	        Monom m100=new Monom(8,15);
	        Monom m101=new Monom(3,444);
	        Monom m102=new Monom(2,333);
	        
	        
	        p6.add(m25);
	        p5.add(m26);
	        p5.add(m29);
	        p6.multiply(p5);
	        System.out.println("print multuply p5 p6:"+p6);
	        System.out.println("print after multuply p5:"+p5);
	        p7.add(m27);
	        p7.add(m101);
	        p7.add(m102);
	        p8.add(m100);
	        p8.add(m28);
	        p8.add(m29);
	        
	        System.out.println("print p7:"+p7);
	        System.out.println("print p8:"+p8);
	        p8.multiply(p7);
	        System.out.println("print p8*p7:"+p8);
	        System.out.println("print p7:"+p7);
	        
	        
	        Polynom_able p9=new Polynom();                             
	        Polynom_able p10=new Polynom();
	        Polynom_able p11=new Polynom();                             
	       
	      
	        Monom m30=new Monom(-7,15);
	    	Monom m31=new Monom(9,8);
	    	Monom m32=new Monom(-5,333);
	    	Monom m33=new Monom(111,57);
	        Monom m34=new Monom(0,0);
	        Monom m35=new Monom(125,59);
	        
	        p9.add(m30);
	        p9.add(m31);
	        Polynom_able p12=p9.copy();
	        p12.add(m32);
	        System.out.println("print p12 after add and copy:"+p12);    //cheak copy
	        System.out.println("print copy p9:"+p9);
	        
	        
	        System.out.println("equal p12 and p9?"+p12.equals(p9));
	        p10.add(m33);
	        p10.add(m35);
	        p11.add(m33);                                               //cheak equal
	        p11.add(m35);
	        System.out.println("equal p10 and p11?"+p11.equals(p10));
	        
	        
	        Monom m36=new Monom(-5,2);
	    	Monom m37=new Monom(111,3);
	        Monom m38=new Monom(0,0);
	        Monom m39=new Monom(125,1);
	        
	        Polynom_able p15=new Polynom(); 
	        p15.add(m36);
	        p15.add(m37);
	        p15.add(m38);
	        p15.add(m39);
	        System.out.println("print derivtive:"+p15.derivative());           //cheak devirtive
	        System.out.println("print p15 before devirtive:"+p15);
	        
	        
	        System.out.println("print f(x) of p15:"+p15.f(2));                 //cheak function
	        
	    	Monom m40=new Monom(111,3);
	        Monom m41=new Monom(0,0);
	        Monom m42=new Monom(125,1);
	        Polynom_able p16=new Polynom();                             //cheak if zero
	        p16.add(m41);
	        p16.add(m42);
	        System.out.println("p16 is zero?"+p16.isZero());
	        Polynom_able p17=new Polynom(); 
	        System.out.println("p17 is zero?"+p17.isZero());
	        p17.add(m41);
	        System.out.println("p17 is zero?"+p17.isZero());
	        
	        
	        Monom m43=new Monom(1,2);
	        Monom m44=new Monom(4,1);
	        Monom m45=new Monom(-6,0);
	        Polynom_able p18=new Polynom();
	        p18.add(m43);
	        p18.add(m44);
	        p18.add(m45);                                                //cheak root
	        System.out.println("print p18:"+p18);
	        System.out.println("print the root 1:"+p18.root(-1, 3, 1));
	        System.out.println("print the root 2:"+p18.root(2, -4, 2));
	        System.out.println("print the root 2:"+p18.root(2, -4, -2));
	     
	        
	        Polynom_able p19=p18.copy();
	        System.out.println("print p19:"+p19);
	        System.out.println("print area 1:"+p19.area(2, 3, 1));
	        System.out.println("print area 2:"+p19.area(2, 3, 0.001));              //cheak riman
	        System.out.println("print area 3:"+p19.area(2, -1, -2));
	        
			
			
			*/
			/*
			Monom m7=new Monom(1,1);
        	Monom m8=new Monom(-2,1);
        	Monom m9=new Monom(3,1);
        	Monom m10=new Monom(-4,5);
        	Monom m11=new Monom(7,6);
			Monom m1=new Monom(3,4);
			Monom m2=new Monom(4,4);
            Monom m3=m1.multiply(m2);
			Polynom_able p1=new Polynom();
			Polynom_able p2=new Polynom();
			p1.add(p2);
			System.out.println(p1);
			*/
			
		}

	}
