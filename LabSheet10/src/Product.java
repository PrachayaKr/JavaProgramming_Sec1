
public class Product {

	private int unit;
	
	//Set Method
	public void setUnit(int unit) {
		this.unit=unit;
	}
	
	//Get Method
	public int getUnit() {
		return this.unit;
	}
	public int getTotalprice() {
		return this.unit*100;
	}
	
	//toString Method
	public String toString() {
		return "You buy "+unit+" units "+"("+getTotalprice()+").";
	}
}
