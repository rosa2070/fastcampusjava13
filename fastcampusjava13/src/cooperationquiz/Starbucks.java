package cooperationquiz;

public class Starbucks {

	String coffeeName;
	int customerCount;
	int money;
	
	public Starbucks(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	
	public void take(int money) { 
		this.money += money;
		customerCount++;
	}
	
	public void showStarbucksInfo() {
		System.out.println("스타벅스의 오늘 손님은" + customerCount + "명 이고, 수입은 " + money + "입니다");
	}

}
