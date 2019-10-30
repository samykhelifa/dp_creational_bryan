public class Test {

	public static void main(String args[]) {
		Singleton instance = Singleton.getInstance();
                System.out.println(anotherInstance);
		Singleton anotherInstance = Singleton.getInstance();
		if(instance == anotherInstance) {
			System.out.println("They are the same instance");
		}
		
	}
}
class Singleton {

	private static Singleton instance = null;
	private Singleton() {}
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
				}
                return instance;
	}
}
	
