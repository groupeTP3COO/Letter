/**
 * 
 */
package city;

import java.util.List;

import letter.Letter;

/**
 * @author user
 *
 */
public class CityForTest extends City {
	
	/**
	 * @param cityName
	 * @param inhabitants
	 */
	public CityForTest(String cityName, List<Inhabitant> inhabitants) {
		super(cityName, inhabitants);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cityName
	 */
	public CityForTest(String cityName) {
		super(cityName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendLetter(Letter<?> letter) {
		this.postBox.add(letter);
	}
	
	

}
