package cooperationquiz;

public class Person {

	String personName;
	int money;
	
	public Person(String personName, int money) {
		this.personName = personName;
		this.money = money;
	}
	
	public void buyStarbucks(Starbucks starbucks) {
		starbucks.take(4000);
		this.money -= 4000;
	}
	
	public void buyCoffeeBean(CoffeeBean coffeeBean) {
		coffeeBean.take(4500);
		this.money -= 4500;
	}
	
	public void showInfo() {
		System.out.println(personName+ "´ÔÀÇ ³²Àº µ·Àº " + money + "¿ø ÀÔ´Ï´Ù");
	}
	
	
	
	
	
}
