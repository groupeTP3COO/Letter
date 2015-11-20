/**
 * 
 */
package content;

/**
 * @author user
 * 
 *         this class represent the text in a letter
 */
public class Text implements Content {

	String ContentOfText;

	public Text(String ContentOfText) {
		this.ContentOfText = ContentOfText;
	}

	public String toString() {
		return this.ContentOfText;
	}
}
