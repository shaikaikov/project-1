package myMath;

import java.util.*;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Iterator;

import myMath.Monom;
/**
 * This class represents a Polynom with add, multiply functionality, it also should support the following:
 * 1. Riemann's Integral: https://en.wikipedia.org/wiki/Riemann_integral
 * 2. Finding a numerical value between two values (currently support root only f(x)=0).
 * 3. Derivative
 * 
 * @author Boaz
 *
 */
public class Polynom implements Polynom_able
{


	// ********** add your code below ***********
	ArrayList<Monom> MonomsList ;
	Iterator<Monom> MonomIterator;

	/**
	 * constructor that accepts a string of polynom
	 * @param str
	 * @throws PolynomException
	 */
	public Polynom(String str) throws PolynomException 
	{
		this.MonomsList = new ArrayList<Monom>();
		this.MonomIterator = MonomsList.iterator();;

		double coefficint =0;
		int power =0;
		Monom temp_monom;
		if(str == null) throw new PolynomException(" PolynomException: Polynom is null!!!");
		StringTokenizer st = new StringTokenizer(str,"+ ");
	

		while (st.hasMoreTokens())
		{
			StringTokenizer st2 = new StringTokenizer(st.nextToken(),"x^");
			if (st2.hasMoreTokens())
			{
				coefficint = (new Double(st2.nextToken()).doubleValue());	
			}
			if (st2.hasMoreTokens())
			{
				power = (new Integer(st2.nextToken()).intValue());	
			}
			else if(coefficint !=0)
			{
				power=1;
			}
			temp_monom = new Monom(coefficint,power);
			System.out.println(temp_monom);
			this.add(temp_monom);
		}
	}
	
	/**
	 * empty constructor
	 */
	public Polynom()
	{
		this.MonomsList = new ArrayList<Monom>();
		this.MonomIterator = MonomsList.iterator();;
	}

	
	/**
	 * Add m1 to this Polynom
	 * @param m1 Monom
	 */
	public void add(Monom m1)
	{
		this.MonomsList.add(m1);
		System.out.println("new monom to the list");	
	}

	/**
	 * Add p1 to this Polynom
	 * @param p1
	 */
	public void add(Polynom_able p1)
	{
		while (p1.iteretor().hasNext())
		{
			this.MonomsList.add(p1.iteretor().next());
		}
	}

	/**
	 * Subtract p1 from this Polynom
	 * @param p1
	 */
	public void substract(Polynom_able p1)
	{
		int index=0;
		Monom temp;
		while (p1.iteretor().hasNext())
		{
			temp=p1.iteretor().next();
			index =this.MonomsList.indexOf(temp);
			this.MonomsList.remove(index);
		}
	}
	

	/**
	 * Multiply this Polynom by p1
	 * @param p1
	 */
	public void multiply(Polynom_able p1)
	{
		Monom m0,m1;
		while (this.iteretor().hasNext()) 
		{
			m0 =this.iteretor().next();
			while (p1.iteretor().hasNext()) 
			{
				m1=p1.iteretor().next();
				m0.multiply(m1);
			}
		}
		
	}

	/**
	 * Test if this Polynom is logically equals to p1.
	 * @param p1
	 * @return true if this polynom represents the same function ans p1
	 */
	public boolean equals (Polynom_able p1)
	{
		Monom_Comperator comp=null;
		Monom temp1=null;
		Monom temp2=null;
		while (this.iteretor().hasNext()) 
		{
			temp1 =this.iteretor().next();
			while (p1.iteretor().hasNext()) 
			{
				temp2 =p1.iteretor().next();
				if(comp.compare(temp2, temp1)== 0)
				{
					
				}
				if((temp1.get_power() != temp2.get_power() )&&(temp1.get_coefficient() != temp2.get_coefficient()))
				{
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Test if this is the Zero Polynom
	 * @return true if it is Zero Polynom
	 */
	//------------------------בודקת האם הפולינום הוא פולינום האפס--------------------------
	public boolean isZero()
	{
		if (this.MonomsList == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//--------------------------------------------------
	/**
	 * Compute a value x' (x0<=x'<=x1) for with |f(x')| < eps
	 * assuming (f(x0)*f(x1)<=0, returns f(x2) such that:
	 * *	(i) x0<=x2<=x2 && (ii) f(x2)<eps
	 * @param x0 starting point
	 * @param x1 end point
	 * @param eps step (positive) value
	 * @return
	 */
	public double root(double x0, double x1, double eps)
	{

		return 0;
	}

	
	/**
	 * create a deep copy of this Polynum
	 * @return 
	 */
	public Polynom_able copy()
	{
		Polynom p = new Polynom();
		Monom temp=null;
		while (this.iteretor().hasNext()) 
		{
			temp =this.iteretor().next();
			p.add(temp);
		}
		return p;
	}

	
	/**
	 * Compute a new Polynom which is the derivative of this Polynom
	 * @return
	 */
	public Polynom_able derivative()
	{
		Polynom p = new Polynom();
		p.copy();
		Monom temp=null;
		while (this.iteretor().hasNext()) 
		{
			temp =(this.iteretor().next()).derivative();
			p.add(temp);	
		}
		return p;
	}

	
	public double area(double x0,double x1, double eps)
	{
		/**
		 * Compute Riemann's Integral over this Polynom starting from x0, till x1 using eps size steps,
		 * see: https://en.wikipedia.org/wiki/Riemann_integral
		 * @return the approximated area above the x-axis below this Polynom and between the [x0,x1] range.
		 */
		double side = (x1-x0)/eps;


		return 0;
	}

	//------------------------------------------------------------------------

	/**
	 *
	 */
	public double f(double x) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return an Iterator (of Monoms) over this Polynom
	 * @return
	 */
	public Iterator<Monom> iteretor() 
	{
		return MonomIterator;
	}

	//-------------הדפסת הפולינום---------------
	/** string that represents the Polynom
	 *@return 
	 */
	public String toString()
	{
		String str="";
		Monom temp;
		System.out.println("toString polynom");
		if(this.isZero())
		{
			return "0";
		}
    	while (iteretor().hasNext()) 
		{
			System.out.println(" i am in the loop");
			temp =this.MonomIterator.next();
			System.out.println(temp.toString());
			str=str+temp.toString();
			System.out.println(" i am in");
		}
		return str;
	}

}
