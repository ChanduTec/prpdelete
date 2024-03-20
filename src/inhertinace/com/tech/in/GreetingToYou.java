package inhertinace.com.tech.in;

public class GreetingToYou {
	Welcome welcome = new Welcome();
	HelloWorldJava helloWorldJava = null;
//	HelloWorldJava helloWorldJava = new HelloWorldJava();

	public void c1() {
		System.out.println("I am inside the c1() in the GreetingToYou class");
		welcome.data();
	}

	public void c2(HelloWorldJava helloWorldJava) {
		System.out.println("  my hashcode ");
		System.out.println(helloWorldJava.hashCode());
		System.out.println("************************");
		System.out.println("I am inside the c2() in the GreetingToYou class");
		helloWorldJava.h1();
		System.out.println(helloWorldJava.s);
		helloWorldJava.s = 22;
		helloWorldJava.h2();
		helloWorldJava.h3();
	}

	public void c3() {
		System.out.println("I am inside the c3() in the GreetingToYou class");
		welcome.hi();
	}

	public static void main(String[] args) {
		// GreetingToYou greetingToYou = new GreetingToYou();
		// greetingToYou.c2(new HelloWorldJava());
		int num = 36;
		num = num % 6;
		System.out.println(num);

		int Integer = 36;
		String String = "chandu";
		System.out.println(String + Integer);

	}
}
