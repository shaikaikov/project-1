package myMath;

import java.util.Comparator;

/**Monom_Comperator
 * do compare between two monoms and do the sort from the big power to the little
 * 
 * 
 * @author shai
 *
 */


public class Monom_Comperator implements Comparator<Monom> {


	public int compare(Monom m1,Monom m2) {
		if(m1.get_power()>m2.get_power()) {
			return -1;
		}
		else if(m1.get_power()==m2.get_power()) {
			return 0;
		}
		else {
			return 1;
		}
	}
	

}
