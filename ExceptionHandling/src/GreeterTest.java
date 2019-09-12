import com.xoriant.nikhil.*;
public class GreeterTest {
	public static void main(String[] args) {
		Greeter greeter = new Greeter("Nikhil");
		System.out.println(greeter.sayHello());
		Advisor advisor = new Advisor();
		System.out.println(advisor.getAdvice());
		greeter.goodBye();
	}

}
