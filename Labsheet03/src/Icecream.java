import javax.swing.*;

public class Icecream {

	public static void main(String[] args) {
		int flavor;
		int Vanilla = 10;
		int Chocolate=15;
		do {
		 flavor = Integer.parseInt(JOptionPane.showInputDialog("[1] Vanilla Flavor 10 B."+"\n[2] Chocolate Flavor 15 B."
		+"\nPress number to choose flavor:"));
		 if(flavor!=1||flavor!=2) {
			 JOptionPane.showMessageDialog(null, "ERROR:Wrong choice! "+"\nTry agian....","ERROR",JOptionPane.ERROR_MESSAGE);
		 }
		}while(flavor!=1||flavor!=2);
		int topping;
		topping = JOptionPane.showConfirmDialog(null, "Do you want topping?");
	}

}
