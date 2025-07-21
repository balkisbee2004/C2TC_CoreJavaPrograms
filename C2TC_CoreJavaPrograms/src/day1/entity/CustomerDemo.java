package day1.entity;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer c1= new Customer();
		c1.cid=101;
		c1.name="Balkis";
		c1.city="Puducherry";
		System.out.println("Customer id: "+c1.cid);
		System.out.println("Customer name: "+c1.name);
		System.out.println("Customer city: "+c1.city);
		
		Customer c2= new Customer();
		c2.cid=101;
		c2.name="Muffitha";
		c2.city="Chennai";
		System.out.println("Customer id: "+c2.cid);
		System.out.println("Customer name: "+c2.name);
		System.out.println("Customer city: "+c2.city);
				
		Customer c3= new Customer();
		c3.cid=101;
		c3.name="laks";
		c3.city="Andhra";
		System.out.println("Customer id: "+c3.cid);
		System.out.println("Customer name: "+c3.name);
		System.out.println("Customer city: "+c3.city);
	}
	
	

}
