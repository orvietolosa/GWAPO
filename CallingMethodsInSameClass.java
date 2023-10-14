public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("GOOD DAY!");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}