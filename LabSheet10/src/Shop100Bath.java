import javax.swing.*;
public class Shop100Bath {

	public static void main(String[] args) {
		
		Product sold = new Product();
		int buttonConfirm = JOptionPane.showConfirmDialog(null, "Patanakarn?");
		if(buttonConfirm == 0) {
			sold = new PattanakarnBranch();
		}
		
		int nimberofProduct = Integer.parseInt(JOptionPane.showInputDialog
				("Input the number of product;"));
		sold.setUnit(nimberofProduct);
		 JOptionPane.showMessageDialog(null, sold);
		

	}

}
