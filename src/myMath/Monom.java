
package myMath;
/**
 * This class represents a simple "Monom" of shape a*x^b, where a is a real number and a is an integer (summed a none negative), 
 * see: https://en.wikipedia.org/wiki/Monomial 
 * The class implements function and support simple operations as: construction, value at x, derivative, add and multiply. 
 * @author Boaz
 *
 */

public class Monom implements function
{

	//--------------Fields--------------------
	private double _coefficient;  
	private int _power; 


	/**
	 * A constructor that accepts values
	 * @param a
	 * @param b
	 */
	public Monom(double a, int b)
	{
		this.set_coefficient(a);
		this.set_power(b);
	}
	
	/**
	 * A copy constructor 
	 * @param ot
	 */
	public Monom(Monom ot) 
	{
		this(ot.get_coefficient(), ot.get_power());
	}


	// ***************** add your code below **********************

	/** 
	 * Calculates the function f(x)
	 * @param x
	 */
	public double f(double x)
	{
		return this._coefficient*(Math.pow(x,this._power));
	}

	/**
	 * Derivative of the current monom
	 * @return Derivative monom
	 */
	public Monom derivative() 
	{
		int p = this.get_power();
		double c = this.get_coefficient ();
		return new Monom(p*c,p-1);
	}

	/**
	 * monom addition
	 * @param m1
	 * @return
	 */
	public Monom add (Monom m1)
	{
		Monom m2 = new  Monom(m1);
		if(this._power == m2._power)
		{
			m2._coefficient= this._coefficient+m2._coefficient;
		}
		else 
		{
			System.out.println("You can't add this two Monoms");
		}
		return m2;
	}

	/**
	 * Multiply between the current monom and another monom
	 * @param m1
	 * @return
	 */
	public Monom multiply (Monom m1)
	{
		Monom m2 = new  Monom(m1);
		m2._power= m2._power+this._power;
		m2._coefficient= m2._coefficient*this._coefficient;	
		return m2;
	}

	/**
	 * returns the value of coefficient
	 * @return
	 */
	public double get_coefficient()
	{
		return this._coefficient;
	}


	/**
	 * returns the value of power
	 * @return
	 */
	public int get_power() 
	{
		return this._power ;
	}

	/**
	 * set the value of coefficient
	 * @param a
	 */
	private void set_coefficient(double a)
	{
		this._coefficient = a;
	}

	/**
	 * set the value of power
	 * @param p 
	 */
	private void set_power(int p) 
	{
		this._power = p;
	}

	/**
	 * print monom
	 * @return
	 */
	public String toString()
	{
		int temp_cefficient;
		String coefficient="";
		String monomPrint="";

		if(this._coefficient%1 == 0)
		{
			temp_cefficient = (int)this._coefficient;
			if(this.get_coefficient() >= 0)
			{
				coefficient = "+"+temp_cefficient;
			}
			else
			{
				coefficient = ""+temp_cefficient;
			}
		}
		else
		{
			if(this.get_coefficient() >= 0)
			{
				coefficient = "+"+this.get_coefficient();
			}
			else
			{
				coefficient = ""+this.get_coefficient();
			}
		}
		if(this.get_power() == 0)
		{
			monomPrint =coefficient;
			return monomPrint;
		}
		else if(this.get_power() == 1)
		{
			monomPrint =coefficient+"x";
			return monomPrint;
		}
		else
		{
			monomPrint =coefficient+"X^"+this.get_power();
			return monomPrint;
		}
	}

}
