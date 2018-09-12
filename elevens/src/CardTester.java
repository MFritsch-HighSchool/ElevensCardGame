/**
 * @author Matthew Fritsch
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c = new Card("Ace", "Hearts", 1);
		Card c2 = new Card("Ace", "Hearts", 2);
		System.out.println(c.matches(c2));
		System.out.println(c.rank());
		System.out.println(c.suit());
		System.out.println(c.pointValue());
		System.out.println(c.toString());
	}
}
