package chapter07;

public class Ex7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();

	}

}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;

	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 "+p.toString()+"을/를 살수 없습니다.");
			return;
		}
		this.money -= p.price;
		add(p);
	}

	void add(Product p) {
		if(i>=cart.length) {
			Product[] temp = new Product[cart.length*2];
			for(int i=0; i<cart.length;i++) {
				temp[i] = cart[i];
			}
			this.cart = temp;
		}
		cart[i++] = p;
	}

	void summary() {
		int sum = 0;
		System.out.print("구입한 물건:");
		for(int k=0; k<i; k++) {
			System.out.print(cart[k].toString()+",");
			sum += cart[k].price;
		}
		System.out.println();
		System.out.println("사용한 금액:"+sum);
		System.out.println("남은 금액:"+money);
	}
}

class Product {
	int price; // 제품의 가격

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}