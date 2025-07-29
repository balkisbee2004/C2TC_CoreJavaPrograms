package day8.interfaces.instanceofinterface;

public class PhoneFactory {
	//Program to define factory method

		public static Phone createPhone(String company) {
			if (company.equalsIgnoreCase("Samsung"))
				return new Samsung();
			else if (company.equalsIgnoreCase("Jio"))
				return new Jio();
			return null;
		}
	

}
