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

	private static DbSingleton instance = null;
	private DbSingleton() {}
	public static DbSingleton getInstance() {
		if(instance == null) {
			synchronized(DbSingleton.class) {
				if(instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		
		return instance;
	}
	
