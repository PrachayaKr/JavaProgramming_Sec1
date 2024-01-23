
public class TestCustomer {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		 Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		 // Customer's toString()
		 System.out.println(c1);
		 // set customer's discount is 5
		 c1.setDiscount(5);;
		 // Customer's toString()
		 System.out.println(c1);

		 Line();
		 // show customer's id
		 System.out.println("id is: "+c1.getID());
		 // show customer's name
		 System.out.println("name is: "+c1.getName());
		 // show customer's discount
		 System.out.println("discount is: "+c1.getDiscount());
		 Line();
		 System.out.println("###Test Invoice class###");
		 Invoice inv1 = new Invoice(101, c1, 12000.00);
		 // Invoice's toString()
		 System.out.println(inv1);
		 // set invoice's amount is 10000
		 inv1.setAmount(10000);
		 // Invoice's toString()
		 System.out.println(inv1);

		 Line();
		 // show invoice's id
		 System.out.println("id is: "+inv1.getID());
		 // Customer's toString() by instance inv1
		 System.out.println("name is: "+c1);
		 // show invoice's amount
		 System.out.println("amount is: "+inv1.getAmount());
		 Line();
		 // show customer's id by instance inv1
		 System.out.println("Customer's id is: "+inv1.getID());
		 // show customer's name by instance inv1
		 System.out.println("Customer's name is: "+c1.getName());
		 // show customer's discount by instance inv1
		 System.out.println("Customer's id is: "+c1.getDiscount());
		 // show invoice's amount after discount(format as output)
		 System.out.println("Amount after discont is: "+inv1.getAmountAfterDiscount());
		 } //end of main method()
		 public static void Line() {
			 System.out.println("****************************************");
		 }

	

 }

