import java.util.ArrayList;
import java.util.List;

/**
 * @author addou
 *
 */
public class City {
	protected String cityName;
	protected List <Letter> postbox;
	protected List <Letter> sentLetters;
	protected List <Inhabitant> inhabitants;
	protected int nbDay;
	
	
public City(String cityName ) {
		
		this.cityName = cityName;
		this.postbox = new ArrayList<>();
		this.sentLetters = new ArrayList<>();
		this.inhabitants =  new ArrayList<>();		
	}
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	public List<Letter> getPostbox() {
		return postbox;
	}
	public void setPostbox(List<Letter> postbox) {
		this.postbox = postbox;
	}
	public List<Letter> getSentLetters() {
		return sentLetters;
	}
	
	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}
	public void setInhabitants(List<Inhabitant> inhabitants) {
		this.inhabitants = inhabitants;
	}
	public int getNbDay() {
		return nbDay;
	}
	public void setNbDay(int nbDay) {
		this.nbDay = nbDay;
	}
	
	
	public void sendLetter(Letter letter){
		this.postbox.add(letter);
	}
	public distributeLetters(){
		
		
		
	}
	
	

}
