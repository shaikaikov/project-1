package myMath;

/** This class represents a simple "Monom" of shape a*x^b, where a is a real number and a is an integer (summed a none negative), 
* see: https://en.wikipedia.org/wiki/Monomial 
* The class implements function and support simple operations as: construction, value at x, derivative, add and multiply. 
* @author Boaz
*
*/



/** this class represent Monom of a*x^b-here i build functions of add that do plus of two Monoms,
* two Monoms that do multiply, calculate the f(x) and do derivative. in addition,  i built constructions and toString
* note that i puted exceptions in parts of the functions.
* 
* beside this i built functions that get string of monom in order to build polynom from string in class of polynom
* 
* @author shai 
*
*/




public class Monom implements function{

	
	
	
	/**
	 * construction that get coefficient and power and build the monom-throw exception if the power is negitive
	 * @param a is the coefficient of the monom 
	 * @param b  is the power of the monom.
	 */
	
	
	public Monom(double a, int b){
		

			if(b>=0) {
		    this.set_coefficient(a);
		    this.set_power(b);
	        }
			else {
				throw new RuntimeException("invalid power");
			}
	
	
}
	

	/**
	 * construction that get noting and start the monom with 0x^0
	 * 
	 */
	
	public Monom() {
		this.set_coefficient(0);
		this.set_power(0);
		}
	
	
	/**construction
	 * build new monom from old monom
	 * @param ot monom that i build new monom and copy from the old monom
	 */
	public Monom(Monom ot) {
		this(ot.get_coefficient(), ot.get_power());
	}
	
	
	
	/**
	 *  
	 * @return the power of x
	 */
	
	public int get_power() {
		return this._power;
	}

	/**
	 * return the coefficient of x
	 * @return the coe..
	 */
	public double get_coefficient() {
		return this._coefficient;
	}

	/**f(x)
	 * return f(x) with the formula of monom
	 * @param x get his param and return f(x)
	 * @return ans
	 */
	public double f(double x) {

		double answer=1458;
		answer=this._coefficient*(Math.pow(x, this._power));
		return answer;
	}

	/**derivative
	 * do the derivative of the monom-that clear and i dont need to explain more
	 * 
	 */
	public void derivative() {
		
		if(this._power>=1) {
			this._coefficient=this._coefficient*this._power;
			this._power=this._power-1;
		}
		else if(this._power==0) {

			this._coefficient=0;
		}
	}
	
	/**add
	 * here I use add of two monoms-if the power are equal do the add else its error
	 * @param m1 is monom the i do with him the add
	 */

	public void add(Monom m1) {
		try {
			if(this._power==m1._power) {
				this._coefficient=this._coefficient+m1._coefficient;
			}
			else {
				throw new Exception();
			}
		}
		catch (Exception e) {
			System.err.println("no plus of coefficient of monoms");
		}

	}
	
	/**multiply
	 * here I use the multiply of two monoms-first the multiply of coefficient and than do the add of the powers
	 * @param m1 is monom the i do with him the multiply
	 */

	public void multiply(Monom m1) {
		this._coefficient=this._coefficient*m1._coefficient;
		this._power=this._power+m1._power;
	}
	
	
	/**toString
	 * print the formula of monom
	 * 
	 */

	public String toString() {
	return  "f(x)= "+this._coefficient+"x^"+this._power;
	}


	/////more function

	
	/**setminus
	 * function setminus that use to change the polynom to minus 
	 * if the coefficient is zero  dont set minus
	 * sue fo subtract in polynom able class
	 */
	public void setminus() {
		if(this._coefficient!=0) {
		this._coefficient=this._coefficient*(-1);
		this._power=this._power;
		}
	}
	
	
	/**Monom(String s)
	 * 
	 * here i get string s if i get char in x go to stringToInt and do it to number after that do num
	 * if i have "-" take him too and the - will go to the coefficient
	 * to empty- and add the power after this the monom will be the number
	 * 
	 * @param s the string of the monom
	 */
	
	public Monom(String s) {
		
			
		double m=0;
		int n = 0;
		int q=0;
		String num="";
		char ch='-';
		if(ch==s.charAt(0)) {
			ch='-';
		}
		else {
			ch='n';
		}
		
		
		
		
		for (int i = 0; i < s.length(); i++) {
			if(q==0) {
				if(s.charAt(i)!='x') {
					num=num+s.charAt(i);
				}
					if(i==s.length()-1 && s.charAt(i)!='x') {
						q=1;
					
					}
					if(s.charAt(i)=='x') {
						q=1;
						
					}
						
				}
				
			if(q==1) {
			
				
				m=stringToInt(num);
				num="0";
				
				if(i==s.length()-1 && s.charAt(i)=='x') {
					i=i+0;
					num="1";
				}
				if(s.charAt(i)=='x') {
					if(i==s.length()-1) {
						num="1";
						
					}
					else {
					q=2;
					i=i+2;
					num="";
				}
					}
			
				
					  }
			
			if(q==2){
				num=num+s.charAt(i);
			}
		}
		
		
		n=(int)stringToInt(num);
		if(ch=='-') {
		this._coefficient=-m;
		this._power=n;
		}
		else {
			this._coefficient=m;
			this._power=n;
          }
		
}
		
		/**stringToInt(String s)
		 * get the string-caliculate untill "." and than after this caliculate tne number again
		 * its calaiculate the power too
		 * 		
		 * @param s to turn to number
		 */
			

	
	public double stringToInt(String s) {
    
		
		double num=0;
		boolean flag=true;
		int count=1;
		for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)!='-') {
			if(flag==true && s.charAt(i)!='.') {
				num=num+(s.charAt(i)-48);
				
				if(i!=s.length()-1 && s.charAt(i+1)!='.')
					num=num*10;
				
			}
			else {
				flag=false;
			}
			
			if(flag==false&&s.charAt(i)!='.') {
				num=num+(s.charAt(i)-48)/(Math.pow(10, count));
				count++;
				
			}
		}


		}
		
		return num;
	  }
		
	
	//****************** Private Methods and Data *****************

	/**
	 * the setters of the variables
	 * 
	 */
	
	private void set_coefficient(double a){
		this._coefficient = a;
	}
	private void set_power(int p) {
		this._power = p;
	}


	/**
	 * the private variabls
	 * 
	 */
	private double _coefficient; // 
	private int _power;

}






