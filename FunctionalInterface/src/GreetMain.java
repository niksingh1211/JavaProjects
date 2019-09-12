
public class GreetMain {
	public static void main(String[] args) {
//		Greeting greet1 = (name)-> System.out.println("Hello "+name);
//		greet1.greet("Nkhil");
		
		Greeting greet2 = (name)-> {return ("Hi "+name);};
		System.out.println(greet2.greet("Nik"));
		
//		Greeting greet2 = ()-> System.out.println("World");
//		greet2.greet();
//		System.out.println(greet2.getClass().getName());
	}

}
