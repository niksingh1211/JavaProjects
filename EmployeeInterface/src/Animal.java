
public interface Animal {
	public void eat();
	public void speak();

	public default void walk() {
		System.out.println("Walk using F O U R L E G S.");
	}
}
