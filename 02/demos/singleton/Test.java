public class Test {

	public static void main(String args[]) {
		Singleton instance = Singleton.getInstance();
                System.out.println(instance);
		Singleton anotherInstance = Singleton.getInstance();
		if(instance == anotherInstance) {
			System.out.println("They are the same instance");
		}
		
	}
}
class Singleton {

	private static volatile  Singleton instance = null;
	private Singleton() {
	  if(instance != null)
		  throw new RuntimeException("use getInstance() !");
	}
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
				}
                return instance;
	}
}
	
