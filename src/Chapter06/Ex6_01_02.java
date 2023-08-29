
package Chapter06;
class SutdaCard {
	int num;
	boolean isKwang;

	public SutdaCard(int num, boolean isKwang) {
	this.num =num;
	this.isKwang = isKwang;
	}

	public SutdaCard() {
	this(1,true);
	/*이렇게 써줘도 됩니다.
	 * num =1;
	 * isKwang = true;
	 */
	}
	String info() {
		return String.format("%d%s", num, isKwang?"K":"");
	}
}

public class Ex6_01_02 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}
