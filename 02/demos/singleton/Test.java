public class Test {

	public static void main(String args[]) {
		
		Runtime singletonRuntime = Runtime.getRuntime();

		singletonRuntime.gc();
		
		System.out.println(singletonRuntime);
		
		Runtime anotherInstance = Runtime.getRuntime();
		
		System.out.println(anotherInstance);
		
		if(singletonRuntime == anotherInstance) {
			System.out.println("They are the same instance");
		}
		
	}
}
class DbSingleton {

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
	
