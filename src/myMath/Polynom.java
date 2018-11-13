package myMath;

//package myMath;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

//import myMath.Monom;
/**
* This class represents a Polynom with add, multiply functionality, it also should support the following:
* 1. Riemann's Integral: https://en.wikipedia.org/wiki/Riemann_integral
* 2. Finding a numerical value between two values (currently support root only f(x)=0).
* 3. Derivative
* 
* @author Boaz
*
*/


/**
* this class represnt a Polynom with opreations of add,substract and multiplay and add monom.
* the object of this class is to build polynoms(notice!!)-in substract and add of polynoms i didnt puted 0*x^1
* or 0*x^2 but in multiply i puted 0*x^2 for instance.i wanted to show kinds of version of polynoms.
* in this class i based on the class of the Monom that helped me to build this class and based on comparator of Monoms class
* to compare between the monoms
* beside this in this class i have the root function that return x that near of f(x)=0.
* integral riman that calculate   rectangles of the area.
*the function that help me derivative the polynom.
*in addition deep copy that copy the polynom,equal that compare the polynoms and return boolean expression.
*iszero that return true if the polynom is zero,f(x) that return the value of x,tostring that give me string of the polynom
*and the last one is the iterator function.in the last one i get string and change him to polynom
*
* @author shai
*
*/

public class Polynom implements Polynom_able{
	private ArrayList<Monom> pol;
	private final Monom_Comperator comparmonom=new Monom_Comperator();

	public Polynom () {
		this.pol=new ArrayList<>();
		  Monom m1=new Monom(0,0);
	        this.pol.add(m1);
	}
	
	
	

  /**
   * add 
   * add polynom and change him to add with polynom able
   * the change was  with iteartor that belong p1
   * i did the itearations to equal the power of Monons
   * did add with monoms and than puted in the polynom(replace with the old monoms).
   * if the powers of the monoms are diffrents than add this to this polynom.
   * than i sorted the polynom.
   * @param p1 get polynom able to do add
   * 
   *
   */
	
	
	
	public void add(Polynom_able p1) {

		Iterator <Monom>  it=p1.iteretor();
		Monom m1;
		Monom m2;
		boolean b=true;;
		while(it.hasNext()) {
			m2=it.next();
			for(int i=0;i<this.pol.size();i++) {
				b=true;
				if(this.pol.get(i).get_power()==m2.get_power()) {
					m1=new Monom(this.pol.get(i));
					m1.add(m2);
					this.pol.set(i, m1);
					b=false;
					break;	
				}
			}
			if(b==true) {
				if(m2.get_coefficient()!=0) {
					this.pol.add(m2);
				}
			}

		}
		this.pol.sort(comparmonom);

	}
	
	/**add Mononm
	 * add monom with polynom and change the polynom and in the end sorted this
	 * if the polynom is zero so its clear
	 * @param  m1 get Monom and do the add
	 * 
	 */
	
	
	public void add(Monom m1) {
		if(this.pol.get(0).get_coefficient()==0 && this.pol.size()<2 ) {
			this.pol.clear();
		}
		for(int i=0;i<this.pol.size();i++) {
			
			if(this.pol.get(i).get_power()==m1.get_power()) {
				Monom m2=new Monom(this.pol.get(i).get_coefficient()+m1.get_coefficient(),m1.get_power());
				this.pol.set(i, m2);
				this.pol.sort(comparmonom);
				return;
			}
		}
		if(m1.get_coefficient()!=0 || this.pol.isEmpty()) {
		this.pol.add(m1);
		this.pol.sort(comparmonom);
		return;
		}
		else {
		return;
	         }
	}

	
	/**substract
	 * i will not explain to much on this function in the reason this oreation is like the add.
	 * i add function setminus that change the polynom able to minus
	 * the function is in Monom class
	 * @param  p1 get to do with him substract
	 * 
	 */
	
	
	
