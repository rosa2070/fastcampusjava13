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
		System.out.println("커피빈의 오늘 손님은" + customerCount + "명 이고, 수입은 " + money + "입니다");
	}
		
	
	

}
