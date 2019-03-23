public class Sugar extends Extra {
	public Sugar(Drink drink) {
		super(drink); //super oznacza ze ma wywolac konstruktor z klasy bazowej
	}
	
	public int getCost() {
		return drink.getCost() + 2;
	}
}