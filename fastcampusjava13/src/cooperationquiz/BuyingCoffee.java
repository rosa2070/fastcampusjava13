package cooperationquiz;

public class BuyingCoffee {

	public static void main(String[] args) {
		Person personKim = new Person("Kimjollyu", 10000);
		Person personLee = new Person("Leepigon", 10000);
		
		Starbucks starbucks = new Starbucks("americano");
		CoffeeBean coffeeBean = new CoffeeBean("latte");
		
		personKim.buyStarbucks(starbucks);
		personLee.buyCoffeeBean(coffeeBean);
		
		personKim.showInfo();
		personLee.showInfo();
		
		starbucks.showStarbucksInfo();
		coffeeBean.showCoffeeBeanInfo();
	}

}