	public void substract(Polynom_able p1) {

		Iterator <Monom>  it=p1.iteretor();
		Monom m1;
		Monom m2;
		boolean b=true;;
		while(it.hasNext()) {
			m2= new Monom(it.next());
			m2.setminus();
			for(int i=0;i<this.pol.size();i++) {
				b=true;
				if(this.pol.get(i).get_power()==m2.get_power()) {
					m1=new Monom(this.pol.get(i));
					m1.add(m2);
					this.pol.set(i, m1);
					b=false;
					break;	
				}
			}
			if(b==true) {
				if(m2.get_coefficient()!=0) {
					this.pol.add(m2);
				}
			}

		}
		this.pol.sort(comparmonom);
		
		
	}

/**
* multiply
* i did clear to varible pol and 
* initial with 0 but before him i did copy of him and.
* than i built new Monoms and use iterator of p1.
*i did multiply of Monoms and change m3 and than do add to the function
* in the end i sorted the polynom
* 
* @param polynom able p1 to do with him multiply
*
*/
	
	
	
	
	
	public void multiply(Polynom_able p1) {

      
      Polynom_able pp=this.copy();
      Iterator<Monom> it=p1.iteretor();
      Monom m1;
      Monom m2;
      if(this.pol.get(0).get_coefficient()!=0) {
      this.pol.clear();
      Monom m4=new Monom(0,0);
      this.pol.add(m4);
      }
    while(it.hasNext()) {
  	  m1=new Monom(it.next());
  	  Iterator<Monom>it1=pp.iteretor();
         while(it1.hasNext()) {
      	   m2=new Monom(it1.next());
      	  Monom m3=new Monom(m2.get_coefficient(),m2.get_power());
      	   m3.multiply(m1);
      	   this.add(m3);
         }  
    }
    
    this.pol.sort(comparmonom);
	}
	
	
	/**equals
	 * i get polynom able p1 and equal him to this.pol.
	 * i built two iterators of p1 and this.pol
	 * if one of the polynom is long than false,also if one of Monoms is diffrent.return boolean
	 * @param p1 i get to do equal
	 * 
	 */

	public boolean equals (Polynom_able p1) {
		boolean b=true;                                 
		Iterator <Monom> pol1=this.pol.iterator();
		Iterator <Monom> p11=p1.iteretor();
		while(pol1.hasNext()) {
			Monom m1= new Monom(pol1.next());
			Monom m11=new Monom(p11.next());
			if(m1.get_coefficient()!=m11.get_coefficient() || m1.get_power()!=m11.get_power()) {
				b=false;
				break;
			}
			if(pol1.hasNext()!=p11.hasNext()) {
				b=false;
				break;	
			}
		}
		return b;
	}
	
	/**isZero
	 * check if the polynom is zero
	 * use with Iterator
	 * return boolean
	 */

	public boolean isZero() {

		boolean b=true;
		Iterator<Monom> polo=this.pol.iterator();
		while(polo.hasNext()) {
			if(polo.next().get_coefficient()!=0) {
				b=false;
				break;
			}
		}
		return b;
	}
	
	
	/**root
	 * 
	 * we find the Approximation root-x0 and x1 
	 *
	 * @param x0 represent a,x1 b and c-x2
	 * 
	 */
	
	public double root(double x0, double x1, double eps) {
		double c=0;
	
		
		                                                        //must be(f(x0)*f(x1)<0) if not-this is exception
		                                                       //* after this do (x0+x1)/2=x2-if(f(x0)*f(x2)<0)-proceed in (x0+x2)/2 else if this(f(x0)*f(x2)>0)
		                                                     // * take x2 and x1 and do (x2+x1)/2 and so on until we get |f(x2)|<eps
		try {
		
		if(this.f(x0)*this.f(x1)<0 && 0<eps) {
		double a=x0;
		double b=x1; 
		if(this.f(a)*this.f(b)<0) {
		   c=(a+b)/2;
		  while(Math.abs(this.f(c))>eps) {

			if(this.f(c)==0) {
				return this.f(c);
			}
			else if(this.f(c)*this.f(a)<0) {
				b=c;
			}
			else {
              a=c;
			}
			c=(a+b)/2;
		  }
	    }
	}
		else {
			throw new Exception();
		}
	}
		catch(Exception E) {
			c=0;
			System.err.println("this.f(x0)*this.f(x1),>0 && 0=>eps-wrong answer-the defult will be zero");
		}
		
		return c;
		
}
	/**copy
	 * deep copy of the polynom-build new polynom and copy him
	 * 
	 * @return copy polynom p
	 */

