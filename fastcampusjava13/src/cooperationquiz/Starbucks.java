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
		System.out.println("��Ÿ������ ���� �մ���" + customerCount + "�� �̰�, ������ " + money + "�Դϴ�");
	}

}
