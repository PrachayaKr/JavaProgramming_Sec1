import javax.swing.*;//import library for input data from dialog box
import java.text.*;
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String productName =JOptionPane.showInputDialog("Input product name: ");
        
		/*String strUnit = JOptionPane.showInputDialog("Input product unit : ");
		//convert string to int
		int productUnit = Integer.parseInt(strUnit);*/
		
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input product unit : "));
		
		String priceUnit = JOptionPane.showInputDialog("Input price per unit :");
		float priceperUnit = Float.parseFloat(priceUnit);
		//calculate of total price
		float totalPrice = productUnit*priceperUnit;
		//display data to dialog box
		float vat = totalPrice+(totalPrice*7/100);
		JOptionPane.showMessageDialog(null, "Total Price is "+frm.format(totalPrice) + " bath."
				+ "\nAdd VAT 7% is "+frm.format(vat)+" bath.");
	}

}
