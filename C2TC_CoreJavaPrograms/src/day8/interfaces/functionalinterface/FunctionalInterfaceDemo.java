package day8.interfaces.functionalinterface;

public class FunctionalInterfaceDemo {
	//Program to demonstrate FunctionalInterface
	
		public static void main(String[] args) {
			GreetClass g = new GreetClass();
			System.out.println(g.greet());

			//using Lambda Expression
			GreetInterface g1 = () -> {
				return "Good Afternoon";
			};

			System.out.println(g1.greet());

		}
	}


