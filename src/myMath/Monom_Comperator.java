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

	// ******** add your code below *********
	
	public int compare(Monom o1, Monom o2)
	{
		return ((o2.get_power())-(o1.get_power()));//the bigger power first
	}

}
