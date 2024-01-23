
public class Customer {

	private int id;
	private String name;
	private int discount;

	Customer(int id , String name ,int discount){
		this.id=id;
		this.name=name;
		this.discount=discount;
	}
	
	//get method
    public int getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getDiscount() {
		return discount;
	}
	
	//Set method
	public void setDiscount(int discount) {
		this.discount=discount;
	}
	//toString method
	public String toString() {
		return name+"("+id+")"+"("+discount+"%)";
	}
}
