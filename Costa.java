public class Costa {
	public static void main (String [] args)  {
		Drink tc = new TurkishCoffee();
		Drink dc = new DecafCoffee();
		System.out.println(tc.toString() + " " + tc.getCost() + " zlotych");
		System.out.println(dc.toString() + " " + dc.getCost() + " zlotych");
		
		tc = new Sugar(tc); //tc = new Cream(tc);
		dc = new Sugar(dc);
		System.out.println("Kawa czarna z cukrem " + tc.getCost() +  " zlotych");
		System.out.println("Kawa bezkofeinowa z cukrem " + dc.getCost() + " zlotych");

		
		tc = new Cream(tc);
		dc = new Cream(dc);
		System.out.println("Kawa z cukrem i smietanka " + tc.getCost() + " zlotych");
		System.out.println("Kawa bezkofeinowa z cukrem i smietanka " + dc.getCost() + " zlotych");
	}
}