
public class AnonymousDemo {
	public static void main(String[] args) {
		Greeting greeting = new Greeting() {
			
			@Override
			public String greet(String name) {
				return name;
			}
		};
		
		System.out.println(greeting.greet("Nikhil"));
	}

}
