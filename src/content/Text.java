/**
 * 
 */
package content;

/**
 * @author user
 *
 */
public class Text implements Content {
	
	String ContentOfText;
	
	public Text(String ContentOfText) {
		this.ContentOfText = ContentOfText;
	}
	
	public String toString(){
		return this.ContentOfText;
	}
}
