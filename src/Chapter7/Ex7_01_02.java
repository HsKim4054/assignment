package Chapter7;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		/*
		 * (1) 배열 SutdaCard를 적절히 초기화 하시오.
		 */
		for(int i=0; i<CARD_NUM; i++) {
			cards[i] = new SutdaCard(i%10+1,false);
			if(i==0 || i==2 || i==7)
				cards[i] = new SutdaCard(i%10+1,true);
		}
	}
	void shuffle() {
		for(int i=0;i<1000; i++) {
			int a = (int)(Math.random()*20);
			int b = (int)(Math.random()*20);
			SutdaCard tmp = cards[a];
			cards[a] = cards[b];
			cards[b] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		return cards[(int)(Math.random()*20)];
	}
}

class SutdaCard {
	final int num;
	final boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Ex7_01_02 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for(int i=0; i < deck.cards.length;i++)
		System.out.print(deck.cards[i]+",");
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
