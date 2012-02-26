public class Singleton{
    private static Singleton singleton = new Singleton();
    private Singleton(){
	System.out.println("Instance maked.");
    }
    public static Singleton getInstance(){
	return singleton;
    }
}