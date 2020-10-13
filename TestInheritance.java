package inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		Children child1 = new Children();
		child1.athletic();
		child1.skinColor();
		child1.heights();
		
		GreatChildren child2 = new GreatChildren();
		child2.skinColor();
		
		GreatGrandChildren child3 = new GreatGrandChildren();
		child3.skinColor();

	}

}