	public Polynom_able copy(){
		Polynom_able p=new Polynom();
		for(int i=0;i<this.pol.size();i++) {    
			Monom m1=new Monom(this.pol.get(i));
			p.add(m1);
		}
		return p;
	}
	
	
	/**derivative
	 * do the derivative of the polynom able and return him
	 * build new polynom and derivative monom of the polynom and add him to the new polynom
	 * 
	 * 
	 */

	public Polynom_able derivative() {
		Polynom_able p=new Polynom();
		for(int i=0;i<this.pol.size();i++) {
			Monom m1=new Monom (this.pol.get(i).get_coefficient(),this.pol.get(i).get_power());
			m1.derivative();
			p.add(m1);
		}
		return p;

	}
	
	/**area
	 * if f(x0) and f(x1) liitle than 0 exception and if eps little/equal 0 exception to
	 * Integral riman say said we do a lot of rectangles and we will get the area in range of x0 and x1
	 * xi always be bigger with eps and than i multiply this with f(xi)
	 * i start in x0 and finish in x1
	 * 
	 * @param x0 and x1 represent range and eps represent the width of the rectangle
	 * 
	 */

	@Override
	public double area(double x0, double x1, double eps) {
		double sum=0;
		try {
			
		if(0<=this.f(x0) && 0<=this.f(x1) && 0<eps) {
		double e=eps*0.00001;
		
		  for(double xi=x0;xi<x1;xi+=e) {
			sum=sum+ e*this.f(xi);
		  }
		}
		
		else {
			throw new Exception();
		}
	}
		catch(Exception E) {
			sum=-1;
			System.err.println("need to be 0<eps,f(x0) and f(x1) bigger and equal to 0 the sum will be(defult) -1");
		}
		
		return sum;
	}
	
	
	/**Iterator
	 * build new Iterator of the polynom
	 * 
	 * 
	 */
	
	
	public Iterator<Monom> iteretor(){
		Iterator<Monom> polo=this.pol.iterator();
		return polo;
	}

	
/**f(double x)
* retrun the f(x) of the polynom
* calculate with the polynom
* @param x use to calculate the polynom
* 
*/
	public double f(double x) {
		double num=0;
		for(int i=0;i<this.pol.size();i++) {

			num=num+this.pol.get(i).get_coefficient()*(Math.pow(x, this.pol.get(i).get_power()));
		}
		return num;
	}

/**toString
* return the string of the polynom
* 
* 
* 
*/
	public String toString() {
		String pol=this.pol.get(0).get_coefficient()+"x^"+this.pol.get(0).get_power();
		for(int i=1;i<this.pol.size();i++) {
			pol=pol+"+"+this.pol.get(i).get_coefficient()+"x^"+this.pol.get(i).get_power();
		}
		
		pol="f(x)="+pol;
		return pol;
	}
	
	
	/**Polynom(String s)
	 * 
	 * restart the pol to zero and if the char not "-" or not "+" add to sub after i get + or -
	 * caliculate the monom with the functions in monom class
	 * if after this i have "-" restart the sub with "-" if "+" restart sub with "" and go on after this add to the polynom and get the answer
	 * @param s get the string of the polynom
	 */
	

	
	
	
	public Polynom(String s) {
		this.pol=new ArrayList<>();
		Monom m=new Monom(0,0);
		this.pol.add(m);
		String sub="";
		Monom tmp;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!='+' && s.charAt(i)!='-'  ) {
				
				sub=sub+s.charAt(i);
			}
			
			else {
			    if(i!=0) {
				tmp=new Monom(sub);
				this.add(tmp);
			    }
				
				if(s.charAt(i)=='-') {
					sub="-";
				}
				else {
					sub="";
				}
				
			}
		}
		tmp=new Monom(sub);
		this.add(tmp);
	}
	

}
	
	


























