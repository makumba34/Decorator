public class Cream extends Extra {
	public Cream(Drink drink) {
		super(drink);
	}
	
	public int getCost() {
		return drink.getCost() + 3;
	}
}