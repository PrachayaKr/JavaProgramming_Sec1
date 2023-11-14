import java.util.*;//import for in put data from keyboard
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//Create class scanner for input data
		Scanner input = new Scanner(System.in);
        //display and input data
		System.out.print("Input product name   : ");
		String productName = input.nextLine();
		System.out.print("Input product unit   : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit : ");
		float priceperUnit = input.nextFloat();
		System.out.println();
		float totalPrice = productUnit*priceperUnit;
		System.out.println("Total Price is "+frm.format(totalPrice)+" Bath.");
		float vat = totalPrice+(totalPrice*7/100);
		System.out.println("Add VAT 7%  is "+frm.format(vat)+" Bath.");
	}

}
