package cooperationquiz;

public class CoffeeBean {
	
	String coffeeName;
	int customerCount;
	int money;
	
	public CoffeeBean(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	
	public void take(int money) { 
		this.money += money;
		customerCount++;
	}
		
	public void showCoffeeBeanInfo() {
		System.out.println("Ŀ�Ǻ��� ���� �մ���" + customerCount + "�� �̰�, ������ " + money + "�Դϴ�");
	}
		
	
	

}
