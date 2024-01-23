
public class Invoice {

	private int id;
	private Customer customer;
	private double amount;
	
	//Constructor
	Invoice(int id ,Customer customer,double amount){
		this.id=id;
		this.customer=customer;
		this.amount=amount;
	}
	public int getID() {
		return this.id;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	public double getAmount() {
		return this.amount-this.amount*this.getCustomerDiscount()/100;
	}
	public void setAmount(double amount) {
		this.amount=amount;
	}
	public int getCustomerID() {
		return customer.getID();
	}
	public String getCustomerName() {
		return customer.getName();
	}
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}
	public double getAmountAfterDiscount() {
		return amount-customer.getDiscount();
	}
	public String toString() {
		return "Invoice[id = "+id+","+"customer = "+customer.getName()+"("+id+")"+"("
	+customer.getDiscount()+")"+","+"amount =  "+getAmountAfterDiscount()+"]";
	}
}
