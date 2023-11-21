import javax.swing.*;
import java.text.*;
public class Example1 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustormer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		double discount,totalPrice=0;
		totalPrice = BUFFET * numberofCustormer;
        //using Confirm dialog box
		int member;
		do {
			member = JOptionPane.showConfirmDialog(null,"Total price is "+ frm.format(totalPrice) +" baht"+"\nDo you have a member card?");
		}while(member==JOptionPane.CANCEL_OPTION);
		if(member == JOptionPane.YES_OPTION) {
			//discount = totalPrice - (totalPrice*10/100)
			discount=totalPrice*90/100;
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+ frm.format(discount) + " bath.");
		}
		else if(member == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+ frm.format(totalPrice) + " bath.");
		}
		/*else{
			
			member = JOptionPane.showConfirmDialog(null,"Total price is "+ frm.format(totalPrice) +" baht"+"\nDo you have a member card?");
		}*/
	
	}
}
