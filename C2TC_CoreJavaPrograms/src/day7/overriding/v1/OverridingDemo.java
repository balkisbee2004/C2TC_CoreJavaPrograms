package day7.overriding.v1;

public class OverridingDemo {
	//Program to demonstrate method overriding - Runtime Polymorphism


		public static void main(String[] args) {
			RBI rbi;

//			Dynamic binding assigning child class object to parent class reference variable.
			rbi = new SBI();
			System.out.println(rbi.getRateOfInterest());

			rbi = new ICICI();
			System.out.println(rbi.getRateOfInterest());

			rbi = new HDFC();
			System.out.println(rbi.getRateOfInterest());

		}

	

}
